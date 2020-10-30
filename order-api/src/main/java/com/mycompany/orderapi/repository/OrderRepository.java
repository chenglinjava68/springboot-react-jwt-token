package com.mycompany.orderapi.repository;

import java.util.List;

import com.mycompany.orderapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {

  List<Order> findAllByOrderByCreatedAtDesc();

  List<Order> findByIdContainingOrDescriptionContainingOrderByCreatedAt(String id, String description);

}
