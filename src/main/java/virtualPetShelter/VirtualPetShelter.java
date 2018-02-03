package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<>();

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	// Return Collection of Pets within Shelter
	public Collection<VirtualPet> pets() {
		return pets.values();
	}

	// Return specific Virtual Pet given its name
	public void intake(VirtualPet virtualPet) {
		String newName = virtualPet.getName();
		pets.put(newName, virtualPet);
	}

	public void adopt(VirtualPet pet) {
		String newName = pet.getName();
		pets.put(newName, pet);

	}

	// feeding??
	public void feedAll() {
		for (VirtualPet pet : pets.values()) {
			pet.feedPet();
		}

	}

	public void waterAll() {
		for (VirtualPet pet : pets.values()) {
			pet.waterPet();
		}

	}

	public void playAll() {
		for (VirtualPet pet : pets.values()) {
			pet.playPet();
		}

	}

}
