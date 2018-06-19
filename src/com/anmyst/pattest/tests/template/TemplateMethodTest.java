package com.anmyst.pattest.tests.template;

import com.anmyst.pattest.tests.RunTest;

public class TemplateMethodTest implements RunTest {
	
	private static final int ARRAY_SIZE = 10_000_000;

	@Override
	public void startTest() {
		TemplateAbstractSorter sorterRandom = new TemplateSorterRandomBuiltIn();
		sorterRandom.sortTest(ARRAY_SIZE);
		TemplateAbstractSorter sorterReverse = new TemplateSorterReverseBuiltIn();
		sorterReverse.sortTest(ARRAY_SIZE);
	}

}
