package com.ankush.Kagebreaker.service.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankush.Kagebreaker.entities.RoomReservationDetail;
import com.ankush.Kagebreaker.repositories.RoomInfoRepo;
import com.ankush.Kagebreaker.service.RoomReservationDetailsService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RoomReservationDetailServiceImpl implements RoomReservationDetailsService {

	@Autowired
	private RoomInfoRepo roomInfoRepo;

	@Override
	public RoomReservationDetail createRoomReservationDetail(RoomReservationDetail RoomReservationDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomReservationDetail> getAllRoomReservationDetailList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomReservationDetail updateRoomReservationDetail(RoomReservationDetail RoomReservationDetail, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomReservationDetail getRoomReservationDetailById(Integer RoomReservationDetailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
