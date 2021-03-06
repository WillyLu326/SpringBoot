package com.example.services;

import java.util.List;

import com.example.model.Author;

public interface NotificationService {

	public List<Author> lists();
	
	public Author getAuthor(int id);
	
	public Author postAuthor(Author author);
	
	public Author updateAuthor(int id, Author author);
	
	public void deleteAuthor(int id);
	
}
