package com.design.patterns.creational;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.design.patterns.creational.builder.Computer;

/*
 * Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns 
 * when the Object contains a lot of attributes.

There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

1. Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time,
   the type of arguments are same and from client side its hard to maintain the order of the argument.
2. Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and 
   optional parameters need to send as NULL.
3. If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
 */
public class ComputeBuilderPatternTest {
	
	@Test
	public void testBuildComputer() {
		Computer c = new Computer.ComputerBuilder(2,4).build();
		assertEquals(2, c.getHDD());
		assertEquals(4, c.getRAM());
		assertFalse(c.isBluetoothEnabled());
		assertFalse(c.isGraphicsCardEnabled());
		
	}
	@Test
	public void testBuildComputerWithBluetooth() {
		Computer c = new Computer.ComputerBuilder(2,4)
				.withBluetooth()
				.build();
		assertEquals(2, c.getHDD());
		assertEquals(4, c.getRAM());
		assertTrue(c.isBluetoothEnabled());
		assertFalse(c.isGraphicsCardEnabled());
		
	}
	
	@Test
	public void testBuildComputerWithBluetoothAndGraphicCard() {
		Computer c = new Computer.ComputerBuilder(2,4)
				.withBluetooth()
				.withGraphicsCard()
				.build();
		assertEquals(2, c.getHDD());
		assertEquals(4, c.getRAM());
		assertTrue(c.isBluetoothEnabled());
		assertTrue(c.isGraphicsCardEnabled());
		
	}
}
