package com.anmyst.pattest.tests.bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgeDocumentComplex implements BridgeDocumentIFace {
	
	List<String> document = new ArrayList<>();

	@Override
	public void showDocument() {
		document.stream().forEach(row -> System.out.println(row));
	}

	@Override
	public void addRow(String row) {
		document.add(row);		
	}

}
