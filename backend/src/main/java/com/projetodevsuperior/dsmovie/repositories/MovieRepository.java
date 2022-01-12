package com.projetodevsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodevsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
