package abstract_factory;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		Factory factory = new RandomFactory(new Random().nextInt(10));
		
		Animal animal = factory.createAnimal();
		animal.sayHello();
		
		Environment environment = factory.createEnvironment();
		environment.getEnvironment();
	}

}
