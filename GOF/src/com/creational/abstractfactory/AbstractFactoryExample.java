package com.creational.abstractfactory;

public class AbstractFactoryExample {

	public static void main(String[] args) {
		Vehicle airplane = FactoryCreator.getFactory("air").getVehicle("AirPlane");
		System.out.println("Expect Airplane"  + airplane.getName());
		Vehicle notvalid = FactoryCreator.getFactory("air").getVehicle("Ship");
		System.out.println("Expect Invalid " + notvalid.getName());
		Vehicle ship = FactoryCreator.getFactory("marine").getVehicle("Ship");
		System.out.println("Expect Ship " + ship.getName());
	}
}

class FactoryCreator {
	private FactoryCreator() {
	}

	public static VehicleFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("air")) {
			return new AirVehicleFactory();
		}

		if (factory.equalsIgnoreCase("marine")) {
			return new MarineVehicleFactory();
		}
		return null;
	}
}

abstract class VehicleFactory {
	public static VehicleFactory vehicleFactory;

	public abstract String getFactoryName();

	public abstract Vehicle getVehicle(String type);

}

class MarineVehicleFactory extends VehicleFactory {
	public MarineVehicleFactory() {
	}

	@Override
	public Vehicle getVehicle(String type) {
		if ("Ship".equalsIgnoreCase(type)) {
			return new Ship();
		} else if ("Yacht".equalsIgnoreCase(type)) {
			return new Yacht();
		} else {
			return new NotValidVehicle();

		}
	}

	@Override
	public String getFactoryName() {
		return "Marine";
	}

	public VehicleFactory getFactoryInstance() {
		if (vehicleFactory == null) {
			vehicleFactory = new MarineVehicleFactory();
		}
		return vehicleFactory;
	}

}

class AirVehicleFactory extends VehicleFactory {
	public AirVehicleFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehicle getVehicle(String type) {
		if ("Airplane".equalsIgnoreCase(type)) {
			return new AirPlane();
		} else if ("Helicopter".equalsIgnoreCase(type)) {
			return new Helicopter();
		} else {
			return new NotValidVehicle();
		}
	}

	@Override
	public String getFactoryName() {
		// TODO Auto-generated method stub
		return "Air";
	}

	public VehicleFactory getFactoryInstance() {
		if (vehicleFactory == null) {
			vehicleFactory = new AirVehicleFactory();
		}
		return vehicleFactory;
	}
}

abstract class Vehicle {
	public abstract String getName();
}

class Ship extends Vehicle {
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ship";
	}
}

class Yacht extends Vehicle {
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Yacht";
	}
}

class AirPlane extends Vehicle {
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "AirPlane";
	}
}

class Helicopter extends Vehicle {
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Helicopter";
	}
}

class NotValidVehicle extends Vehicle {
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not a Valid";
	}
}
