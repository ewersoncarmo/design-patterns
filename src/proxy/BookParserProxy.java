package proxy;

public class BookParserProxy implements BookParser {

	private Book book;
	private BookParser bookParser;

	public BookParserProxy(Book book) {
		this.book = book;
	}
	
	@Override
	public int getNumberPages() {
		if (this.bookParser == null) {
			this.bookParser = new BookParserImpl(book);
		}

		return this.bookParser.getNumberPages();
	}

	@Override
	public int getNumberChapters() {
		if (this.bookParser == null) {
			this.bookParser = new BookParserImpl(book);
		}

		return this.bookParser.getNumberChapters();
	}

}
