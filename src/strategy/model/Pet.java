package strategy.model;

import strategy.behavior.SoundBehavior;

public abstract class Pet {

	private SoundBehavior soundBehavior;
	private String name;

	public Pet(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name + " is eating");
	}

	public void setSoundBehavior(SoundBehavior soundBehavior) {
		this.soundBehavior = soundBehavior;
	}
	
	public void performSound() {
		this.soundBehavior.makeSound();
	}

	public String getName() {
		return this.name;
	}
}
