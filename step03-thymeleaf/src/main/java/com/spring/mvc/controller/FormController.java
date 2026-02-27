package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.dto.Contact;
import com.spring.mvc.dto.Student;
import com.spring.mvc.dto.Student.Grade;

@Controller
public class FormController {
	
	@GetMapping(value = "/update-form")
	public String moveUpdateForm(Model model) {
		
		Contact contact = new Contact("front", 
									"Shanna@melissa.tv", 
									"front");
		
		model.addAttribute("contact", contact);
		
		return "update";
	}
	
	@GetMapping(value = "/input-form")
	public String moveInputForm() {
		return "input";
	}
	
	@PostMapping(value = "/input-data")
	public String processInputData(Contact contact,
									Model model) {
		
		System.out.println(contact);
		model.addAttribute("contact", contact);
		
		return "output";
	}
	
	@GetMapping(value = "/form")
	public String form(Student student,
						Model model) {
		System.out.println("FormController");
		System.out.println(student);
		student.setGrade(Grade.JUNIOR);
		
		model.addAttribute("student", student);
		
		return "test";
	}
	
}
