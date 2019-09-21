package memento;

import java.util.ArrayList;
import java.util.List;

public class Historic {

	private List<Status> savedStatus = new ArrayList<>();
	
	public Status get(int index) {
		return this.savedStatus.get(index);
	}
	
	public void add(Status status) {
		this.savedStatus.add(status);
	}
}
