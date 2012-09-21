package com.creational.builder;

/* Concrete Builder */
public class CheesyBitePizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("pan backed");

	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");

	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Cheese");

	}

}
