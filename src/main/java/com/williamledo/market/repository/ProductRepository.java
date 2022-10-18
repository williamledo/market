package com.williamledo.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
