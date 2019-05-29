package strategy;

public class Player {

	private Instrument instrument;

	public void play() {
		this.instrument.play();
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
