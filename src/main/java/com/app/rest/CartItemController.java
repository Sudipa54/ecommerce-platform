package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.dto.CartItemDto;
import com.app.entity.CartItem;
import com.app.service.CartItemService;

@RestController
@RequestMapping("/api/cart-items")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @PostMapping
    public ResponseEntity<CartItem> addCartItem(@RequestBody CartItemDto cartItemDto) {
        CartItem cartItem = cartItemService.addCartItem(cartItemDto);
        return ResponseEntity.ok(cartItem);
    }

    @GetMapping
    public ResponseEntity<List<CartItem>> getAllCartItems() {
        return ResponseEntity.ok(cartItemService.getAllCartItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CartItem> getCartItemById(@PathVariable int id) {
        CartItem cartItem = cartItemService.getCartItemById(id);
        if (cartItem != null) {
            return ResponseEntity.ok(cartItem);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/cart/{cartId}")
    public ResponseEntity<List<CartItem>> getCartItemsByCartId(@PathVariable int cartId) {
        return ResponseEntity.ok(cartItemService.getCartItemsByCartId(cartId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCartItem(@PathVariable int id) {
        boolean deleted = cartItemService.deleteCartItem(id);
        if (deleted) {
            return ResponseEntity.ok("CartItem deleted successfully.");
        }
        return ResponseEntity.notFound().build();
    }
}
