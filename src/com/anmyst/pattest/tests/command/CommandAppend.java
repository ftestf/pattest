package com.anmyst.pattest.tests.command;

public class CommandAppend implements CommandIFace {

	private CommandReceiver receiver;
	private String appendString;

	public CommandAppend(CommandReceiver receiver, String appendString) {
		this.appendString = appendString;
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.append(appendString);
	}

	@Override
	public void unexecute() {
		receiver.unappend(appendString);
	}

}
