package com.seller.feign;

import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.product.model.Product;

@FeignClient(name = "SELLERPRODUCTSERVICE")
public interface SellerFeign {

	public void addProduct(Product p);
	
}
