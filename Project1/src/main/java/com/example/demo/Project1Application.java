package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.components.Item;

@SpringBootApplication
@ComponentScan({"com.example.components","com.example.controllers"})

public class Project1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project1Application.class, args);
		Item item = (Item) context.getBean("item");
		System.out.println(item);
	}

}
