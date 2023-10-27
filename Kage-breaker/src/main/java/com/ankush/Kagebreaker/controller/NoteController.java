package com.ankush.Kagebreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankush.Kagebreaker.entities.Note;
import com.ankush.Kagebreaker.service.serviceImple.NoteServiceImple;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/api/note")
@Slf4j
public class NoteController {

	@Autowired
	private NoteServiceImple noteService;

	@GetMapping("/getNote/{noteId}")
	public ResponseEntity<?> getNoteById(@PathVariable("noteId") Integer noteId) {
		Note note = null;
		try {
			note = noteService.getNoteById(noteId);
		} catch (Exception e) {
			log.error("getUserById () method failed to execute", e);
		}
		return new ResponseEntity<Note>(note, note == null ? HttpStatus.NOT_FOUND : HttpStatus.ACCEPTED);
	}

	@PostMapping("/saveNote")
	public ResponseEntity<?> saveNote(@RequestBody Note note) {
		Note createNote = null;
		try {
			createNote = noteService.createNote(note);
		} catch (Exception e) {
			log.error("saveUser() method failed to execute", e);
		}
		return new ResponseEntity<Note>(createNote, createNote == null ? HttpStatus.BAD_REQUEST : HttpStatus.CREATED);
	}
	
    @PatchMapping("/updateNote/{noteId}")
    public ResponseEntity<Note> updateNote(@RequestBody Note note,@PathVariable("noteId") Integer noteId) {
    	Note updateNote = null;
    	try {
    		updateNote =  noteService.updateNote(note, noteId);
        } catch (Exception e) {
            log.error("updateUser() method failed to execute", e);
        }
        return new ResponseEntity<Note>(updateNote, updateNote == null ? HttpStatus.BAD_REQUEST : HttpStatus.ACCEPTED);
    }
    
    @DeleteMapping("/deleteNote/{noteId}")
    public ResponseEntity<?> deleteNote(@PathVariable("userId") Integer noteId) {
        boolean result = false;
        JSONObject response = new JSONObject();
        try {
//            result =  noteService.deleteNoteById(noteId);
            if(result){
                response.put("Message","User Deleted Successfully");
            }else{
                response.put("Message","User Not Deleted ");
            }
        } catch (Exception e) {
            log.error("deleteUser() method failed to execute", e);
        }
        return new ResponseEntity<JSONObject>(response , HttpStatus.ACCEPTED);
    }

}
