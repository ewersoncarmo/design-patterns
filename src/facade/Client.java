package facade;

public class Client {

	public static void main(String[] args) {
		HomeTheater homeTheater = new HomeTheater();
		homeTheater.watchMovie();
		homeTheater.turnOffMovie();
	}
}
