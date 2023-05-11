package com.chllg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chllg.model.User;

public interface ChllgRepository extends JpaRepository<User, Long> {
    List<User> findByNameContaining(String name);
}
