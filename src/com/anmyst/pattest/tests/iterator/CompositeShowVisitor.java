package com.anmyst.pattest.tests.iterator;

import com.anmyst.pattest.tests.composite.CompositeIFace;

public class CompositeShowVisitor implements CompositeVisitorIFace {	
	
	@Override
	public void visit(CompositeIFace composite) {
		composite.showComposite(composite, 0);
	}

}
