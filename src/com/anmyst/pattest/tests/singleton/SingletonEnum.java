package com.anmyst.pattest.tests.singleton;

public enum SingletonEnum {
	INSTANCE;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
