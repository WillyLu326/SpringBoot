package com.example.services.helpers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Author;
import com.example.services.NotificationService;

@Service
public class NotificationServiceHelper implements NotificationService {

	private List<Author> authors;
	
	public NotificationServiceHelper() {
		this.conifg();
	}
	
	private void conifg() {
		Author one = new Author(0, "Willy Lu", 29);
		Author two = new Author(1, "Bingjie Xu", 28);
		
		this.authors = new ArrayList<>();
		this.authors.add(one);
		this.authors.add(two);
	}
	
	@Override
	public List<Author> lists() {
		return this.authors;
	}

	@Override
	public Author getAuthor(int id) {
		return this.authors.get(id);
	}

	@Override
	public Author postAuthor(Author author) {
		this.authors.add(author);
		return author;
	}

	@Override
	public Author updateAuthor(int id, Author author) {
		this.authors.set(id, author);
		return author;
	}
	
	

}
