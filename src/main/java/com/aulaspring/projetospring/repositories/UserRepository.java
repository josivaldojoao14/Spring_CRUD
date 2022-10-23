package com.aulaspring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.projetospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
