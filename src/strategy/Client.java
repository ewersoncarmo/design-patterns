package strategy;

public class Client {

	public static void main(String[] args) {
		Player player = new Player();
		player.setInstrument(new Guitar());
		player.play();
		player.setInstrument(new Piano());
		player.play();
		player.setInstrument(new Drums());
		player.play();
	}
}
