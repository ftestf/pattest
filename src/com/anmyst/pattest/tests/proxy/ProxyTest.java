package com.anmyst.pattest.tests.proxy;

import com.anmyst.pattest.tests.RunTest;

public class ProxyTest implements RunTest {

	@Override
	public void startTest() {
		ProxyImageIFace proxy = new ProxySurrogateImage("some url");
		proxy.showImage();
		proxy.showImage();
	}

}
