package virtualPetShelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	// Return specific Virtual Pet given its name
	public void add(VirtualPet virtualPet) {
		String newName = virtualPet.getName();
		pets.put(newName, virtualPet);
	}

}
