package com.design.patterns.behavioral.chainofresponsibility;

public class NegativeProcessor implements Chain {
	private Chain nextInChain;

	@Override
	public void setNext(Chain nextInChain) {
		this.nextInChain = nextInChain;

	}

	@Override
	public String process(Number request) {
		if (request.getNumber() < 0)
			return "processing negative number";
		return this.nextInChain.process(request);
	}

}
