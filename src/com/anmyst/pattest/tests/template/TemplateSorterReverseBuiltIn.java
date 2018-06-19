package com.anmyst.pattest.tests.template;

import java.util.Arrays;

public class TemplateSorterReverseBuiltIn extends TemplateAbstractSorter {

	@Override
	public void prepare(int n) {
		array = new int[n];
		for (int i = 0; i < array.length; i++)
			array[i] = array.length - i;
	}

	@Override
	public void sort() {
		Arrays.sort(array);
	}

}
