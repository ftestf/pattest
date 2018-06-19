package com.anmyst.pattest.tests.state;

import com.anmyst.pattest.tests.RunTest;

public class StateTest implements RunTest {

	@Override
	public void startTest() {
		StateMessagePrinter printer = new StateMessagePrinter();
		printer.setMessage("Hello World!");
		printer.setState(State.NORMAL);
		printer.showMessage();
		printer.setState(State.LOW);
		printer.showMessage();
		printer.setState(State.UP);
		printer.showMessage();
	}

}
