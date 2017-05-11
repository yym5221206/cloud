package com.bees.cloud.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired
	ConsumerClient consumerClient;

	@RequestMapping(value = "/invoke", method = RequestMethod.GET)
    public String invoke() {
        return consumerClient.invoke("yym");
    }
}
