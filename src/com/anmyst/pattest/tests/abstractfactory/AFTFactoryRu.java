package com.anmyst.pattest.tests.abstractfactory;

public class AFTFactoryRu implements AbstractFactoryIFace {

	@Override
	public AFTMessage createMessage() {		
		return new AFTMessageRu();
	}

}
