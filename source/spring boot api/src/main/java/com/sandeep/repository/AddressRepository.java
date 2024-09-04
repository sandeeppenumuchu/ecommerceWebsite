package com.sandeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
