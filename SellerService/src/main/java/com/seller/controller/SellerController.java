package com.seller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;
import com.product.model.Product;
import com.seller.feign.SellerFeign;
import com.seller.model.Seller;
import com.seller.model.SellerProduct;
import com.seller.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private SellerService service;
	
	@Autowired
	private SellerFeign feign;
	
	@GetMapping("/")
	public String home() {
		return "success";
	}
	
	@PostMapping("/addseller")
	public void saveSellerDate(@RequestBody SellerProduct ss) {
		Seller s = new Seller();
		s.setId(ss.getSid());
		s.setName(ss.getSname());
		s.setContact(ss.getScontact());
		this.service.saveSeller(s);
		
		Product p =new Product();
		p.setId(ss.getId());
		p.setPname(ss.getPname());
		p.setPprice(ss.getPprice());
		this.feign.addProduct(p);
	}
}
