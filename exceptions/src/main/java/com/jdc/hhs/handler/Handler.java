package com.jdc.hhs.handler;

public class Handler {

	private Person person ;
	
	public Handler(){
		super();
	}
	
	public void useName() {
		try {
			 person.setName("John Doe");
			 System.out.println(person.getName());
		} catch (NullPointerException e) {
			System.out.println("This is NullPointerException because there is no person object");
		}
		
	 }
	
	void useAge() {
		person.setAge(20);
		int age = dividedByZero(person.getAge());
		System.out.println(age);
	}
	
	private int dividedByZero(int age) {
		return age/0;
		
	}
	
	public void recursive() {
		
		if(person.getAge() > 0) {
			recursive();
		}
	}
}
