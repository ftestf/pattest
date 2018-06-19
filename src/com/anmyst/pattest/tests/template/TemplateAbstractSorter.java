package com.anmyst.pattest.tests.template;

public abstract class TemplateAbstractSorter {
	protected int[] array;

	protected void sortTest(int n) {
		prepare(n);
		long start = System.currentTimeMillis();
		sort();
		long now = System.currentTimeMillis();
		System.out.println("Sort (ms)=" + (now - start));
	}

	public abstract void prepare(int n);

	public abstract void sort();

}
