package com.williamledo.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
