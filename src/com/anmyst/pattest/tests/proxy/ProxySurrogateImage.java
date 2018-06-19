package com.anmyst.pattest.tests.proxy;

public class ProxySurrogateImage implements ProxyImageIFace {
	
	private ProxyTrueImage image = null;
	private String url;

	public ProxySurrogateImage(String url) {
		this.url = url;
		image = null;
		System.out.println("Proxy created");
	}

	@Override
	public void showImage() {
		if (image == null) {
			image = new ProxyTrueImage(url);
		} 
		image.showImage();
	}

}
