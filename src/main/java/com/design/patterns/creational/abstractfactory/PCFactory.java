package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.factory.Computer;
import com.design.patterns.creational.factory.PC;

public class PCFactory implements ComputerAbstractFactory{

	@Override
	public Computer createComputer() {
		return new PC();
	}

}
