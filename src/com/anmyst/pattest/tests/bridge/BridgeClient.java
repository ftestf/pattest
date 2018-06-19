package com.anmyst.pattest.tests.bridge;

public class BridgeClient {
	private BridgeDocumentIFace document;
	
	public BridgeClient(BridgeDocumentIFace document) {
		this.document = document;
	}
	
	public void showDocument() {
		document.showDocument();
	}

}
