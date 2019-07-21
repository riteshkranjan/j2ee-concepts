package com.design.patterns.structural;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.design.patterns.structural.adapter.SocketAdapter;
import com.design.patterns.structural.adapter.SocketClassAdapterImpl;
import com.design.patterns.structural.adapter.SocketObjectAdapterImpl;
import com.design.patterns.structural.adapter.Volt;

/*
One of the great real life example of Adapter design pattern is mobile charger. 
Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). 
So the mobile charger works as an adapter between mobile charging socket and the wall socket.

We will try to implement multi-adapter using adapter design pattern in this tutorial.

So first of all we will have two classes – Volt (to measure volts) and Socket (producing constant volts of 120V).
 */
public class AdapterPatternTest {

	@Test
	public void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		assertEquals("v3 volts using Object Adapter=", 3, v3.getVolts());
		assertEquals("v12 volts using Object Adapter=", 12, v12.getVolts());
		assertEquals("v120 volts using Object Adapter=", 120, v120.getVolts());
	}

	@Test
	public void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v120 = getVolt(sockAdapter, 120);
		assertEquals("v3 volts using Class Adapter=", 3, v3.getVolts());
		assertEquals("v12 volts using Class Adapter=", 12, v12.getVolts());
		assertEquals("v120 volts using Class Adapter=", 120, v120.getVolts());
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		case 3:
			return sockAdapter.get3Volt();
		case 12:
			return sockAdapter.get12Volt();
		case 120:
			return sockAdapter.get120Volt();
		default:
			return sockAdapter.get120Volt();
		}
	}
}
