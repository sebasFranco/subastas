package com.ucentral.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ucentral.edu.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}