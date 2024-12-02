package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.entity.Cart;
import com.app.repo.CartRepo;
import com.app.service.CartService;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepo cartRepo;

    @Override
    public Cart addCart(Cart cart) {
        return cartRepo.save(cart);  // Save and return the new cart
    }

    @Override
    public Cart getCartById(int cartId) {
        return cartRepo.findById(cartId).orElse(null);  // Return cart by cartId
    }

    @Override
    public Cart getCartByUserId(int userId) {
        // Assuming there's a custom method in CartRepo to find by userId
        return cartRepo.findByUserId(userId);
    }

    @Override
    public void updateTotalPrice(int cartId, double totalPrice) {
        Cart cart = cartRepo.findById(cartId).orElse(null);
        if (cart != null) {
            cart.setTotalPrice(totalPrice);
            cartRepo.save(cart);  // Update cart's totalPrice
        }
    }

    @Override
    public void deleteCart(int cartId) {
        cartRepo.deleteById(cartId);  // Delete cart by cartId
    }
}
