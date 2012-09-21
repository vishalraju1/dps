package com.creational.singleton;

public class SingletonClassClient {
	public static void main(String[] args) {
		// below is not allowed
		// SingletonClassExample s = new SingletonClassClient();
		SingletonClassExample s1 = SingletonClassExample.getInstance();
		SingletonClassExample s2 = SingletonClassExample.getInstance();
		System.out.println("Is S1 same as S2 ?" + (s1==s2));
	}
}
