package abstractfactory;

public class EnvironmentFactory implements Factory {

	private int random;

	public EnvironmentFactory(int random) {
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
	public Food createFood() {
		Food food = null;
		
		if (this.random % 2 == 0)
			food = new DogFood();
		else
			food = new CowFood();
		
		return food;
	}

}
