package singleton;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			System.out.println("Creating new instance");
			singleton = new Singleton();
		} else
			System.out.println("Retrieving the existing instance");
		
		return singleton;
	}

}
