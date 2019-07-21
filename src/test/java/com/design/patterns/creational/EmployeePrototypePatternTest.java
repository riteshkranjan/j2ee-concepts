package com.design.patterns.creational;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.design.patterns.creational.prototype.Employees;
/*
Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources 
and you have a similar object already existing.

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs.
Prototype design pattern uses java cloning to copy the object.
 */
public class EmployeePrototypePatternTest {

	
	@Test
	public void testPrototype() throws CloneNotSupportedException {
		Employees e = new Employees();
		e.loadData();
		
		Employees e2 = (Employees) e.clone();
		e2.getEmpList().add("new employee");
		
		assertTrue(e2.getEmpList().size() - e.getEmpList().size() == 1);
		
	}
}
