package abstractfactory.factory.impl;

import abstractfactory.factory.AnimalFactory;
import abstractfactory.model.Animal;
import abstractfactory.model.Cow;
import abstractfactory.model.Dog;

public class AnimalFactoryImpl implements AnimalFactory {

	private int random;

	public AnimalFactoryImpl(int random) {
		this.random = random;
	}

	@Override
	public Animal createAnimal() {
		return (this.random % 2 == 0) ? 
				new Dog(new DogFoodFactoryImpl()) : 
					new Cow(new CowFoodFactoryImpl());  
	}

}
