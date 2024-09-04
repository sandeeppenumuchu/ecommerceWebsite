package com.sandeep.service;

import com.sandeep.exception.CartItemException;
import com.sandeep.exception.UserException;
import com.sandeep.modal.Cart;
import com.sandeep.modal.CartItem;
import com.sandeep.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
