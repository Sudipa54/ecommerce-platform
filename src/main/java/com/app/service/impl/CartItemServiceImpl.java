package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.CartItemDto;
import com.app.entity.CartItem;
import com.app.repo.CartItemRepo;
import com.app.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemRepo cartItemRepo;

    @Override
    public CartItem addCartItem(CartItemDto cartItemDto) {
        CartItem cartItem = new CartItem();
        BeanUtils.copyProperties(cartItemDto, cartItem);
        return cartItemRepo.save(cartItem);
    }

    @Override
    public List<CartItem> getAllCartItems() {
        return cartItemRepo.findAll();
    }

    @Override
    public CartItem getCartItemById(int id) {
        Optional<CartItem> cartItemOptional = cartItemRepo.findById(id);
        return cartItemOptional.orElse(null);
    }

    @Override
    public List<CartItem> getCartItemsByCartId(int cartId) {
        return cartItemRepo.findByCartId(cartId);
    }

    @Override
    public boolean deleteCartItem(int cartItemId) {
        Optional<CartItem> cartItem = cartItemRepo.findById(cartItemId);
        if (cartItem.isPresent()) {
            cartItemRepo.deleteById(cartItem.get().getCartItemId());
            return true;
        }
        return false;
    }
}
