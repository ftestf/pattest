package com.anmyst.pattest.tests.prototype;

import com.anmyst.pattest.tests.RunTest;

public class PrototypeTest implements RunTest {

	@Override
	public void startTest() {
		String[] messagesArray = {"message 1", "message 2", "message 3"};
		PrototypeMessages messages = new PrototypeMessages();
		for (String m : messagesArray)
			messages.addMessage(m);		
		
		PrototypeMessages messagesClone = null;
		try {
			messagesClone = (PrototypeMessages)messages.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		if (messagesClone != null) {
			messagesClone.addMessage("message 4");
			System.out.println(messages.toString());
			System.out.println(messagesClone.toString());
		}

	}

}
