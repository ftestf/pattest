package com.anmyst.pattest.tests.bridge;

import com.anmyst.pattest.tests.RunTest;

public class BridgeTest implements RunTest {

	@Override
	public void startTest() {
		BridgeDocumentIFace documentSimple = new BridgeDocumentSimple();
		documentSimple.addRow("First");
		documentSimple.addRow("Second");
		BridgeDocumentIFace documentComplex = new BridgeDocumentComplex();
		documentComplex.addRow("First");
		documentComplex.addRow("Second");
		BridgeClient clientSimple = new BridgeClient(documentSimple);
		clientSimple.showDocument();
		BridgeClient clientComplex = new BridgeClient(documentComplex);
		clientComplex.showDocument();
	}

}
