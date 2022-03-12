package com.rafaelpenido.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelpenido.dsmovie.entities.Score;
import com.rafaelpenido.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
