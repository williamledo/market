package com.williamledo.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
