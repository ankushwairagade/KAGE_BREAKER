package com.ankush.Kagebreaker.service.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankush.Kagebreaker.entities.Note;
import com.ankush.Kagebreaker.repositories.NoteRepo;
import com.ankush.Kagebreaker.service.NoteService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoteServiceImple implements NoteService {

	@Autowired
	private NoteRepo noteRepo;

	@Override
	public Note createNote(Note note) {
		// TODO Auto-generated method stub
		return noteRepo.save(note);
	}


	@Override
	public List<Note> getAllNoteList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note deleteNoteById(Integer noteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note updateNote(Note note, Integer noteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Note getNoteById(Integer noteId) {
		// TODO Auto-generated method stub
		return null;
	}

}
