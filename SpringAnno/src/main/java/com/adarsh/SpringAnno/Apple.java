package com.adarsh.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Default name will be non-qulaified and de capitalized  Here the defalut name will be apple and we can give name here by @component("myApple")
public class Apple {
	
	@Autowired
	@Qualifier("mediatek")
	Processor cpu;
	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("OCTA Core,4gb Ram ,12MP Camera");
		cpu.process();
	}
}
