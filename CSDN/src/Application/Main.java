package Application;

import design.staticfactory.Car;
import design.staticfactory.CarFactory;




public class Main {
	static public void main(String [] args) throws Exception
	{
		CarFactory factory = new CarFactory();
		Car car = factory.getCar("Audi");
		car.drive();
		car = factory.getCar("Benz");
		car.drive();
	}

}
