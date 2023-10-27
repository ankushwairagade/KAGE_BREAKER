package com.ankush.Kagebreaker.service;

import java.util.List;

import com.ankush.Kagebreaker.entities.RoomReservationDetail;

public interface RoomReservationDetailsService {

	RoomReservationDetail createRoomReservationDetail(RoomReservationDetail RoomReservationDetail);

	RoomReservationDetail updateRoomReservationDetail(RoomReservationDetail RoomReservationDetail, Integer id);

	RoomReservationDetail getRoomReservationDetailById(Integer RoomReservationDetailId);

	List<RoomReservationDetail> getAllRoomReservationDetailList();

}
