package com.anmyst.pattest.tests.state;

public class StateLow implements StateIFace {

	@Override
	public void showMessage(StateMessagePrinter context) {
		System.out.println(context.getMessage().toLowerCase());
	}

}
