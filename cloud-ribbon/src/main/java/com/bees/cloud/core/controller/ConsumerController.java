package com.bees.cloud.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bees.cloud.core.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
    ConsumerService consumerService;
	
    @RequestMapping(value = "/invoke", method = RequestMethod.GET)
    public String invoke() {
    	return consumerService.invoke();
    }
}
