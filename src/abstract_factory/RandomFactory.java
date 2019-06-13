package abstract_factory;

public class RandomFactory implements Factory {

	private int random;

	public RandomFactory(int random) {
		this.random = random;
	}

	@Override
	public Animal createAnimal() {
		Animal animal = null;
		
		if (this.random % 2 == 0)
			animal = new Dog();
		else
			animal = new Cow();
		
		return animal;
	}

	@Override
	public Environment createEnvironment() {
		Environment environment = null;
		
		if (this.random % 2 == 0)
			environment = new House();
		else
			environment = new Farm();
		
		return environment;
	}

}
