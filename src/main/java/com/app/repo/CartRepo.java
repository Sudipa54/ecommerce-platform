package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

    Cart findByUserId(int userId);
    // Additional query methods if needed
}
