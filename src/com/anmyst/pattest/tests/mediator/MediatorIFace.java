package com.anmyst.pattest.tests.mediator;

public interface MediatorIFace {
	void addEmployee(MEmployee employee);

	void sendMessage(String message, Integer idFrom, Integer idTo);

}
