package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

	@RequestMapping(value = "/get")
	public Map<String, String> get(@RequestParam String name) {
		Map<String, String> map = new HashMap<>();
		map.put("greet", "hello world");
		map.put("name", name);
		return map;
	}
	
	@RequestMapping(value = "/get/{user}")
	public String getUser(@PathVariable String user) {
		return user;
	}
}
