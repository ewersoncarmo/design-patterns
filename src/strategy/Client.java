package strategy;

import strategy.behavior.impl.BarkSound;
import strategy.behavior.impl.MeowSound;
import strategy.model.Cat;
import strategy.model.Dog;
import strategy.model.Pet;

public class Client {

	public static void main(String[] args) {
		Pet dog = new Dog("Rex");
		dog.setSoundBehavior(new BarkSound(dog));
		dog.eat();
		dog.performSound();
		
		Pet cat = new Cat("Lily");
		cat.setSoundBehavior(new MeowSound(cat));
		cat.eat();
		cat.performSound();
	}
}
