package com.distributedtracing.distributedtracing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping
@Slf4j
public class logcontroller {
	
	
	
	@Autowired
	private RestTemplate rt;
	
	
	@GetMapping("/logA")
	public String getvalue()
	{
		log.info("Before logA");
		String resp=rt.getForObject("http://localhost:1346/logB", String.class);
		log.info("The return value from logB is {}",resp);
	  return "Approaching logB";
		
		
		
	}

}
