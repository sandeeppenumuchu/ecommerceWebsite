package com.sandeep.service;

import com.sandeep.exception.ProductException;
import com.sandeep.modal.Cart;
import com.sandeep.modal.CartItem;
import com.sandeep.modal.User;
import com.sandeep.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
