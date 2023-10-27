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
		return noteRepo.save(note);
	}

	@Override
	public List<Note> getAllNoteList() {
		return noteRepo.findAll();
	}

	@Override
	public void deleteNoteById(Integer noteId) {
		noteRepo.deleteById(noteId);
	}

	@Override
	public Note updateNote(Note note, Integer noteId) {
		return noteRepo.save(note);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Note getNoteById(Integer Id) {
		return noteRepo.getById(Id);
	}

}
