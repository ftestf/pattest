package com.anmyst.pattest.tests.chain;

public class ChainValidatorInteger implements ChainValidatorIFace {

	@Override
	public boolean processMessage(String message) {		
		try {
			Integer value = Integer.valueOf(message);
		} catch (NumberFormatException ex) {
			System.out.println("Message: " + message);
			System.out.println("Error: That is not an Integer");
			return true;
		}
		return false;
	}

}
