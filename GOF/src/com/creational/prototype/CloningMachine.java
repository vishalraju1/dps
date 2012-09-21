package com.creational.prototype;

public class CloningMachine {

	public IClonableAnimal cloneAnimal(IClonableAnimal animal){
		return animal.cloneAnimal();
	}
}
