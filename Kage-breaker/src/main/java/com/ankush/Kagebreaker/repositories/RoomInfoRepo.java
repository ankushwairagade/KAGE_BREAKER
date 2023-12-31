package com.ankush.Kagebreaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankush.Kagebreaker.entities.RoomInfo;

@Repository
public interface RoomInfoRepo extends JpaRepository<RoomInfo, Integer> {

}
