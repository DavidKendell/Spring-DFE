package com.qa.onepiece.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.onepiece.domain.Characters;
import com.qa.onepiece.repo.CharacterRepo;

@Service
public class CharacterService {
	private CharacterRepo repo;

	public CharacterService(CharacterRepo repo) {
		super();
		this.repo = repo;
	}
	
	public Characters create(Characters c) {
		return this.repo.save(c);
	}
	
	public List<Characters> getAll() {
		return this.repo.findAll();
	}
	
	public Characters deleteById(Long id) {
		Characters deleted = this.repo.findById(id).orElse(null);
		this.repo.deleteById(id);
		return deleted;
	}
	
	public Characters getById(Long id) {
		return this.repo.findById(id).orElse(null);
	}
	
	public Characters update(Long Id, Characters newChar) {
		Characters oldChar = this.repo.findById(Id).get();
		oldChar.setName(newChar.getName());
		oldChar.setAttack(newChar.getAttack());
		oldChar.setDefence(newChar.getDefence());
		oldChar.setSpeed(newChar.getSpeed());
		oldChar.setHealth(newChar.getHealth());
		oldChar.setBounty(newChar.getBounty());
		
		return this.repo.save(oldChar);
	}
}


