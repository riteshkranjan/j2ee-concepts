package com.design.patterns.creational.factory;

public class ComputerFactory {
	public static Computer getComputer(String type) {
		if (type.equals("pc"))
			return new PC();
		if (type.equals("server"))
			return new Server();
		return null;
	}

}
