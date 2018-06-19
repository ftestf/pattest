package com.anmyst.pattest.tests.composite;

import java.util.List;

import com.anmyst.pattest.tests.iterator.CompositeVisitorIFace;

public interface CompositeIFace {
	void add(CompositeIFace component);

	CompositeIFace getChild(int i);

	void removeChild(int i);

	boolean isComposite();

	String getName();

	List<CompositeIFace> getComponents();
	
	void accept(CompositeVisitorIFace visitor);
}
