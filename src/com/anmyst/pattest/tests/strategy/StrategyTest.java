package com.anmyst.pattest.tests.strategy;

import com.anmyst.pattest.tests.RunTest;

public class StrategyTest implements RunTest {

	@Override
	public void startTest() {
		StrategySorter sorter = new StrategySorter();

		sorter.setStrategy(new StrategyIntSortBuiltIn());
		sorter.generateArray(1000000, -900000, 900000);
		long start = System.currentTimeMillis();
		sorter.sortArray();
		long now = System.currentTimeMillis();
		System.out.println("BuiltIn Sort (sec)=" + (now - start) / 1000.0);

		sorter.setStrategy(new StrategyIntSortQuick());
		sorter.generateArray(1000000, -900000, 900000);
		start = System.currentTimeMillis();
		sorter.sortArray();
		now = System.currentTimeMillis();
		System.out.println("Quick Sort (sec)=" + (now - start) / 1000.0);
	}

}
