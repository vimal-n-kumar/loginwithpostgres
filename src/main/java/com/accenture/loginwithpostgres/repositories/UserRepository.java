package com.accenture.loginwithpostgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.loginwithpostgres.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}