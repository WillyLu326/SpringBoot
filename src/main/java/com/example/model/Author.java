package com.example.model;

public class Author {

	private long id;
	private String name;
	private int age;
	
	public Author() {}
	
	public Author(long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
