package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {
	
	@RequestMapping("print")
	public ModelAndView print(@RequestParam("name") String myName) {
		System.out.println("Inside print method" + myName);
		ModelAndView mv = new ModelAndView();
		mv.addObject("nameatt", myName);
		mv.setViewName("home");
		return mv;
		
	}

}
