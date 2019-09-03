package abstractfactory.factory.impl;

import abstractfactory.factory.AnimalFoodFactory;
import abstractfactory.model.AnimalFood;
import abstractfactory.model.CowFood;

public class CowFoodFactoryImpl implements AnimalFoodFactory {

	@Override
	public AnimalFood createAnimalFood() {
		return new CowFood();
	}

}
