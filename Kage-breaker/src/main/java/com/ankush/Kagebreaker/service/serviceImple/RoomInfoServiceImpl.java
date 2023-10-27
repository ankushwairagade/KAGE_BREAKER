package com.ankush.Kagebreaker.service.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankush.Kagebreaker.entities.RoomInfo;
import com.ankush.Kagebreaker.repositories.RoomInfoRepo;
import com.ankush.Kagebreaker.service.RoomInfoService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RoomInfoServiceImpl implements RoomInfoService {

	@Autowired
	private RoomInfoRepo roomInfoRepo;

	@Override
	public RoomInfo createRoomInfo(RoomInfo RoomInfo) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<RoomInfo> getAllRoomInfoList() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public RoomInfo updateRoomInfo(RoomInfo RoomInfo, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public RoomInfo getRoomInfoById(Integer RoomInfoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
