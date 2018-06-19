package com.anmyst.pattest.tests.strategy;

import java.util.Arrays;

public class StrategyIntSortBuiltIn implements StrategySortIFace {

	@Override
	public void intSort(int[] array) {
		Arrays.sort(array);
	}

}
