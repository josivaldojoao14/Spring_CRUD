package com.aulaspring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.projetospring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
