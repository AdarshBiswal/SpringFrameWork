package com.adarsh.demo1;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;
	
//Uncomment when uncommenting comment-arg in Spring.xml
//	public Tyre(String Brand)
//	{
//		super();
//		this.brand=Brand;
//		
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	

}
