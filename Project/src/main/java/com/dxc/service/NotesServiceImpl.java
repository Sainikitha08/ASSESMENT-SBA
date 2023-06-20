package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.Notes;
import com.dxc.repository.NotesRepository;

@Service
public class NotesServiceImpl implements NotesService {

	@Autowired
	private NotesRepository repo;

	@Override
	public Notes addNote(Notes notes) {

		Optional<Notes> n = repo.findById(notes.getNoteId());

		if (n.isEmpty()) {
			repo.save(notes);
			return notes;
		}
		return null;
	}

	@Override
	public Notes updateNotes(Notes notes) {
		Optional<Notes> n = repo.findById(notes.getNoteId());

		if (n.isPresent()) {
			repo.save(notes);
			return notes;
		}
		return null;
	}

	@Override
	public void deleteNote(int id) {
		Optional<Notes> n = repo.findById(id);
		
		if(n.isPresent()) {
			repo.deleteById(id);
			return;
		}
	}

	@Override
	public Notes getNotesById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Notes> getAllNotes() {
		return repo.findAll();
	}
}