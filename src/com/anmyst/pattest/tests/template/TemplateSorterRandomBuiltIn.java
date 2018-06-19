package com.anmyst.pattest.tests.template;

import java.util.Arrays;
import java.util.Random;

public class TemplateSorterRandomBuiltIn extends TemplateAbstractSorter {

	@Override
	public void prepare(int n) {
		array = new int[n];
		Random random = new Random();
		for (int i = 0; i < array.length; i++)
			array[i] = random.nextInt();
	}

	@Override
	public void sort() {
		Arrays.sort(array);
	}

}
