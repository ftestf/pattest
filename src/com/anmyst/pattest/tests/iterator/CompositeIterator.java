package com.anmyst.pattest.tests.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.anmyst.pattest.tests.composite.CompositeIFace;;

public class CompositeIterator implements Iterator<CompositeIFace> {
	private int index = -1;
	private CompositeIFace composite;

	public CompositeIterator(CompositeIFace composite) {
		this.composite = composite;
	}

	@Override
	public boolean hasNext() {
		if (index >= composite.getComponents().size() - 1)
			return false;
		return true;
	}

	@Override
	public CompositeIFace next() {
		if (hasNext()) {
			index++;
			return composite.getComponents().get(index);
		}
		throw new NoSuchElementException();
	}

}
