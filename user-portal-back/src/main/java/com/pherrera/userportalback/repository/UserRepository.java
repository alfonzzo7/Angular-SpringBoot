package com.pherrera.userportalback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pherrera.userportalback.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}