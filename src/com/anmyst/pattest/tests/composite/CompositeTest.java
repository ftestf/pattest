package com.anmyst.pattest.tests.composite;

import com.anmyst.pattest.tests.RunTest;

public class CompositeTest implements RunTest {

	private void showComposite(CompositeIFace component, int cnt) {
		for (int i = 0; i < cnt; i++)
			System.out.print("-");
		if (!component.isComposite()) {
			System.out.println(component.getName());
			return;
		} else {
			System.out.println("Folder: " + component.getName());
			for (CompositeIFace comp : component.getComponents())
				showComposite(comp, cnt + 1);
		}
	}

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

		showComposite(root, 0);
	}

}
