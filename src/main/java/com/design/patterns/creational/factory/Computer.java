package com.design.patterns.creational.factory;

public class Computer {
	private final int ram;
	private final int cpu;

	public Computer(int ram, int cpu) {
		this.ram = ram;
		this.cpu = cpu;
	}
	
	public int getCpu() {
		return cpu;
	}
	
	public int getRam() {
		return ram;
	}
}
