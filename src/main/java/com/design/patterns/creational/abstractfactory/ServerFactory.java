package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.factory.Computer;
import com.design.patterns.creational.factory.Server;

public class ServerFactory implements ComputerAbstractFactory{

	@Override
	public Computer createComputer() {
		return new Server();
	}

}
