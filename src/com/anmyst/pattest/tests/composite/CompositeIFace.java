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
	
	default void showComposite(CompositeIFace component, int cnt) {
		for (int i = 0; i < cnt; i++)
			System.out.print("-");
		if (!component.isComposite()) {
			System.out.println(component.getName());	
		} else {
			System.out.println("Folder: " + component.getName());
			for (CompositeIFace comp : component.getComponents())
				showComposite(comp, cnt + 1);
		}
	}
}
