package com.design.patterns.behavioral.chainofresponsibility;

public class Processor {
	public static Chain getNumberProcessor() {
		Chain c1 = new NegativeProcessor();
		Chain c2 = new ZeroProcessor();
		Chain c3 = new PositiveProcessor();
		c1.setNext(c2);
		c2.setNext(c3);
		return c1;
	}
}
