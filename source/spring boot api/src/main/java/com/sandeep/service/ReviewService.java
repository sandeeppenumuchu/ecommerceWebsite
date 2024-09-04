package com.sandeep.service;

import java.util.List;

import com.sandeep.exception.ProductException;
import com.sandeep.modal.Review;
import com.sandeep.modal.User;
import com.sandeep.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
