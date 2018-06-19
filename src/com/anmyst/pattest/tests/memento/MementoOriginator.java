package com.anmyst.pattest.tests.memento;

public class MementoOriginator {
	private String state;

	public Memento getMemento() {
		return new Memento(state);
	}

	public void revert(Memento memento) {
		state = memento.getState();
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "MementoOriginator [state=" + state + "]";
	}

}
