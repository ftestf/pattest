package com.anmyst.pattest.tests.strategy;

import java.util.Random;

public class StrategySorter {
	private StrategySortIFace strategy;
	private int[] array;

	public void printArray() {
		for (int item : array) System.out.print(item + ";");
		System.out.println();
	}

	public void generateArray(int n, int from, int to) {
		array = new int[n];
		Random random = new Random();
		for (int i = 0; i < array.length; i++)
			array[i] = random.nextInt(to - from + 1) + from; 
	}
	
	public void sortArray() {
		strategy.intSort(array);
	}

	public StrategySortIFace getStrategy() {
		return strategy;
	}

	public void setStrategy(StrategySortIFace strategy) {
		this.strategy = strategy;
	}

}
