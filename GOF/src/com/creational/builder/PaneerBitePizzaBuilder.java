package com.creational.builder;

/* Concrete Builder */
public class PaneerBitePizzaBuilder extends PizzaBuilder {
	@Override
	public void buildDough() {
		pizza.setDough("cross");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Paneer");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("mild");

	}

}
