package facade;

public class HomeTheater {

	private Ligth ligth;
	private Player player;

	public HomeTheater() {
		this.ligth = new Ligth();
		this.player = new Player();
	}
	
	public void watchMovie() {
		this.ligth.ligthsOff();
		this.player.play();
	}

	public void turnOffMovie() {
		this.ligth.ligthsOn();
		this.player.turnOff();
	}
}
