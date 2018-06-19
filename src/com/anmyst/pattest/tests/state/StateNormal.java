package com.anmyst.pattest.tests.state;

public class StateNormal implements StateIFace {

	@Override
	public void showMessage(StateMessagePrinter context) {
		System.out.println(context.getMessage());
	}

}
