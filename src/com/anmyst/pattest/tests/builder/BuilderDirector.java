package com.anmyst.pattest.tests.builder;

import java.util.List;

public class BuilderDirector {
	public void construct(BuilderMailIFace mail, String from, String to, String text ) {	
		mail.addFrom(from).addTo(to).addText(text);
	}
	public void constructMass(BuilderMailIFace mail, String from, List<String> to, String text ) {
		mail.addFrom(from).addText(text);
		to.stream().forEach(toAddress -> mail.addTo(toAddress));
	}

}
