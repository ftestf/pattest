package com.anmyst.pattest.tests.composite;

import java.util.ArrayList;
import java.util.List;

import com.anmyst.pattest.tests.iterator.CompositeVisitorIFace;

public class CompositeFolder implements CompositeIFace {

	private List<CompositeIFace> components = new ArrayList<>();
	private String name;

	public CompositeFolder(String name) {
		this.name = name;
	}

	@Override
	public void add(CompositeIFace component) {
		components.add(component);
	}

	@Override
	public CompositeIFace getChild(int i) {
		if (i < components.size())
			return components.get(i);
		return null;
	}

	@Override
	public void removeChild(int i) {
		if (i < components.size())
			components.remove(i);
	}

	@Override
	public boolean isComposite() {
		return true;
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
		return components;
	}

	@Override
	public void accept(CompositeVisitorIFace visitor) {
		visitor.visit(this);		
	}

}
