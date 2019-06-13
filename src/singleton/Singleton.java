package singleton;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (Singleton.singleton == null) {
			System.out.println("Creating new instance");
			Singleton.singleton = new Singleton();
		} else
			System.out.println("Retrieving the existing instance");
		
		return Singleton.singleton;
	}

}
