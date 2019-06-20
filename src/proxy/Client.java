package proxy;

public class Client {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Design Patterns");
		book.setNumberChapters(20);
		book.setNumberPages(400);
		
		BookParser bookParserProxy = new BookParserProxy(book);
		System.out.println(bookParserProxy.getNumberChapters());
		System.out.println(bookParserProxy.getNumberPages());
	}
}
