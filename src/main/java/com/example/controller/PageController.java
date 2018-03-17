package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Author;
import com.example.services.helpers.NotificationServiceHelper;

@RestController
@RequestMapping("/posts")
public class PageController {

	@Autowired
	NotificationServiceHelper notificationServiceHelper;
	
	@RequestMapping("/")
	public List<Author> home() {
		return this.notificationServiceHelper.lists();
	}
	
}
