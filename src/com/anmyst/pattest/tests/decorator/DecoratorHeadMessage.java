package com.anmyst.pattest.tests.decorator;

public class DecoratorHeadMessage extends DecoratorSimpleMessage {
	private DecoratorMessage message;

	public DecoratorHeadMessage(DecoratorMessage message) {
		super();
		this.message = message;
	}

	@Override
	public void showMessage() {
		System.out.print("Message: ");
		message.showMessage();
	}

}
