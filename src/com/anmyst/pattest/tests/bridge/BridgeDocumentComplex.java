package com.anmyst.pattest.tests.bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgeDocumentComplex implements BridgeDocumentIFace {
	
	private List<String> document = new ArrayList<>();

	@Override
	public void showDocument() {
		document.forEach(System.out::println);
	}

	@Override
	public void addRow(String row) {
		document.add(row);		
	}

}
