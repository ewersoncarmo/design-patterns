package decorator.service.extra;

import decorator.service.PetService;

public class Shower extends ExtraService {

	public Shower(PetService petService) {
		super(petService);
	}
	
	@Override
	public String getDescription() {
		return petService.getDescription() + ", Shower";
	}

	@Override
	public double getCost() {
		return petService.getCost() + 35.0;
	}
	
}
