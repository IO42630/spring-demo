package com.olexyn.spring.demo.order;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Needed to support interacting with orders in the database.
 */
public interface OrderRepository extends JpaRepository<Order,Long> {}
