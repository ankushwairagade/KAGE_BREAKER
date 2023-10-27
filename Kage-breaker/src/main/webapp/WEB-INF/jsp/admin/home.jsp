<!DOCTYPE html>
<%@page import="com.ankush.Kagebreaker.entities.RoomInfo"%>
<%@page import="java.util.List"%>
<html lang="en">
  <head>
    <style type="text/css">
		body .select2-drop {
	    	z-index: 10052;
		}
		label{
			color:#838FA1;
			font-weight: 600;
		}
		button{
			box-shadow:none !important;
		}
		.alert-success {
		    background-color: #32c5d2;
		    border-color: #32c5d2;
		    color: #ffffff;
		    box-shadow:none;
		    font-variant: small-caps;
		}
		.alert .close {
		    filter: invert();
	        margin-top: 4px;
		}
		span.error{
			font-size:12px;
			color: #f13e64;
			
		}
		.escalation-title{
			font-size: 30px;
		    background-color: #32c5d2!important;
		    color: #fff !important;
		    padding: 10px !important;
		    text-align: center;
		}
		.escalation-title>i{
		    background: #32c5d2!important;
		    color: #fff;
			font-size: 15px;
			margin-top: 1px;
			margin-right: 5px;
			text-align: center;
		}
		.tooltip{
			z-index: 10052;
		}
		.tooltip.bottom .tooltip-arrow{
			border-bottom-color: #8E44AD;
		}
		.tooltip-inner {
		    padding: 5px 10px;
		    background-color: #8E44AD;
		    border-radius: 0px;
		    max-width: 400px !important;
		}
		.font-purple{
			color:#8E44AD !important;
		}
		.form-control{
			border-radius:0px;
		}
		.outline{
			background: transparent;
			color: #6f6e6e;
			border: 1px solid #e3e3e3;
			border-width: 1px !important;
		}
		.outline:focus{
			color: #6f6e6e;
		}
		.outline-green:hover{
			background:#32c5d2!important;
			color: #fff;
			border-color: #32c5d2!important;
		}
		.outline-red:hover{
			background:#EF4836!important;
			color: #fff;
			border-color: #EF4836!important;
		}
		.portlet {
		   box-shadow: 0 2px 3px rgba(0, 0, 0, 0.1);
		}
		.page-title>h1,ul.breadcrumb{
		    font-variant: small-caps;
		}
		.bg-white{
			background: #fff;
		}
		.btn.btn-outline.green {
		    border : 1px solid !important;
		    border-color: #32c5d2;
		    color: #32c5d2;
		    background: 0 0;
		} 
		.btn.btn-outline.green:hover {
		    border-color: #32c5d2;
		    color: #FFF;
		    background-color: #32c5d2;
		}
		.mt-element-step .step-thin .mt-step-col {
		    padding-top: 10px;
		    padding-bottom: 10px
		}
		.mt-element-step .step-thin .mt-step-number {
		    font-size: 26px;
		    border-radius: 50%!important;
		    float: left;
		    margin: auto;
		    padding: 3px 14px
		}
		.mt-element-step .step-thin .mt-step-title {
		    font-size: 24px;
		    padding-left: 60px;
		    margin-top: -4px;
		    font-variant:small-caps;
		    font-weight: 600;
		}
		.mt-element-step .step-thin .mt-step-content {
		    padding-left: 60px;
		    margin-top: -5px;
		    font-variant: small-caps;
   			font-weight: 700;
		}
		.mt-element-step .step-thin .active {
		    background-color: #32c5d2!important
		}
		
		.mt-element-step .step-thin .active .mt-step-number {
		    color: #32c5d2!important
		}
		.mt-element-step .step-thin .active .mt-step-content,.mt-element-step .step-thin .active .mt-step-title {
		    color: #fff!important
		}
		.mt-element-step .step-thin .done {
		    background-color: #26C281!important
		}
		.mt-element-step .step-thin .done .mt-step-number {
		    color: #26C281!important
		}
		.mt-element-step .step-thin .done .mt-step-content,.mt-element-step .step-thin .done .mt-step-title {
		    color: #fff!important
		}
		.bootstrap-switch,.bootstrap-switch-container,.bootstrap-switch-handle-on,.bootstrap-switch-handle-off{
			border-radius:0px !important;
		}
		.select2-container-multi .select2-choices {
		    border-radius: 0px !important;
		}
		.select2-drop-active {
		    border: 1px solid #e5e5e5 !important;
		    border-radius: 0px !important;
		}
		.select2-drop.select2-drop-above.select2-drop-active{
			 border: 1px solid #e5e5e5 !important;
			 border-radius: 0px !important;
		}
		.select2-container-active .select2-choice,.select2-container-active .select2-choices{
			 border: 1px solid #e5e5e5 !important;
			 border-radius: 0px !important;
		}
		.select2-dropdown-open.select2-drop-above .select2-choice, .select2-dropdown-open.select2-drop-above .select2-choices{
			 border: 1px solid #e5e5e5 !important;
			 border-radius: 0px !important;
		}
		.select2-container-multi.select2-container-active .select2-choices {
			 border: 1px solid #e5e5e5 !important;
			 border-radius: 0px !important;
		}
		.center-horizontal {
  		margin-left: auto;
 		margin-right: auto;
		}
		.center-vertical {
  		display: flex;
  		align-items: center;
		}
		.center-text {
  		text-align: center;
	}
	.grid {
      display: flex;
      flex-wrap: wrap;
      justify-content: space-between;
    }
    .grid-item {
      width: calc(33.33% - 10px); /* 33.33% for 3 items, minus some spacing */
      margin: 5px; /* Add some spacing between items */
      background-color: #f0f0f0;
      padding: 10px;
      text-align: center;
    }
    .col-md-3 {
  width: 25%; /* Custom width for medium-sized screens */
  background-color: #f0f0f0; /* Custom background color */
  padding: 10px; /* Custom padding */
  /* Add any other custom styles here */
}

