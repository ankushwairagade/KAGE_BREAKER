	$(function(){
			 $('.btn-file :file').on('fileselect', function(event, numFiles, label) {
			        
			        var input = $(this).parents('.input-group').find(':text'),
			            log = numFiles > 1 ? numFiles + ' files selected' : label;
			        console.log(input);
			        if( input.length ) {
			            input.val(log);
			        } 
			        
			    });
				$(document).on('change', '.btn-file :file', function() {
					  var input = $(this),
					  numFiles = input.get(0).files ? input.get(0).files.length : 1,
					  label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
					  selectFile(input, numFiles , label);
					 
					
				});
				
		});
		
		function selectFile(input1, numFiles, label) {
	        var input =input1.parents('.input-group').find(':text'),
	            log = numFiles > 1 ? numFiles + ' files selected' : label;
	        console.log(input);
	        if( input.length ) {
	            input.val(log);
	        } 
		}

	function selectBoxInit(id){
		 $(id).select2({
			 placeholder: "Select...",
			 allowClear: true
		 });
	} 

	//Select Box assign value

	function selectBoxAssign(id,value){
		 $(id).select2("val", value);
	} 
	
	function checkBoxInit(id){
		$(id).iCheck({
            checkboxClass: 'icheckbox_flat-green',
            radioClass: 'iradio_flat-green'
        });
	}
	
	function checkBoxUpdate(id){
		$(id).iCheck('update');
	}
	
	function showLoader(){
		$("#sys_loader_").fadeIn();
	}
	
	function hideLoader(){
		$("#sys_loader_").hide();
	}
	
	function initDatePicker(id){
		$(id).daterangepicker({
		      singleDatePicker: true,
		      calender_style: "picker_4",
		      startDate:$(this.element).val(),
	    }, function(start, end, label) {
		      
	    });
	}
	
	function initClockPicker(id){
		$(id).clockpicker({
			donetext :'Done',
			twelvehour:true
		});
	}
	
	function getCenterPostionForJsPDF(doc,text,fontSize){
  		var txtWidth = doc.getStringUnitWidth(text) * fontSize / doc.internal.scaleFactor;
	    var xOffset = (doc.internal.pageSize.width / 2) - (txtWidth/2); 
	    return xOffset;
	}
	
	function successNotification(titleStr,messageStr){
		new PNotify({
            title: titleStr,
            text: messageStr,
            type: 'success',
            styling: 'bootstrap3'
        });
	}
	
	function errorNotification(titleStr,messageStr){
		new PNotify({
            title: titleStr,
            text: messageStr,
            type: 'error',
            styling: 'bootstrap3'
        });
	}
	
	function regularNotification(titleStr,messageStr){
		new PNotify({
            title: titleStr,
            text: messageStr,
            styling: 'bootstrap3'
        });
	}
	