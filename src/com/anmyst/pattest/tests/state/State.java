package com.anmyst.pattest.tests.state;

public enum State {
	NORMAL(new StateNormal()), LOW(new StateLow()), UP(new StateUp());
	private StateIFace state;

	State(StateIFace state) {
		this.state = state;
	}

	public void showMessage(StateMessagePrinter context) {
		state.showMessage(context);
	}
}
