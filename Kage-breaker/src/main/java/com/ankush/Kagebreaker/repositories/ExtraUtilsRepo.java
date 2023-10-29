package com.ankush.Kagebreaker.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankush.Kagebreaker.entities.RoomInfo;
import com.ankush.Kagebreaker.entities.RoomReservationDetail;

@Service
public class ExtraUtilsRepo {

	@Autowired
	private RoomInfoRepo roomInfoRepo;

	@Autowired
	private RoomReservationDetailRepo roomReservationDetailRepo;

	public Map<Integer, RoomReservationDetail> getMapRoomInfoToRoomReservation() {
		List<RoomInfo> roominfoList = roomInfoRepo.findAll();
		List<RoomReservationDetail> roomReservationList = roomReservationDetailRepo.findAll();
		Map<Integer, RoomReservationDetail> respMap = new HashMap<Integer, RoomReservationDetail>();
		for (RoomReservationDetail x : roomReservationList) {
			for (RoomInfo rx : roominfoList) {
				if (rx.getId() == x.getRoomInfoId()) {
					respMap.put(rx.getId(), x);
				}
			}
		}
		return respMap;
	}
}
