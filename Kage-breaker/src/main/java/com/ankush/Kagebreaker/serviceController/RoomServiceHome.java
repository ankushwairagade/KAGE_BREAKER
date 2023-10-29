package com.ankush.Kagebreaker.serviceController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ankush.Kagebreaker.entities.RoomInfo;
import com.ankush.Kagebreaker.entities.RoomReservationDetail;
import com.ankush.Kagebreaker.service.RoomInfoService;
import com.ankush.Kagebreaker.service.RoomReservationDetailsService;

@Controller
@RequestMapping("admin")
public class RoomServiceHome {

	@Autowired
	RoomReservationDetailsService roomReservationDetailsService;
	@Autowired
	RoomInfoService roomInfoService;
	
	@RequestMapping(value = "/")
	public ModelAndView defaultPage(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("redirect:/admin/home");
	}
	
	@RequestMapping(value = "home")
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response) {
		List<RoomReservationDetail> roomReservationInfo = roomReservationDetailsService.getAllRoomReservationDetailList();
		List<RoomInfo> roomInfoList = roomInfoService.getAllRoomInfoList();
		request.setAttribute("ROOM_RESERVATION_INFO", roomReservationInfo);
		request.setAttribute("ROOM_LIST", roomInfoList);
		ModelAndView model = new ModelAndView();
		model.setViewName("admin/home");
		return model;
	}
}
