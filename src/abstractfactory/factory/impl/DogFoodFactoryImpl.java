package abstractfactory.factory.impl;

import abstractfactory.factory.AnimalFoodFactory;
import abstractfactory.model.AnimalFood;
import abstractfactory.model.DogFood;

public class DogFoodFactoryImpl implements AnimalFoodFactory {

	@Override
	public AnimalFood createAnimalFood() {
		return new DogFood();
	}

}
