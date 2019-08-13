package state;

public class Client {

	public static void main(String[] args) {
		try {
			Gate gate = new Gate();
			gate.pay();
			gate.payOk();
			gate.enter();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
