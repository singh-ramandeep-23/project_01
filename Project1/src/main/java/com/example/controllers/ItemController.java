package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	
	@RequestMapping("print")
	public void print() {
		System.out.println("Inside print method");
	}

}
