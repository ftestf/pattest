package com.anmyst.pattest.tests.decorator;

import com.anmyst.pattest.tests.RunTest;

public class DecoratorTest implements RunTest {

	@Override
	public void startTest() {
		DecoratorMessage message = new DecoratorSimpleMessage();
		message.setMessage("Hello!");
		DecoratorMessage headedMessage = new DecoratorHeadMessage(message);
		headedMessage.showMessage();
		DecoratorMessage headedBorderedMessage = new DecoratorBorderMessage(headedMessage);
		headedBorderedMessage.showMessage();
	}

}
