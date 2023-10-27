package com.ankush.Kagebreaker.service.serviceImple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankush.Kagebreaker.entities.Participants;
import com.ankush.Kagebreaker.repositories.ParticipantsRepo;
import com.ankush.Kagebreaker.service.ParticipantsService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ParticipantsServiceImple implements ParticipantsService {

	@Autowired
	private ParticipantsRepo participantsRepo;

	@Override
	public Participants createParticipants(Participants participants) {
		return participantsRepo.save(participants);
	}

	@Override
	public List<Participants> getAllParticipantsList() {
		return participantsRepo.findAll();
	}

	@Override
	public Participants updateParticipants(Participants participants, Integer Id) {
		return participantsRepo.save(participants);
	}

	@Override
	public Optional<Participants> getParticipantsById(Integer id) {
		return participantsRepo.findById(id);
	}

	@Override
	public Participants deleteParticipantsById(Integer Id) {
		participantsRepo.deleteById(Id);
		return null;
	}

}
