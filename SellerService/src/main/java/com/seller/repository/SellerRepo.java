package com.seller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seller.model.Seller;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer>{

}
