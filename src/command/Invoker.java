package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<Task> tasks;
	
	public Invoker() {
		this.tasks = new ArrayList<>();
	}
	
	public void addTask(Task task) {
		this.tasks.add(task);
	}
	
	public void process() {
		this.tasks.forEach(t -> t.execute());
	}
}
