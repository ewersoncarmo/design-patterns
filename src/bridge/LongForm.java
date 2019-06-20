package bridge;

public class LongForm extends View {

	public LongForm(Resource resource) {
		super(resource);
	}

	@Override
	public String show() {
		return super.resource.snippet() + " - " + super.resource.title();
	}

}
