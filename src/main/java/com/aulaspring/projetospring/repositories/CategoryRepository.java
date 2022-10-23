package com.aulaspring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.projetospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
