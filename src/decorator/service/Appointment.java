package decorator.service;

public class Appointment implements PetService {

	@Override
	public String getDescription() {
		return "Appointment";
	}

	@Override
	public double getCost() {
		return 90.0;
	}
}
