package com.anmyst.pattest.tests.iterator;

import com.anmyst.pattest.tests.RunTest;
import com.anmyst.pattest.tests.composite.CompositeFile;
import com.anmyst.pattest.tests.composite.CompositeFolder;
import com.anmyst.pattest.tests.composite.CompositeIFace;

public class IteratorTest implements RunTest {

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

		CompositeIterator iterator = new CompositeIterator(root);
		CompositeVisitorIFace visitor = new CompositeShowVisitor();
		while (iterator.hasNext()) {
			// System.out.println(iterator.next().getName());
			CompositeIFace composite = iterator.next();
			//visitor.visit(composite);
			composite.accept(visitor);
		}
	}

}
