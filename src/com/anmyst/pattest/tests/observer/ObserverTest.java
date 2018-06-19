package com.anmyst.pattest.tests.observer;

import com.anmyst.pattest.tests.RunTest;

public class ObserverTest implements RunTest {

	@Override
	public void startTest() {
		ObservableTestClass observable = new ObservableTestClass();
		ObserverTestClass observer = new ObserverTestClass();
		observable.registerObserver(observer);
		observable.publish("String to publish");
	}

}
