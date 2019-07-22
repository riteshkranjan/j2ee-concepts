package com.design.patterns.behavioral.chainofresponsibility;

public interface Chain{
	public abstract void setNext(Chain nextInChain); 
    public abstract String process(Number request); 
}