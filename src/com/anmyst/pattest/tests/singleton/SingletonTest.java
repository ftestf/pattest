package com.anmyst.pattest.tests.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.anmyst.pattest.tests.RunTest;

public class SingletonTest implements RunTest {

	@Override
	public void startTest() {
		SingletonClass firstSingleton = SingletonClass.getInstance();
		firstSingleton.setMessage("Test Message");
		try {
			Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			SingletonClass secondSingleton = constructor.newInstance();
			secondSingleton.setMessage("Test Message 2");
			System.out.println(firstSingleton.getMessage());
			System.out.println(secondSingleton.getMessage());

		} catch (SecurityException | NoSuchMethodException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		SingletonEnum.INSTANCE.setMessage("Test Message Enum");
		System.out.println(SingletonEnum.INSTANCE.getMessage());

	}

}
