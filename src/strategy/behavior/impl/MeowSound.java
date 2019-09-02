package strategy.behavior.impl;

import strategy.behavior.SoundBehavior;
import strategy.model.Pet;

public class MeowSound implements SoundBehavior {

	private Pet cat;

	public MeowSound(Pet cat) {
		this.cat = cat;
	}

	@Override
	public void makeSound() {
		System.out.println(this.cat.getName() + " is meowing");
	}
}
