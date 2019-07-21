package com.design.patterns.creational;

import static org.junit.Assert.*;

import org.junit.Test;

import com.design.patterns.creational.factory.Computer;
import com.design.patterns.creational.factory.ComputerFactory;

/*
 Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
 we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class 
 from client program to the factory class.
 */
public class ComputerFactoryTest {

	@Test
	public void testGetPC() {
		Computer c = ComputerFactory.getComputer("pc");
		assertEquals(c.getCpu(), 2);
		assertEquals(c.getRam(), 8);
	}

	@Test
	public void testGetServer() {
		Computer c = ComputerFactory.getComputer("server");
		assertEquals(c.getCpu(), 8);
		assertEquals(c.getRam(), 32);
	}

	@SuppressWarnings("static-access")
	@Test
	public void testNullServer() {
		//for code coverage only
		Computer c = ComputerFactory.getComputer("something else");
		assertNull(c);
		
		ComputerFactory f = new ComputerFactory();
		assertNull(f.getComputer("somethingelse"));
	}
}
