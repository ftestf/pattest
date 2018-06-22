package com.anmyst.pattest.tests.mediator;

import com.anmyst.pattest.tests.RunTest;

public class MediatorTest implements RunTest {

	@Override
	public void startTest() {
		MediatorIFace mediator = new Mediator();
		MEmployee emp1 = new MEmployee(mediator, 1);
		MEmployee emp2 = new MEmployee(mediator, 2);
		MEmployee emp3 = new MEmployee(mediator, 3);
		mediator.addEmployee(emp1);
		mediator.addEmployee(emp2);
		mediator.addEmployee(emp3);

		emp1.sendTo("Hello", 3);
		emp3.sendTo("Hi", 1);
		emp2.sendTo("Hi someone!", 100);
	}

}
