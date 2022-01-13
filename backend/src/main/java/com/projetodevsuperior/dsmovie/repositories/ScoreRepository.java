package com.projetodevsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodevsuperior.dsmovie.entities.Score;
import com.projetodevsuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
