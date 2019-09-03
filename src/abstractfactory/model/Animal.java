package abstractfactory.model;

import abstractfactory.factory.AnimalFoodFactory;

public abstract class Animal {

	private AnimalFoodFactory animalFoodFactory;
	private String animal;

	public Animal(String animal, AnimalFoodFactory animalFoodFactory) {
		this.animal = animal;
		this.animalFoodFactory = animalFoodFactory;
	}

	public void WhoAmI() {
		System.out.println("I am a " + animal + " and I should eat " + animalFoodFactory.createAnimalFood().getAnimalFood());
	}
}
