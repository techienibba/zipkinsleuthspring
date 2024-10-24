package com.distributedtracing.distributedtracing.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class appConfig {
	
	
	
	@Bean
	public RestTemplate resttemplate()
	{
		
		return new RestTemplate();
	}
	
	@Bean
	public Sampler sampler()
	{
		return Sampler.ALWAYS_SAMPLE;
	}
	
	

}
