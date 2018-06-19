package com.anmyst.pattest.tests.command;

import com.anmyst.pattest.tests.RunTest;

public class CommandTest implements RunTest {

	@Override
	public void startTest() {
		CommandInvoker invoker = new CommandInvoker();
		CommandReceiver receiver = new CommandReceiver();
		CommandIFace append1 = new CommandAppend(receiver, "append1");
		CommandIFace append2 = new CommandAppend(receiver, "append2");
		CommandIFace append3 = new CommandAppend(receiver, "append3");
		invoker.executeCommand(append1);
		invoker.executeCommand(append2);
		invoker.executeCommand(append3);
		invoker.undo();
		invoker.undo();
		invoker.undo();
		invoker.undo();
		invoker.redo();
		invoker.redo();
		invoker.redo();
		invoker.redo();
		System.out.println(receiver.toString());
	}

}
