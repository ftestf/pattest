package com.anmyst.pattest.tests.composite;

import java.util.List;

import com.anmyst.pattest.tests.iterator.CompositeVisitorIFace;

public class CompositeFile implements CompositeIFace {

	private String name;

	public CompositeFile(String name) {
		this.name = name;
	}

	@Override
	public void add(CompositeIFace component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public CompositeIFace getChild(int i) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeChild(int i) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public List<CompositeIFace> getComponents() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void accept(CompositeVisitorIFace visitor) {
		visitor.visit(this);		
	}

}
