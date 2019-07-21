package composite;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		TodoList todo1 = new Todo("Milk");
		TodoList todo2 = new Todo("Bread");
		TodoList todo3 = new Todo("Cheese");
		
		Project project = new Project("Shopping list", Arrays.asList(todo1, todo2, todo3));
		System.out.println(project.getText());
	}
}
