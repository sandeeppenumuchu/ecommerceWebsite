package com.sandeep.service;

import java.util.List;

import com.sandeep.exception.ProductException;
import com.sandeep.modal.Rating;
import com.sandeep.modal.User;
import com.sandeep.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
