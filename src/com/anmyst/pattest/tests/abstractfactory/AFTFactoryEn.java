package com.anmyst.pattest.tests.abstractfactory;

public class AFTFactoryEn implements AbstractFactoryIFace {

	@Override
	public AFTMessage createMessage() {
		return new AFTMessageEn();
	}

}
