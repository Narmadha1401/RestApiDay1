package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3 {
	private String color="Black";
    @GetMapping("showcolor")
    public String getMyFav()
    {
    	return "My favorite color is "+color;
    }
}
