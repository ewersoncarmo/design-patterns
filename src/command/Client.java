package command;

public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.addTask(new SendEmail());
		invoker.addTask(new PayBill());
		invoker.process();
	}
}
