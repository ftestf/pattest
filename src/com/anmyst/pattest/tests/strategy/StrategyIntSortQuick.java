package com.anmyst.pattest.tests.strategy;

public class StrategyIntSortQuick implements StrategySortIFace {

	private void quickSort(int[] arr, int n, int k) {
		if (k - n < 1)
			return;
		int base = (arr[n] + arr[k]) / 2;
		int l = n;
		int r = k;
		while (l < r) {
			while (l < k && arr[l] <= base)
				l++;
			while (r > n && arr[r] > base)
				r--;
			if (l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
		quickSort(arr, n, l - 1);
		quickSort(arr, r + 1, k);
	}

	@Override
	public void intSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

}
