package abstract_factory;

/**
 * Concrete Product: Contains specific implementation of the object.
 *  
 * @author Ewerson Carmo
 *
 */
public class Cow extends Animal {

	@Override
	public void sayHello() {
		System.out.println("Moo");
	}

}
