package factory;

import java.util.Random;

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
