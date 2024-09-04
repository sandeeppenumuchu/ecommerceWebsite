package com.sandeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
