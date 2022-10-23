package com.aulaspring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.projetospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
