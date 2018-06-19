package com.anmyst.pattest.tests.abstractfactory;

import com.anmyst.pattest.tests.RunTest;

public class AbstractFactoryTest implements RunTest {

	@Override
	public void startTest() {
		AbstractFactoryIFace abstractFactoryRu = new AFTFactoryRu();
		AbstractFactoryIFace abstractFactoryEn = new AFTFactoryEn();
		AFTMessage messageRu = abstractFactoryRu.createMessage();
		AFTMessage messageEn = abstractFactoryEn.createMessage();
		messageRu.showMessage();
		messageEn.showMessage();		
	}

}
