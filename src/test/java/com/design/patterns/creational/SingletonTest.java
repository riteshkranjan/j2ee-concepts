package com.design.patterns.creational;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class SingletonTest {
	
	/*
	 * Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists 
	   in the java virtual machine.
	 * The singleton class must provide a global access point to get the instance of the class.
	 * Singleton pattern is used for logging, drivers objects, caching and thread pool.
     * Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
     * Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
	 */

	@Test
	public void testGetInstance() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		assertEquals(s1.hashCode(), s2.hashCode());
	}

	@Test
	public void testGetInstanceInMultiThreading() throws InterruptedException, ExecutionException {
		ExecutorService e = Executors.newFixedThreadPool(100);
		List<Future<Integer>> responses = new ArrayList<Future<Integer>>();
		for (int i = 0; i < 100; i++)
			responses.add(e.submit(new SingletonTestThread()));

		Integer expectedHashCode = responses.get(0).get().hashCode();
		for (int i = 1; i < 100; i++)
			assertEquals(expectedHashCode.intValue(), responses.get(i).get().intValue());
		e.shutdown();
	}

	private class SingletonTestThread implements Callable<Integer> {

		@SuppressWarnings("static-access")
		public Integer call() {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return Singleton.getInstance().hashCode();

		}

	}

}
