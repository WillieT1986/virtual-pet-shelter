package virtualPetShelter;

public class VirtualPet {
	private String name;
	private String description;
	private int hunger;
	private int water;
	private int bordem;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public VirtualPet(int hunger, int water, int bordem) {
		this.hunger = hunger;
		this.water = water;
	}

	public String getName() {

		return name;
	}

	public String getDescription() {

		return description;
	}

	public int getHunger() {

		return hunger;
	}

	public int getWater() {

		return water;
	}
}
