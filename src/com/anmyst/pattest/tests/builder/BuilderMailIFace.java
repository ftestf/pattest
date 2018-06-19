package com.anmyst.pattest.tests.builder;

public interface BuilderMailIFace {
	BuilderMailIFace addFrom(String from);
	BuilderMailIFace addTo(String to);
	BuilderMailIFace addText(String text);
}
