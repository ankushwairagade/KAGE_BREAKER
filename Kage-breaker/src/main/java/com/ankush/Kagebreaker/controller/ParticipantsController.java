package com.ankush.Kagebreaker.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankush.Kagebreaker.entities.Participants;
import com.ankush.Kagebreaker.service.serviceImple.ParticipantsServiceImple;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/participants")
@Slf4j
public class ParticipantsController {

	@Autowired
	private ParticipantsServiceImple participantsServiceImple;

	@GetMapping("/getParticipants/{participantsId}")
	public ResponseEntity<?> getParticipantsById(@PathVariable("participantsId") Integer participantsId) {
		Optional<Participants> participants = null;
		try {
			participants = participantsServiceImple.getParticipantsById(participantsId);
		} catch (Exception e) {
			log.error("getParticipantsById () method failed to execute", e);
		}
		return new ResponseEntity<Participants>(participants.get(), participants == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
	}

	@PostMapping("/saveParticipants")
	public ResponseEntity<?> saveParticipants(@RequestBody Participants participants) {
		Participants createParticipants = null;
		try {
			createParticipants = participantsServiceImple.createParticipants(participants);
		} catch (Exception e) {
			log.error("saveParticipants() method failed to execute", e);
		}
		return new ResponseEntity<Participants>(createParticipants, createParticipants == null ? HttpStatus.BAD_REQUEST : HttpStatus.CREATED);
	}
	
    @PatchMapping("/updateParticipants/{participantsId}")
    public ResponseEntity<Participants> updateParticipants(@RequestBody Participants participants,@PathVariable("participantsId") Integer participantsId) {
    	Participants updateParticipants = null;
    	try {
    		updateParticipants =  participantsServiceImple.updateParticipants(participants, participantsId);
        } catch (Exception e) {
            log.error("updateParticipants() method failed to execute", e);
        }
        return new ResponseEntity<Participants>(updateParticipants, updateParticipants == null ? HttpStatus.BAD_REQUEST : HttpStatus.ACCEPTED);
    }
    
//    @DeleteMapping("/deleteNote")
//    public ResponseEntity<?> deleteParticipants(@PathVariable("userId") Integer noteId) {
//        boolean result = false;
//        JSONObject response = new JSONObject();
//        try {
////            result =  participantsServiceImple.deleteNoteById(noteId);
//            if(result){
//                response.put("Message","User Deleted Successfully");
//            }else{
//                response.put("Message","User Not Deleted ");
//            }
//        } catch (Exception e) {
//            log.error("deleteUser() method failed to execute", e);
//        }
//        return new ResponseEntity<JSONObject>(response , HttpStatus.ACCEPTED);
//    }
	
	
}
