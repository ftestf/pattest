package com.anmyst.pattest.tests.chain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.anmyst.pattest.tests.RunTest;

public class ChainTest implements RunTest {

	private boolean checkMessage(String message, List<ChainValidatorIFace> validators) {
		for (ChainValidatorIFace validator : validators) {
			if (validator.processMessage(message))
				return true;
		}
		return false;
	}

	@Override
	public void startTest() {
		List<ChainValidatorIFace> validators = new ArrayList<>();
		validators.add(new ChainValidatorInteger());
		validators.add(new ChainValidatorIntegerRange(1, 100));

		String[] messages = { "asdf", "1000", "15", "0" };
		for (String message : Arrays.asList(messages)) {
			if (!checkMessage(message, validators))
				System.out.println("Message passed: " + message);
		}

	}

}
