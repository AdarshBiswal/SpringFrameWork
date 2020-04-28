package com.adarsh.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.Adarsh.SpringAnno")
public class AppConfig {
	
	
	//For manual configuration without spring.xml xonfiguration
	
//	@Bean
//	public Apple getMac()
//	{
//		return new Apple();
//	}
//	@Bean
//	public Processor getProcessor()
//	{
//		return new Snapdrogon();
//	}
	
}
