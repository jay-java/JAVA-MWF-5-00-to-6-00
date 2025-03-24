package com.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
	
	public void addProduct(Product p) {
		this.repo.save(p);
	}
	
	public Optional<Product> fetchProdcut(int pid) {
		return this.repo.findById(pid);
	}
}
