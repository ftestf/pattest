package com.anmyst.pattest.tests.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
	private int index = -1;
	private List<CommandIFace> commands = new ArrayList<>();

	public void executeCommand(CommandIFace command) {
		if (index >= 0 && commands.size() > 0)
			commands = commands.subList(0, Math.min(index + 1, commands.size()));
		commands.add(command);
		index++;
		command.execute();
	}

	public void undo() {
		if (index >= 0 && commands.size() > 0) {
			commands.get(index).unexecute();
			index--;
		}
	}

	public void redo() {
		if (commands.size() > index + 1) {
			index++;
			commands.get(index).execute();
		}
	}

}
