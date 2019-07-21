package com.j2ee.concepts.j2ee_concepts;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testMain() {
		//Just to check junit is working or not. at the time of project setup only
		App a = new App();
		assertEquals(3, a.sum(1,2));
	}

}
