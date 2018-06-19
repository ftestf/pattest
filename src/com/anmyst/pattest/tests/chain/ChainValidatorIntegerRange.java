package com.anmyst.pattest.tests.chain;

public class ChainValidatorIntegerRange implements ChainValidatorIFace {

	private Integer low;
	private Integer high;

	public ChainValidatorIntegerRange(Integer low, Integer high) {
		this.low = low;
		this.high = high;
	}	

	@Override
	public boolean processMessage(String message) {
		try {
			Integer value = Integer.valueOf(message);
			if (value < low || value > high) {
				System.out.println("Message: " + message);
				System.out.println("Error: not an integer in range " + low + " .. " + high);
				return true;
			}
		} catch (NumberFormatException ex) {
			System.out.println("Message: " + message);
			System.out.println("Error: not an integer");
			return true;
		}
		return false;
	}

}
