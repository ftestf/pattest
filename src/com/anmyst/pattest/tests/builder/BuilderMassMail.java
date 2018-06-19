package com.anmyst.pattest.tests.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderMassMail extends BuilderMail {

	private List<String> toAddresses = new ArrayList<>();

	@Override
	public BuilderMailIFace addTo(String to) {
		super.addTo(to);
		toAddresses.add(to);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(from).append("\n");
		toAddresses.stream().forEach(to -> sb.append(to).append(";"));
		sb.append("\n").append(text).append("\n");
		return sb.toString();
	}

}
