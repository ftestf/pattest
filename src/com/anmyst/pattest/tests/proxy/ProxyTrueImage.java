package com.anmyst.pattest.tests.proxy;

public class ProxyTrueImage implements ProxyImageIFace {

	private String url;

	private void loadImageData() {
		System.out.println("Loading image from " + url);
	}

	public ProxyTrueImage(String url) {
		this.url = url;
		loadImageData();
	}

	@Override
	public void showImage() {
		System.out.println("Show loaded image");
	}

}
