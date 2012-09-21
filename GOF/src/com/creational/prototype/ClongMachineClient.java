package com.creational.prototype;

public class ClongMachineClient {
	public static void main(String[] args) {
		IClonableAnimal orignalDog = new Dog("Dog 1");
		System.out.println(orignalDog.toString());
		IClonableAnimal orignalCow  = new Cow("Cow 1");
		System.out.println(orignalCow.toString());
		CloningMachine machine = new CloningMachine();
		IClonableAnimal dogClone = machine.cloneAnimal(orignalDog);
		System.out.println(dogClone.toString());
		IClonableAnimal cowClone = machine.cloneAnimal(orignalCow);
		System.out.println(cowClone.toString());
	}
}
