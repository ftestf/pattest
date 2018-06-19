package com.anmyst.pattest.tests.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ObservableTestClass extends Observable implements ObservablePublisher {
	private List<Observer> observers = new ArrayList<>();

	public void publish(String item) {
		for (Observer observer : observers)
			observer.update(this, item);
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
}
