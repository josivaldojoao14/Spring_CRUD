package com.aulaspring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.projetospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
