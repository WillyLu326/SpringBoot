package com.example.services.helpers;

import java.util.List;

import com.example.model.Author;
import com.example.services.NotificationService;

public class NotificationServiceHelper implements NotificationService {

	private List<Author> authors;
	
	public NotificationServiceHelper() {
		Author one = new Author(1, "Willy Lu", 29);
		Author two = new Author(2, "Bingjie Xu", 28);
		
		this.authors.add(one);
		this.authors.add(two);
	}
	
	@Override
	public List<Author> lists() {
		return this.authors;
	}

}
