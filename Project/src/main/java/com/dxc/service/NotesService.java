package com.dxc.service;

import java.util.List;

import com.dxc.model.Notes;

public interface NotesService {

	public Notes addNote(Notes notes);
	public Notes updateNotes(Notes notes);
	public void deleteNote(int id);
	public Notes getNotesById(int id);
	public List<Notes> getAllNotes();
}