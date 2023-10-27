package com.ankush.Kagebreaker.service.serviceImple;

import java.util.List;

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
		// TODO Auto-generated method stub
		return participantsRepo.save(participants);
	}


	@Override
	public List<Participants> getAllParticipantsList() {
		// TODO Auto-generated method stub
return participantsRepo.findAll();
	}

//	@Override
//	public Participants deleteParticipantsById(Integer id) {
//		// TODO Auto-generated method stub
//		Participants participants = participantsRepo.getById(Id);
//		
//		return participantsRepo.deleteById(id);
//	}



	@Override
	public Participants updateParticipants(Participants participants, Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Participants getParticipantsById(Integer noteId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Participants deleteParticipantsById(Integer noteId) {
		// TODO Auto-generated method stub
		return null;
	}

}
