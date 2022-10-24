package com.williamledo.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
