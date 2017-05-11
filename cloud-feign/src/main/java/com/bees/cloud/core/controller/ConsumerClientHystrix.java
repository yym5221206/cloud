package com.bees.cloud.core.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ConsumerClientHystrix implements ConsumerClient{

	@Override
	public String invoke(@RequestParam(value = "a") String a) {
		
		return "invoke defeate";
	}

}
