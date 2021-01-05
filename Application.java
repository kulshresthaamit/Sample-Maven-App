package com.amit.workshop;

public class Application {

	public static void main(String[] args) {
		System.out.println(new Application().getMessage());

	}

	private final String message = "Hello From Java Maven";
	
	private String getMessage() {
		return message;
	}

}
