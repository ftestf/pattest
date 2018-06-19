package com.anmyst.pattest.tests.memento;

import com.anmyst.pattest.tests.RunTest;

public class MementoTest implements RunTest {

	@Override
	public void startTest() {
		MementoOriginator originator = new MementoOriginator();
		MementoCaretaker caretaker = new MementoCaretaker();
		originator.setState("First state");

		caretaker.setMemento(originator.getMemento());
		originator.setState("Second state");

		System.out.println(originator.toString());
		originator.revert(caretaker.getMemento());
		System.out.println(originator.toString());

	}

}
