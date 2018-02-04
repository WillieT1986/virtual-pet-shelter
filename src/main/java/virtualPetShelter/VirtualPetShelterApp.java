package virtualPetShelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, VirtualPet> pets = new HashMap<>();

		System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!");
		System.out.println();

		System.out.println("This is the status of your Pet's: ");
		System.out.println();
		System.out.println("Name      |Hunger  |Thirst  |Boredom");
		System.out.println("----------|--------|--------|-------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println();

		System.out.println("What would you like to do next?");
		System.out.println();
		System.out.println("1. Feed the pets");
		System.out.println("2. Water the pets");
		System.out.println("3. Play with a pet");
		System.out.println("4. Adopt a pet.");
		System.out.println("5. Admit a pet.");
		System.out.println("6. Quit");

		input.close();
	}

}
