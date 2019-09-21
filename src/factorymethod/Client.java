package factorymethod;

public class Client {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new RandomAnimalFactory();
		Animal animal = animalFactory.createAnimal();
		animal.sayHello();
	}

}
