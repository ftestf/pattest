package com.anmyst.pattest;

import com.anmyst.pattest.tests.RunTest;
import com.anmyst.pattest.tests.TestFactory;
import com.anmyst.pattest.tests.TestTypes;

public class PatTest {

	public static void main(String[] args) {
		for (TestTypes test : TestTypes.values()) {
			System.out.println("----- " + test + " -----");
			RunTest runTest = TestFactory.getTestInstance(test);
			if (runTest != null)
				runTest.startTest();
			System.out.println("-----");
		}
	}

}
