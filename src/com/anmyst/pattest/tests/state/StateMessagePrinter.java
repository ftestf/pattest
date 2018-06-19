package com.anmyst.pattest.tests.state;

public class StateMessagePrinter {
	private State state;
	private String message;

	public void showMessage() {
		state.showMessage(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
