package com.anmyst.pattest.tests.builder;

public class BuilderMail implements BuilderMailIFace {

	protected String from;
	protected String to;
	protected String text;

	@Override
	public BuilderMailIFace addFrom(String from) {
		this.from = from;
		return this;
	}

	@Override
	public BuilderMailIFace addTo(String to) {
		this.to = to;
		return this;
	}

	@Override
	public BuilderMailIFace addText(String text) {
		this.text = text;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(from).append("\n").append(to).append("\n").append(text).append("\n");
		return sb.toString();
	}

}
