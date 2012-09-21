package com.creational.builder;

public class Pizza {
	/** "Product" */
	private String dough = "";
	private String sauce = "";
	private String topping = "";

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pizza is having dough as " + dough + " , with sauce as "
				+ sauce + " and topping of " + topping;
	}
}
