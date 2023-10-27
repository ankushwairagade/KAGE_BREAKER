package com.ankush.Kagebreaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankush.Kagebreaker.entities.RoomReservationDetail;

@Repository
public interface RoomReservationDetailRepo extends JpaRepository<RoomReservationDetail, Integer> {

}
