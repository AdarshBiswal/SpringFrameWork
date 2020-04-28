package com.adarsh.demo1;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile{

	public void drive()
	{
		System.out.println("Bhag raha hai");
	}
}
