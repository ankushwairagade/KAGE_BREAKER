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
	public RoomInfo createRoomInfo(RoomInfo roomInfo) {
		// TODO Auto-generated method stub
		return roomInfoRepo.save(roomInfo);
	}



	@Override
	public List<RoomInfo> getAllRoomInfoList() {
		// TODO Auto-generated method stub
		return roomInfoRepo.findAll();
	}



	@Override
	public RoomInfo updateRoomInfo(RoomInfo roomInfo, Integer id) {
		// TODO Auto-generated method stub
		return roomInfoRepo.save(roomInfo);
	}



	@SuppressWarnings("deprecation")
	@Override
	public RoomInfo getRoomInfoById(Integer roomInfoId) {
		// TODO Auto-generated method stub
		return roomInfoRepo.getById(roomInfoId);
	}

}
