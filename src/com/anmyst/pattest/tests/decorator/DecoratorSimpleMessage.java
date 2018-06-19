package com.anmyst.pattest.tests.decorator;

public class DecoratorSimpleMessage implements DecoratorMessage {
	
	private String message;

	@Override
	public void showMessage() {
		System.out.println(message);
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

}
