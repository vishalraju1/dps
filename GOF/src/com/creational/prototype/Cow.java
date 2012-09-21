package com.creational.prototype;

public class Cow implements IClonableAnimal {

	String name = null;

	public Cow(String name) {
		this.name = name;
	}

	@Override
	public IClonableAnimal cloneAnimal() {
		try {
			Cow animal = (Cow) super.clone();
			animal.name = this.name + " cow cloned";
			return animal;
		} catch (CloneNotSupportedException e) {
			return null;
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
