package composite;
public class Todo implements TodoList {

	private String text;

	public Todo(String text) {
		this.text = text;
	}
	
	@Override
	public String getText() {
		return this.text;
	}

}
