package com.ankush.Kagebreaker.service;

import java.util.List;

import com.ankush.Kagebreaker.entities.RoomInfo;

public interface RoomInfoService {

	RoomInfo createRoomInfo(RoomInfo RoomInfo);

	RoomInfo updateRoomInfo(RoomInfo RoomInfo, Integer id);

	RoomInfo getRoomInfoById(Integer RoomInfoId);

	List<RoomInfo> getAllRoomInfoList();
	
}
