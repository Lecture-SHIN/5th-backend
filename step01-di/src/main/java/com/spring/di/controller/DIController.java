package com.spring.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.di.service.DIService;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
//생성자 주입 v2
//@RequiredArgsConstructor
@Component
public class DIController {
	
	// 세터 주입 v1
	private DIService diService;
	
	@Autowired
	public void setDIService(DIService diService) {
		System.out.println("세터 주입");
		System.out.println("Controller ===> Service : " + diService);
		this.diService = diService;
	}
	
	// 필드 주입 v1
//	@Autowired
//	private DIService diService;
//
//	// 필드 주입 v1 확인
//	@PostConstruct
//	public void init() {
//		System.out.println("@PostConstruct");
//		System.out.println("Controller ===> Service : " + diService);
//	}
	
	// 생성자 주입 v2
//	private final DIService diService;
	
	// 생성자 주입 v1
//	private DIService diService;
//	public DIController(DIService diService) {
//		System.out.println("DIController 생성자");
//		this.diService = diService;
//		System.out.println("Controller ===> Service : " + diService);
//	}
	
	// 기존 방식
//	private DIService service = new DIService();
	
}
