package strategy.behavior.impl;

import strategy.behavior.SoundBehavior;
import strategy.model.Pet;

public class BarkSound implements SoundBehavior {

	private Pet dog;

	public BarkSound(Pet dog) {
		this.dog = dog;
	}

	@Override
	public void makeSound() {
		System.out.println(this.dog.getName() + " is woofing");
	}

}
