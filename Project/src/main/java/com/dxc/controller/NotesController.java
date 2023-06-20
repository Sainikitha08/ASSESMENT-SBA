package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Notes;
import com.dxc.service.NotesService;

@RestController
@RequestMapping("/notes/")
public class NotesController {

	@Autowired
	private NotesService service;
	
	
	@PostMapping("addNote")
	public Notes addNote(@RequestBody Notes notes) {
		return service.addNote(notes);
	}
	
	@PutMapping("updateNote")
	public Notes updateNotes(@RequestBody Notes notes) {
		return service.updateNotes(notes);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteNote(@PathVariable int id) {
		service.deleteNote(id);
	}
	
	@GetMapping("getNote/{id}")
	public Notes getNotesById(@PathVariable int id) {
		return service.getNotesById(id);
	}
	@GetMapping("getNotes")
	public List<Notes> getAllNotes(){
		return service.getAllNotes();
	}
}