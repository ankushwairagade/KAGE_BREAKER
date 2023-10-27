package com.ankush.Kagebreaker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankush.Kagebreaker.entities.RoomInfo;
import com.ankush.Kagebreaker.entities.RoomReservationDetail;
import com.ankush.Kagebreaker.service.serviceImple.RoomInfoServiceImpl;
import com.ankush.Kagebreaker.service.serviceImple.RoomReservationDetailServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/roomreservationdetail")
@Slf4j
public class RoomReservationDetailController {

	
	
	
	@Autowired
	private RoomReservationDetailServiceImpl roomReservationDetailServiceImpl;

	@GetMapping("/getRoomInfo")
	public ResponseEntity<?> getUserById(@PathVariable("roomId") Integer roomId) {
		Optional<RoomReservationDetail> roomInfo = null;
		try {
			roomInfo = roomReservationDetailServiceImpl.getRoomReservationDetailById(roomId);
		} catch (Exception e) {
			log.error("getUserById () method failed to execute", e);
		}
		return new ResponseEntity<RoomReservationDetail>(roomInfo.get(), roomInfo == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
	}
	
    @GetMapping("/getAllRoomInfo")
    public ResponseEntity<?> getAllRoomInfo() {
        List<RoomReservationDetail> roomInfoList = null;
        try {
        	roomInfoList =  roomReservationDetailServiceImpl.getAllRoomReservationDetailList();
        } catch (Exception e) {
            log.error("getAllUser () method failed to execute", e);
        }
        return new ResponseEntity<List<RoomReservationDetail>>(roomInfoList, roomInfoList == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
    }
	
	
}
