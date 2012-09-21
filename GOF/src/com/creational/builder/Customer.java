package com.creational.builder;

/* A customer ordering a pizza*/
public class Customer {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		PizzaBuilder cheesyBiteBuilder = new CheesyBitePizzaBuilder();
		waiter.setPizzaBuilder(cheesyBiteBuilder);
		waiter.createNewPizza();
		Pizza pizza = waiter.getPizza();
		System.out.println(pizza.toString());
	}
}
