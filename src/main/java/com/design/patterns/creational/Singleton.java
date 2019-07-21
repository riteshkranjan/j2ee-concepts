package com.design.patterns.creational;

public class Singleton {

	private Singleton() {
	}

	private static Singleton instance = null;

	public static Singleton getInstance() {
		if (instance == null) {
			Integer mutex = 0;
			synchronized (mutex) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}

}
