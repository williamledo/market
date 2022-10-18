package com.williamledo.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
