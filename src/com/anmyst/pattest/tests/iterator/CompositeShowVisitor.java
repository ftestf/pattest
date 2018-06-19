package com.anmyst.pattest.tests.iterator;

import com.anmyst.pattest.tests.composite.CompositeIFace;

public class CompositeShowVisitor implements CompositeVisitorIFace {

	private void showComposite(CompositeIFace component, int cnt) {
		for (int i = 0; i < cnt; i++)
			System.out.print("-");
		if (!component.isComposite()) {
			System.out.println(component.getName());
			return;
		} else {
			System.out.println("Folder: " + component.getName());
			for (CompositeIFace comp : component.getComponents())
				showComposite(comp, cnt + 1);
		}
	}

	@Override
	public void visit(CompositeIFace composite) {
		showComposite(composite, 0);
	}

}
