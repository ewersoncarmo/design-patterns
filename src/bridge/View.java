package bridge;

public abstract class View {

	protected Resource resource;

	public View(Resource resource) {
		this.resource = resource;
	}
	
	protected abstract String show();
}
