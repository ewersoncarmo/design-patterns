package strategy;

/**
 * Concrete strategy: Implements the algorithm using the interface.
 * 
 * @author Ewerson Carmo
 *
 */
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Playing guitar");
	}

}
