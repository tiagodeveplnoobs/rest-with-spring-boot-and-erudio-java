package com.devolp.doug;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String templete  = "Hello, %s!";
	private  final AtomicLong counter  = new AtomicLong() ;

	
	
	@RequestMapping("/Greenting")
	public Greenting greentin(@RequestParam(defaultValue = "WOLRD") String name) 
	
	{
		
		return new Greenting(counter.incrementAndGet(),String.format(templete, name));
		
		
	}
}
