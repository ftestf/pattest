package com.anmyst.pattest.tests.adapter;

public class AdapterMessage implements AdapterMessageIFace {

	@Override
	public void showMessage(String prefix, String message) {
		System.out.println(prefix + " : " + message);

	}

}
