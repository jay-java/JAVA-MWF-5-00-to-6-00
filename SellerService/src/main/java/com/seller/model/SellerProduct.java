package com.seller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//DTO -> Data Transfer Object
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SellerProduct {
	
	private int sid,id,pprice;
	private String sname,pname,pdesc;
	private long scontact;

}
