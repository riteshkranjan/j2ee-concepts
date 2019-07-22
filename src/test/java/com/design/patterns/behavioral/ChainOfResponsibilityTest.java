package com.design.patterns.behavioral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.design.patterns.behavioral.chainofresponsibility.Chain;
import com.design.patterns.behavioral.chainofresponsibility.Processor;
import com.design.patterns.behavioral.chainofresponsibility.Number;
public class ChainOfResponsibilityTest {

	@Test
	public void testChainOfResponsibility() {
		Chain c = Processor.getNumberProcessor();
		assertEquals("processing possitive number",c.process(new Number(100)));
		assertEquals("processing negative number",c.process(new Number(-100)));
		assertEquals("processing zero number",c.process(new Number(0)));
	}
}
