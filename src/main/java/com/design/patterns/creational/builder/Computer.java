package com.design.patterns.creational.builder;

public class Computer {

	// required parameters
	private int HDD;
	private int RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	private Computer(int HDD, int RAM) {
		this.HDD = HDD;
		this.RAM = RAM;
	}

	// Builder Class
	public static class ComputerBuilder {

		private Computer c;

		public ComputerBuilder(int HDD, int RAM) {
			c = new Computer(HDD, RAM);
		}

		public ComputerBuilder withGraphicsCard() {
			c.isGraphicsCardEnabled = true;
			return this;
		}

		public ComputerBuilder withBluetooth() {
			c.isBluetoothEnabled = true;
			return this;
		}

		public Computer build() {
			return c;
		}

	}

	public int getHDD() {
		return HDD;
	}

	public int getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

}
