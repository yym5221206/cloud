package com.bees.cloud.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServierController {

	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/syso" ,method = RequestMethod.GET)
    public String syso(@RequestParam(value = "a") String a) {
		logger.info(a);
        return a;
    }
}
