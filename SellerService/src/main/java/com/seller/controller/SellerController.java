package com.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seller.model.Seller;
import com.seller.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private SellerService service;
	
	@GetMapping("/")
	public String home() {
		return "success";
	}
	
	@PostMapping("/addseller")
	public void saveSellerDate(@RequestBody Seller s) {
		this.service.saveSeller(s);
	}
}
