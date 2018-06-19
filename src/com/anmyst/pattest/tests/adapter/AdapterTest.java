package com.anmyst.pattest.tests.adapter;

import com.anmyst.pattest.tests.RunTest;

public class AdapterTest implements RunTest {

	@Override
	public void startTest() {
		AdapterErrorMessageIFace error = new AdapterErrorMessage(); 
		error.showErrorMessage("FATAL ERROR!");
	}

}
