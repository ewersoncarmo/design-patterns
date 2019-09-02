package decorator;

import decorator.service.Appointment;
import decorator.service.PetService;
import decorator.service.extra.Shower;
import decorator.service.extra.Vaccine;

public class Client {

	public static void main(String[] args) {
		PetService petService = new Appointment();
		petService = new Vaccine(petService);
		petService = new Shower(petService);
		System.out.println(petService.getDescription() + ", " + petService.getCost());
	}
}
