package com.ankush.Kagebreaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ankush.Kagebreaker.entities.Note;

@Repository
public interface NoteRepo extends JpaRepository<Note, Integer> {

}
