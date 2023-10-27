package com.ankush.Kagebreaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankush.Kagebreaker.entities.Participants;

@Repository
public interface ParticipantsRepo extends JpaRepository<Participants, Integer> {

}
