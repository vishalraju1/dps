package com.creational.factory;

public class FactoryClient {

	public static void main(String[] args) {
		SimpleFactoryClient();
		RegisterFactoryClient();
	}

	private static void RegisterFactoryClient(){
		registerFactoryProducts();
		IProduct p1 = Factory.getInstance().createProductInFactory(1);
		System.out.println("Expect Automobile Product and is " + p1.getName());
		IProduct p2 = Factory.getInstance().createProductInFactory(2);
		System.out.println("Expect Health Product and is " + p2.getName());
		IProduct p3 = Factory.getInstance().createProductInFactory(-1);
		System.out.println("Expect Default Product and is " + p3.getName());
		
	}

	private static void registerFactoryProducts() {
		Factory.getInstance().registerProduct(1,AutoMobileProduct.class);
		Factory.getInstance().registerProduct(2,HealthProduct.class);
	}
	
	private static void SimpleFactoryClient() {
		int automobileProductType = 1;
		IProduct p1 = Factory.getInstance().createProductInFactory(automobileProductType);
		System.out.println("Expect Automobile Product and is " + p1.getName());
		int healthProduct= 2;
		IProduct p2 = Factory.getInstance().createProductInFactory(healthProduct);
		System.out.println("Expect Health Product and is " + p2.getName());
		IProduct p3 = Factory.getInstance().createProductInFactory(-1);
		System.out.println("Expect Default Product and is " + p3.getName());
	}
}
