package adapter;

public class Client {

	public static void main(String[] args) {
		Duck duck = new DuckImpl();
		Turkey turkey = new TurkeyImpl();
		
		duck.fly();
		turkey.fly();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.fly();
	}
}
