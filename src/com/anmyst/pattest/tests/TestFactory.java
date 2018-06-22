package com.anmyst.pattest.tests;

import com.anmyst.pattest.tests.abstractfactory.AbstractFactoryTest;
import com.anmyst.pattest.tests.adapter.AdapterTest;
import com.anmyst.pattest.tests.bridge.BridgeTest;
import com.anmyst.pattest.tests.builder.BuilderTest;
import com.anmyst.pattest.tests.chain.ChainTest;
import com.anmyst.pattest.tests.command.CommandTest;
import com.anmyst.pattest.tests.composite.CompositeTest;
import com.anmyst.pattest.tests.decorator.DecoratorTest;
import com.anmyst.pattest.tests.iterator.IteratorTest;
import com.anmyst.pattest.tests.mediator.MediatorTest;
import com.anmyst.pattest.tests.memento.MementoTest;
import com.anmyst.pattest.tests.observer.ObserverTest;
import com.anmyst.pattest.tests.prototype.PrototypeTest;
import com.anmyst.pattest.tests.proxy.ProxyTest;
import com.anmyst.pattest.tests.singleton.SingletonTest;
import com.anmyst.pattest.tests.state.StateTest;
import com.anmyst.pattest.tests.strategy.StrategyTest;
import com.anmyst.pattest.tests.template.TemplateMethodTest;

public class TestFactory {
	public static RunTest getTestInstance(TestTypes type) {
		switch (type) {
		case SINGLETON:
			return new SingletonTest();
		case ABSTRACT_FACTORY:
			return new AbstractFactoryTest();
		case ADAPTER:
			return new AdapterTest();
		case BRIDGE:
			return new BridgeTest();
		case BUILDER:
			return new BuilderTest();
		case CHAIN_OF_RESPONSIBILITY:
			return new ChainTest();
		case COMMAND:
			return new CommandTest();
		case COMPOSITE:
			return new CompositeTest();
		case DECORATOR:
			return new DecoratorTest();
		case ITERATOR_VISITOR:
			return new IteratorTest();
		case MEDIATOR:
			return new MediatorTest();
		case MEMENTO:
			return new MementoTest();
		case OBSERVER:
			return new ObserverTest();
		case PROTOTYPE:
			return new PrototypeTest();
		case PROXY:
			return new ProxyTest();
		case STATE:
			return new StateTest();
		case STRATEGY:
			return new StrategyTest();
		case TEMPLATE_METHOD:
			return new TemplateMethodTest();
		}
		return null;
	}

}
