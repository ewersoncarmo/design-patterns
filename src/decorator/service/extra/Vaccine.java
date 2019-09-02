package decorator.service.extra;

import decorator.service.PetService;

public class Vaccine extends ExtraService {

	public Vaccine(PetService petService) {
		super(petService);
	}
	
	@Override
	public String getDescription() {
		return petService.getDescription() + ", Vaccine";
	}

	@Override
	public double getCost() {
		return petService.getCost() + 70.0;
	}
}
