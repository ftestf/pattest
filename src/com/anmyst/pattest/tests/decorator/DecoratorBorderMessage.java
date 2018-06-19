package com.anmyst.pattest.tests.decorator;

public class DecoratorBorderMessage extends DecoratorSimpleMessage {
	private DecoratorMessage message;

	public DecoratorBorderMessage(DecoratorMessage message) {
		super();
		this.message = message;
	}

	@Override
	public void showMessage() {
		System.out.println("========");
		message.showMessage();
		System.out.println("========");
	}

}