.col-md-12 {
  background-color: #f0f0f0; /* Custom background color */
  padding: 10px; /* Custom padding */
  /* Add any other custom styles here */
}
	</style>
  </head>
	
  <body >
<h1class="text-center">Conference Room Management System</h1>
        
            <%
            List<RoomInfo> roomList = request.getAttribute("ROOM_LIST")!=null?(List<RoomInfo>)request.getAttribute("ROOM_LIST"):null; 
            %>
          	
                		<div class="row col-md-12">
                  			<h1 class="escalation-title  text-center">All Room in your organization</small></h1>
               			</div>
               			<div class="grid">
	                  		<%if(roomList != null && !roomList.isEmpty()){%>
					        <%for (RoomInfo roomInfo : roomList) {%>
					        	 <div class="grid-item">
					        	 	<button type="button" class="btn btn-primary" style="width: 100%;" onclick="reLoadResource('<%=roomInfo.getRoomName()%>')"><%=roomInfo.getRoomName()%></button>
					        	 </div>
					        <%} }%>
					       </div>  
        	
        	
        	
 <div class="grid">
    <div class="grid-item">Item 1</div>
    <div class="grid-item">Item 2</div>
    <div class="grid-item">Item 3</div>
    <div class="grid-item">Item 4</div>
    <div class="grid-item">Item 5</div>
    <div class="grid-item">Item 6</div>
    <div class="grid-item">Item 7</div>
    <div class="grid-item">Item 8</div>
    <div class="grid-item">Item 9</div>
  </div>
        	
        	
        <form id="frmSubmit" action="system-cache-init" method="post">
           	<input type="hidden" name="resource_key" id="resource_key" />
        </form>
    <script type="text/javascript">
    function reLoadResource(keyName){
 		$("#resource_key").val(keyName);
 		$("#title_reload").html("Reload "+keyName+" Cache Confirmation");
 		$("#reload_confirmation").modal();
 	}
    function reLoadResourceConfirm(){
 		//$("#resource_key").val(keyName);
 		$("#frmSubmit").submit();
 	}
    </script>
        <script src="/static/vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="/static/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="/static/vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="/static/vendors/nprogress/nprogress.js"></script>
    <!-- Chart.js -->
    <script src="/static/vendors/Chart.js/dist/Chart.min.js"></script>
    <!-- gauge.js -->
    <script src="/static/vendors/gauge.js/dist/gauge.min.js"></script>
    <!-- iCheck -->
    <script src="/static/vendors/iCheck/icheck.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="/static/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="/static/vendors/iCheck/icheck.min.js"></script>
    <!-- Skycons -->
    <script src="/static/vendors/skycons/skycons.js"></script>
    <!-- Flot -->
    <script src="/static/vendors/Flot/jquery.flot.js"></script>
    <script src="/static/vendors/Flot/jquery.flot.pie.js"></script>
    <script src="/static/vendors/Flot/jquery.flot.time.js"></script>
    <script src="/static/vendors/Flot/jquery.flot.stack.js"></script>
    <script src="/static/vendors/Flot/jquery.flot.resize.js"></script>
    <!-- Flot plugins -->
    <script src="/static/vendors/flot.orderbars/js/jquery.flot.orderBars.js"></script>
    <script src="/static/vendors/flot-spline/js/jquery.flot.spline.min.js"></script>
    <script src="/static/vendors/flot.curvedlines/curvedLines.js"></script>
    <!-- DateJS -->
    <script src="/static/vendors/DateJS/build/date.js"></script>
    <!-- JQVMap -->
    <script src="/static/vendors/jqvmap/dist/jquery.vmap.js"></script>
    <script src="/static/vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
    <script src="/static/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="/static/vendors/moment/min/moment.min.js"></script>
    <script src="/static/vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
    
    <!-- bootstrap-wysiwyg -->
    <script src="/static/vendors/bootstrap-wysiwyg/js/bootstrap-wysiwyg.min.js"></script>
    <script src="/static/vendors/jquery.hotkeys/jquery.hotkeys.js"></script>
    <script src="/static/vendors/google-code-prettify/src/prettify.js"></script>
    <!-- jQuery Tags Input -->
    <script src="/static/vendors/jquery.tagsinput/src/jquery.tagsinput.js"></script>
    <!-- Switchery -->
    <script src="/static/vendors/switchery/dist/switchery.min.js"></script>
    <!-- Select2 -->
    <script src="/static/vendors/select2/dist/js/select2.full.min.js"></script>
    <!-- Parsley -->
    <script src="/static/vendors/parsleyjs/dist/parsley.min.js"></script>
    <!-- Autosize -->
    <script src="/static/vendors/autosize/dist/autosize.min.js"></script>
    <!-- jQuery autocomplete -->
    <script src="/static/vendors/devbridge-autocomplete/dist/jquery.autocomplete.min.js"></script>
    <!-- starrr -->
    <script src="/static/vendors/starrr/dist/starrr.js"></script>
    
    <!-- Datatables -->
    <script src="/static/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="/static/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="/static/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="/static/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="/static/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="/static/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="/static/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="/static/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="/static/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="/static/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="/static/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="/static/vendors/jszip/dist/jszip.min.js"></script>
    <script src="/static/vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="/static/vendors/pdfmake/build/vfs_fonts.js"></script>
    
    <script type="text/javascript" src="/static/assets/clockpicker/bootstrap-clockpicker.min.js?v=1.2"></script>
    
    <script type="text/javascript" src="/static/assets/jquery-validation/js/jquery.validate.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script src="/static/build/js/custom.js"></script>
    <script src="/static/build/js/common.js"></script>
  </body>
</html>
