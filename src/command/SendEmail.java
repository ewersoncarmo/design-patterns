package command;

public class SendEmail implements Task {

	@Override
	public void execute() {
		System.out.println("Sending e-mail");
	}

}
