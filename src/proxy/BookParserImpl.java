package proxy;

public class BookParserImpl implements BookParser {

	private Book book;

	public BookParserImpl(Book book) {
		this.book = book;
	}
	
	@Override
	public int getNumberPages() {
		return this.book.getNumberPages();
	}

	@Override
	public int getNumberChapters() {
		return this.book.getNumberChapters();
	}

}
