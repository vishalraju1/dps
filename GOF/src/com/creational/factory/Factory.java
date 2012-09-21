package com.creational.factory;

import java.util.HashMap;
import java.util.Map;

public class Factory {

	private static Factory factory;
	
	private static Map<Integer,Class<? extends IProduct>> registeredProduct = new HashMap<Integer,Class<? extends IProduct>>();

	public void registerProduct(int id, Class<? extends IProduct> clazz){
		registeredProduct.put(id,clazz);
	}
	
	private Factory() {
	};

	public IProduct createProductFromFactoryRegistry(int productType){
		try{
			Class<? extends IProduct> productClazz = registeredProduct.get(productType);
			return productClazz.newInstance();
		}catch(Exception e){
			return new DefaultProduct();
		}
		
	}
	public IProduct createProductInFactory(int productType){
		switch(productType){
		case 1 :
			return  new AutoMobileProduct();
		case 2 :
			return new HealthProduct();
		default:
			return new DefaultProduct();
		}
	}
	public static Factory getInstance() {
		if (factory == null) {
			factory = new Factory();
		}
		return factory;
	}

}
