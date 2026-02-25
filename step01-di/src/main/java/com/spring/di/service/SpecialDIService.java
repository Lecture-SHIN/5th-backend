package com.spring.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("specialDIService")
public class SpecialDIService extends DIService {
	
	public SpecialDIService() {
		System.out.println("SpecialDIService 생성자");
	}
	
//	@Autowired
//	private ObjectMapper objectMapper;
	
}
