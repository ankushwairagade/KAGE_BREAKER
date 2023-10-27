package com.ankush.Kagebreaker.service;

import java.util.List;

import com.ankush.Kagebreaker.entities.Note;

public interface NoteService {

	Note createNote(Note note);

	Note updateNote(Note note, Integer noteId);

	Note getNoteById(Integer noteId);

	List<Note> getAllNoteList();
	
	Note deleteNoteById(Integer noteId);

}
