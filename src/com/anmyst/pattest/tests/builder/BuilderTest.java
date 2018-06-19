package com.anmyst.pattest.tests.builder;

import java.util.Arrays;
import java.util.List;

import com.anmyst.pattest.tests.RunTest;

public class BuilderTest implements RunTest {

	@Override
	public void startTest() {
		BuilderDirector director = new BuilderDirector();
		
		BuilderMailIFace mail = new BuilderMail();
		director.construct(mail, "a.melnikov@audiotele.ru", "someone@audiotele.ru", "Test mail");
		System.out.println(mail.toString());		
		
		BuilderMailIFace massMail = new BuilderMassMail();
		
		String[] addresses = {"someone@audiotele.ru", "second@audiotele.ru", "third@audiotele.ru"};
		List<String> to = Arrays.asList(addresses);
		
		director.constructMass(massMail, "a.melnikov@audiotele.ru", to, "Test mass mail");
		System.out.println(massMail.toString());		
	}

}
