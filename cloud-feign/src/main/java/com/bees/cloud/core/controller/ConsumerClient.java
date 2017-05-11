package com.bees.cloud.core.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "yym-server",fallback = ConsumerClientHystrix.class)
public interface ConsumerClient {

	 @RequestMapping(method = RequestMethod.GET, value = "/syso")
	 String invoke(@RequestParam(value = "a") String a);
	
}
