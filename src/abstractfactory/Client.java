package abstractfactory;

import java.util.Random;

import abstractfactory.factory.AnimalFactory;
import abstractfactory.factory.impl.AnimalFactoryImpl;
import abstractfactory.model.Animal;

public class Client {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactoryImpl(new Random().nextInt(10));
		Animal animal = animalFactory.createAnimal();
		animal.WhoAmI();
	}

}
