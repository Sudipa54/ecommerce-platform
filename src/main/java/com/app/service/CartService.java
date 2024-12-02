package com.app.service;

import com.app.entity.Cart;

public interface CartService {
    Cart addCart(Cart cart);
    Cart getCartById(int cartId);
    Cart getCartByUserId(int userId);
    void updateTotalPrice(int cartId, double totalPrice);
    void deleteCart(int cartId);
}
