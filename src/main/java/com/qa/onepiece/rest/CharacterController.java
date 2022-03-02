package com.qa.onepiece.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.onepiece.domain.Characters;
import com.qa.onepiece.service.CharacterService;

@RestController
public class CharacterController {
	
	private CharacterService s;

	public CharacterController(CharacterService s) {
		super();
		this.s = s;
	}

	@PostMapping("/createChar")
	public ResponseEntity<Characters> createChoco(@RequestBody Characters c) {
		return new ResponseEntity<>(this.s.create(c), HttpStatus.CREATED);
	}
	
	@GetMapping("/getChars")
	public List<Characters> getAll() { return this.s.getAll();}
	
	@GetMapping("/findById/{id}")
	public Characters getById(@PathVariable Long id) {
		return this.s.getById(id);
	}
	
	@PutMapping("/updateChar/{id}")
	public ResponseEntity<Characters> updateCharacter(@RequestBody Characters character, @PathVariable Long id) {
		Characters responseBody = this.s.update(id, character); 
		return new ResponseEntity<Characters>(responseBody, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteCharacter/{id}")
	public ResponseEntity<?> deleteCharacter(@PathVariable Long id)  {
		this.s.deleteById(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
