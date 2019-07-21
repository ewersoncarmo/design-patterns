package composite;

import java.util.List;

public class Project implements TodoList {

	private String title;
	private List<TodoList> todos;
	
	public Project(String title, List<TodoList> todos) {
		this.title = title;
		this.todos = todos;
	}
	
	@Override
	public String getText() {
		String text = this.title;
		
		for (TodoList todo : todos) {
			text += "\n" + todo.getText();
		}
		
		return text;
	}

}
