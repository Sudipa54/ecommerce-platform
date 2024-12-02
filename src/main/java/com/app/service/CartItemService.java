package com.app.service;

import java.util.List;

import com.app.dto.CartItemDto;
import com.app.entity.CartItem;

public interface CartItemService {
    CartItem addCartItem(CartItemDto cartItemDto);
    List<CartItem> getAllCartItems();
    CartItem getCartItemById(int id);
    List<CartItem> getCartItemsByCartId(int cartId);
    boolean deleteCartItem(int cartItemId);
}
