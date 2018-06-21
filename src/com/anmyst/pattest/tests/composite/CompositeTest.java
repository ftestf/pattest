package com.anmyst.pattest.tests.composite;

import com.anmyst.pattest.tests.RunTest;

public class CompositeTest implements RunTest {

	@Override
	public void startTest() {
		CompositeIFace root = new CompositeFolder("c:");
		CompositeIFace windows = new CompositeFolder("Windows");
		CompositeIFace program = new CompositeFolder("Program Files");
		windows.add(new CompositeFile("regedit.exe"));
		windows.add(new CompositeFolder("system"));
		root.add(windows);
		root.add(program);
		root.add(new CompositeFile("log.txt"));

		root.showComposite(root, 0);
	}

}
