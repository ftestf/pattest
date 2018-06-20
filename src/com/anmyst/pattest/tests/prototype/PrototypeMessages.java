package com.anmyst.pattest.tests.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMessages implements Cloneable {
	private List<String> messages = new ArrayList<>();

	public void addMessage(String message) {
		messages.add(message);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		PrototypeMessages clone = (PrototypeMessages) super.clone();
		clone.setMessages(new ArrayList<>(messages));
		return clone;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		messages.forEach(m -> sb.append(m).append("\n"));
		return sb.toString();
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

}
