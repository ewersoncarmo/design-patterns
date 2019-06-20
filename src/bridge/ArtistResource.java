package bridge;

public class ArtistResource implements Resource {

	private Artist artist;

	public ArtistResource(Artist artist) {
		this.artist = artist;
	}
	
	@Override
	public String snippet() {
		return this.artist.getSnippet();
	}

	@Override
	public String title() {
		return this.artist.getName();
	}

}
