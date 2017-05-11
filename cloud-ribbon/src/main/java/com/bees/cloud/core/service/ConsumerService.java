package com.bees.cloud.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumerService {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "invokeServiceFallback")
	public String invoke(){
		return restTemplate.getForEntity("http://yym-server/syso?a=helloWorld", String.class).getBody();
	}
	
	
	public String invokeServiceFallback(){
		return "invoke defeate";
	}
}
