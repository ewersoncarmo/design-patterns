package abstractfactory.model;

import abstractfactory.factory.AnimalFoodFactory;

public class Cow extends Animal {

	public Cow(AnimalFoodFactory animalFoodFactory) {
		super("Cow", animalFoodFactory);
	}

}
