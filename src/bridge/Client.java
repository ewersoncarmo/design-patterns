package bridge;

public class Client {

	public static void main(String[] args) {
		Artist artist = new Artist();
		artist.setSnippet("Snippet");
		artist.setName("Artist name");
		
		View artistView = new LongForm(new ArtistResource(artist));
		System.out.println(artistView.show());
	}
}
