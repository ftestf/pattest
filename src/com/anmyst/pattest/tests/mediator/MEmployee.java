package com.anmyst.pattest.tests.mediator;

public class MEmployee {

	protected MediatorIFace mediator;
	protected Integer id;

	public MEmployee(MediatorIFace mediator, Integer id) {
		this.mediator = mediator;
		this.id = id;
	}

	public void notify(String message, Integer idFrom) {
		System.out.println("Employee id = " + id + " gets message (from id = " + idFrom + ") : " + message);
	}

	public void sendTo(String message, Integer idTo) {
		mediator.sendMessage(message, id, idTo);
	}

	public Integer getId() {
		return id;
	}

}
