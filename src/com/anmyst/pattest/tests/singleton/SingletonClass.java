package com.anmyst.pattest.tests.singleton;

public class SingletonClass {
	private String message;

	private static final SingletonClass instance = new SingletonClass();

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		return instance;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
