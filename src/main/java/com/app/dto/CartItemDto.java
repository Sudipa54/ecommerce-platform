package com.app.dto;

public class CartItemDto {
   private int cartItemId;
   private int cartId;
   private int productId;
   private int quantity;
   private double productPrice;
   private double discount;

   public CartItemDto() {
   }

   public int getCartItemId() {
      return this.cartItemId;
   }

   public void setCartItemId(int cartItemId) {
      this.cartItemId = cartItemId;
   }

   public int getCartId() {
      return this.cartId;
   }

   public void setCartId(int cartId) {
      this.cartId = cartId;
   }

   public int getProductId() {
      return this.productId;
   }

   public void setProductId(int productId) {
      this.productId = productId;
   }

   public int getQuantity() {
      return this.quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public double getProductPrice() {
      return this.productPrice;
   }

   public void setProductPrice(double productPrice) {
      this.productPrice = productPrice;
   }

   public double getDiscount() {
      return this.discount;
   }

   public void setDiscount(double discount) {
      this.discount = discount;
   }
}
