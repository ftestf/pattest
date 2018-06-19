package com.anmyst.pattest.tests.adapter;

public class AdapterErrorMessage implements AdapterErrorMessageIFace {

	public static final String ERROR_PREFIX = "Error";

	private AdapterMessageIFace message = new AdapterMessage();

	@Override
	public void showErrorMessage(String error) {
		message.showMessage(ERROR_PREFIX, error);
	}

}
