package decorator.service.extra;

import decorator.service.PetService;

public abstract class ExtraService implements PetService {

	protected PetService petService;
	
	public ExtraService(PetService petService) {
		this.petService = petService;
	}
}
