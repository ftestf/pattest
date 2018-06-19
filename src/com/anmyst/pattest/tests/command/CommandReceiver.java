package com.anmyst.pattest.tests.command;

public class CommandReceiver {
	private StringBuilder builder = new StringBuilder();

	public void append(String s) {
		builder.append(s);
	}

	public boolean unappend(String s) {
		if (builder.toString().endsWith(s)) {
			builder.delete(builder.length() - s.length(), builder.length());
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return builder.toString();
	}

}
