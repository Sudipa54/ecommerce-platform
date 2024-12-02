package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.CartItem;

public interface CartItemRepo extends JpaRepository<CartItem, Integer> {
    List<CartItem> findByCartId(int cartId);
}
