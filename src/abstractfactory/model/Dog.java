package abstractfactory.model;

import abstractfactory.factory.AnimalFoodFactory;

public class Dog extends Animal {

	public Dog(AnimalFoodFactory animalFoodFactory) {
		super("Dog", animalFoodFactory);
	}

}
