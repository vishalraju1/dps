package com.creational.prototype;

public class Dog implements IClonableAnimal {

	String name = null;
	
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public IClonableAnimal cloneAnimal() {
		try {
			Dog animal = (Dog) super.clone();
			animal.name = this.name  + " dog cloned";
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
