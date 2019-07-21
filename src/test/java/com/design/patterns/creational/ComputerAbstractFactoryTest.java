package com.design.patterns.creational;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.design.patterns.creational.abstractfactory.ComputerFactory;
import com.design.patterns.creational.abstractfactory.PCFactory;
import com.design.patterns.creational.abstractfactory.ServerFactory;
import com.design.patterns.creational.factory.Computer;

/*
 If you are familiar with factory design pattern in java, you will notice that we have a single Factory class. 
 This factory class returns different subclasses based on the input provided and factory class uses if-else or switch statement 
 to achieve this.

In the Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. 
Then an Abstract Factory class that will return the sub-class based on the input factory class. 
At first, it seems confusing but once you see the implementation, it’s really easy to grasp and understand the minor 
difference between Factory and Abstract Factory pattern.
 */
public class ComputerAbstractFactoryTest {
	
	@Test
	public void testCreatePC() {
		Computer pc = ComputerFactory.getComputer(new PCFactory());
		assertEquals(2, pc.getCpu());
		assertEquals(8, pc.getRam());
	}
	
	@Test
	public void testCreateServer() {
		Computer server = ComputerFactory.getComputer(new ServerFactory());
		assertEquals(8, server.getCpu());
		assertEquals(32, server.getRam());
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testNullServer() {
		//for code coverage only
		
		ComputerFactory f = new ComputerFactory();
		assertNotNull((f.getComputer(new PCFactory())));
	}

}
