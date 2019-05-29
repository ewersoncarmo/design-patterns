package factory;

import java.util.Random;

/**
 * Concrete Factory: Decides which class to instantiate based in a certain logic.
 * 
 * @author Ewerson Carmo
 *
 */
public class RandomAnimalFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		Animal animal = null;
		
		int random = new Random().nextInt(10);
		
		if (random % 2 == 0)
			animal = new Dog();
		else
			animal = new Cat();
		
		return animal;
	}

}
