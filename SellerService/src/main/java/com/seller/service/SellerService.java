package com.seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seller.model.Seller;
import com.seller.repository.SellerRepo;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepo repo;
	
	public void saveSeller(Seller s) {
		this.repo.save(s);
	}
}
