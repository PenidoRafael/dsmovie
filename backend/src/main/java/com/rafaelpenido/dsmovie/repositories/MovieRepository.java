package com.rafaelpenido.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelpenido.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
