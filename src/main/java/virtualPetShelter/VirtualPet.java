package virtualPetShelter;

public class VirtualPet {
	private String name;
	private String description;
	private int hunger;
	private int water;
	private int bordem;
	private int feed;
	// private int thirst;
	// private int play;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public VirtualPet(String name, String description, int hunger, int water, int bordem) {
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.water = water;
		this.bordem = bordem;
	}

	public VirtualPet(int feed, int thirst, int play) {
		this.feed = feed;

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

	public int getBordem() {

		return bordem;
	}

	public int feed() {
		int feed = 1;

		for (int i = feed; i >= 0; i++) {

		}
		return feed;
	}

}
