package com.ykw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ykw.entities.Note;

@RepositoryRestResource(collectionResourceRel = "note", path = "note")
public interface NoteRepo extends JpaRepository<Note, Integer> {

}
