package com.anmyst.pattest.tests.bridge;

public class BridgeDocumentSimple implements BridgeDocumentIFace {

	private String document;

	@Override
	public void showDocument() {
		System.out.println(document);
	}

	@Override
	public void addRow(String row) {
		this.document = row;		
	}

}
