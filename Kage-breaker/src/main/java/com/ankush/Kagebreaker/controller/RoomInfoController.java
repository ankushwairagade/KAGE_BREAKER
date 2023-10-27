package com.ankush.Kagebreaker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankush.Kagebreaker.entities.RoomInfo;
import com.ankush.Kagebreaker.service.serviceImple.RoomInfoServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/roominfo")
@Slf4j
public class RoomInfoController {

	@Autowired
	private RoomInfoServiceImpl roomInfoServiceImpl;

	@GetMapping("/getRoomInfo")
	public ResponseEntity<?> getUserById(@PathVariable("roomId") Integer roomId) {
		RoomInfo roomInfo = null;
		try {
			roomInfo = roomInfoServiceImpl.getRoomInfoById(roomId);
		} catch (Exception e) {
			log.error("getUserById () method failed to execute", e);
		}
		return new ResponseEntity<RoomInfo>(roomInfo, roomInfo == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
	}
	
    @GetMapping("/getAllRoomInfo")
    public ResponseEntity<?> getAllRoomInfo() {
        List<RoomInfo> roomInfoList = null;
        try {
        	roomInfoList =  roomInfoServiceImpl.getAllRoomInfoList();
        } catch (Exception e) {
            log.error("getAllUser () method failed to execute", e);
        }
        return new ResponseEntity<List<RoomInfo>>(roomInfoList, roomInfoList == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
    }
	
	

}