package com.ankush.Kagebreaker.service.serviceImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankush.Kagebreaker.entities.RoomReservationDetail;
import com.ankush.Kagebreaker.repositories.RoomInfoRepo;
import com.ankush.Kagebreaker.repositories.RoomReservationDetailRepo;
import com.ankush.Kagebreaker.service.RoomReservationDetailsService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RoomReservationDetailServiceImpl implements RoomReservationDetailsService {

	@Autowired
	private RoomReservationDetailRepo reservationDetailRepo;

	@Override
	public RoomReservationDetail createRoomReservationDetail(RoomReservationDetail RoomReservationDetail) {
		// TODO Auto-generated method stub
		return reservationDetailRepo.save(RoomReservationDetail);
	}

	@Override
	public List<RoomReservationDetail> getAllRoomReservationDetailList() {
		// TODO Auto-generated method stub
		return reservationDetailRepo.findAll();
	}

	@Override
	public RoomReservationDetail updateRoomReservationDetail(RoomReservationDetail RoomReservationDetail, Integer id) {
		// TODO Auto-generated method stub
		return reservationDetailRepo.save(RoomReservationDetail);
	}

	@Override
	public Optional<RoomReservationDetail> getRoomReservationDetailById(Integer RoomReservationDetailId) {
		return reservationDetailRepo.findById(RoomReservationDetailId);
	}

}
