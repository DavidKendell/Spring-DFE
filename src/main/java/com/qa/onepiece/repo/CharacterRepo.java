package com.qa.onepiece.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.onepiece.domain.Characters;

public interface CharacterRepo extends JpaRepository<Characters, Long>{

}
