package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Author;
import com.example.services.helpers.NotificationServiceHelper;

@RestController
@RequestMapping("/posts")
public class PageController {

	@Autowired
	NotificationServiceHelper notificationServiceHelper;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public List<Author> lists() {
		return this.notificationServiceHelper.lists();
	}
	
	@RequestMapping("/{id}")
	public Author getAuthorById(@PathVariable int id) {
		return this.notificationServiceHelper.getAuthor(id);
	}
	
	@RequestMapping(path = "/", method = RequestMethod.POST)
	public Author postAuthor(@RequestBody Author author) {
		return this.notificationServiceHelper.postAuthor(author);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	public Author updateAuthor(@PathVariable int id, @RequestBody Author author) {
		return this.notificationServiceHelper.updateAuthor(id, author);
	}
	
}
