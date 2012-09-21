package com.creational.singleton;

public class SingletonClassExample {

	// static variable to store single instance.
	private static SingletonClassExample instance = null;

	// define a private constructor
	private SingletonClassExample() {
		// TODO Auto-generated constructor stub
	}

	// define a static method which return singleton class's object.
	public static SingletonClassExample getInstance() {
		if(instance == null) {
			instance=new SingletonClassExample();
		}
		return  instance;
	}
}
