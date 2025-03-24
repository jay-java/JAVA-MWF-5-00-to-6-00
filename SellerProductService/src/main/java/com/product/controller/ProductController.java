package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	private ProductService service;
	
	@GetMapping("/")
	public String index() {
		return "success";
	}
	
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Product p)
	{
		this.service.addProduct(p);
	}
}
