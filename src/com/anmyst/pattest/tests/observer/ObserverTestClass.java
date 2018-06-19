package com.anmyst.pattest.tests.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverTestClass implements Observer {

	@Override
	public void update(Observable observable, Object item) {
		if (observable instanceof ObservablePublisher) {
			System.out.println(item.toString());
		}
		
	}

}
