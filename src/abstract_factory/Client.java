package abstract_factory;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		Factory factory = new EnvironmentFactory(new Random().nextInt(10));
		
		Animal animal = factory.createAnimal();
		animal.sayHello();
		
		Food food = factory.createFood();
		food.getFood();
	}

}
