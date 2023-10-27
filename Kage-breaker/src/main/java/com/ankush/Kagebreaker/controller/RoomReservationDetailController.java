package com.ankush.Kagebreaker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankush.Kagebreaker.entities.RoomReservationDetail;
import com.ankush.Kagebreaker.service.serviceImple.RoomReservationDetailServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/roomreservationdetail")
@Slf4j
public class RoomReservationDetailController {

	@Autowired
	private RoomReservationDetailServiceImpl roomReservationDetailServiceImpl;
	
	@PostMapping("/saveRoomReservationDetail")
	public ResponseEntity<?> saveRoomInfo(@RequestBody RoomReservationDetail reservationDetail) {
		RoomReservationDetail createRoomReservationDetail = null;
		try {
			createRoomReservationDetail = roomReservationDetailServiceImpl.createRoomReservationDetail(reservationDetail);
		} catch (Exception e) {
			log.error("saveUser() method failed to execute", e);
		}
		return new ResponseEntity<RoomReservationDetail>(createRoomReservationDetail, createRoomReservationDetail == null ? HttpStatus.BAD_REQUEST : HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getRoomInfo/{roomReservationDetailId}")
	public ResponseEntity<?> getUserById(@PathVariable("roomReservationDetailId") Integer roomReservationDetailId) {
		Optional<RoomReservationDetail> roomInfo = null;
		try {
			roomInfo = roomReservationDetailServiceImpl.getRoomReservationDetailById(roomReservationDetailId);
		} catch (Exception e) {
			log.error("getUserById () method failed to execute", e);
		}
		return new ResponseEntity<RoomReservationDetail>(roomInfo.get(),
				roomInfo == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
	}

	@GetMapping("/getAllRoomInfo")
	public ResponseEntity<?> getAllRoomInfo() {
		List<RoomReservationDetail> roomInfoList = null;
		try {
			roomInfoList = roomReservationDetailServiceImpl.getAllRoomReservationDetailList();
		} catch (Exception e) {
			log.error("getAllUser () method failed to execute", e);
		}
		return new ResponseEntity<List<RoomReservationDetail>>(roomInfoList,
				roomInfoList == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
	}

}
