package abstract_factory;

/**
 * Factory: Defines an interface for creating an object.
 * 
 * @author Ewerson Carmo
 *
 */
public interface Factory {

	Animal createAnimal();
	Environment createEnvironment();
}
