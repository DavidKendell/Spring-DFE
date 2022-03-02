package com.qa.onepiece.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.onepiece.domain.Characters;

@Repository
public interface CharacterRepo extends JpaRepository<Characters, Long>{

}
