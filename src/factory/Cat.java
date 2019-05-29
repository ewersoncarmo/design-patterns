package factory;

/**
 * Concrete Product: Contains specific implementation of the object.
 *  
 * @author Ewerson Carmo
 *
 */
public class Cat extends Animal {

	@Override
	public void sayHello() {
		System.out.println("Meow");
	}

}
