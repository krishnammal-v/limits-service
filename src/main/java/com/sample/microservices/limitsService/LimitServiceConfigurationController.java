package com.sample.microservices.limitsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.microservices.limitsService.bean.LimitConfiguration;

@RestController
public class LimitServiceConfigurationController {

	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration(){
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
		
		
	}
}
