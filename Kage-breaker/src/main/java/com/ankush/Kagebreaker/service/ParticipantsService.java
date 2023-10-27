package com.ankush.Kagebreaker.service;

import java.util.List;

import com.ankush.Kagebreaker.entities.Note;
import com.ankush.Kagebreaker.entities.Participants;

public interface ParticipantsService {


	Participants createParticipants(Participants participants);

	Participants updateParticipants(Participants participants, Integer Id);

	Participants getParticipantsById(Integer noteId);

	List<Participants> getAllParticipantsList();
	
	Participants deleteParticipantsById(Integer noteId);

	
}
