package com.anmyst.pattest.tests.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements MediatorIFace {

	private List<MEmployee> employees = new ArrayList<>();

	@Override
	public void sendMessage(String message, Integer idFrom, Integer idTo) {
		MEmployee to = employees.stream().filter(e -> e.getId() == idTo).findFirst().orElse(null);
		if (to != null)
			to.notify(message, idFrom);
	}

	@Override
	public void addEmployee(MEmployee employee) {
		employees.add(employee);
	}

}
