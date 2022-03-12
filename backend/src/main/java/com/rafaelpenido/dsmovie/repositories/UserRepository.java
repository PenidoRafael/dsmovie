package com.rafaelpenido.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelpenido.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
	