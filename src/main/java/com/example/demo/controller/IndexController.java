package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

	@RequestMapping
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/get")
	public Map<String, String> get(@RequestParam String name) {
		Map<String, String> map = new HashMap<>();
		map.put("name", name);
		map.put("greeting", "Hello World");
		return map;
	}
}
