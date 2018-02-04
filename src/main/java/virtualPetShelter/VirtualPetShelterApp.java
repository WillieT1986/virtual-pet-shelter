package virtualPetShelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet shelterPet1 = new VirtualPet("Hold", "Aged and fragile.", 40, 50, 60);
		VirtualPet shelterPet2 = new VirtualPet("Akita", "Aged and fragile.", 50, 40, 20);

		String decision = "";
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println("Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!");
			System.out.println();

			System.out.println("This is the status of your Pet's: ");
			System.out.println();
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");// the \t allows console to align output in columns
			System.out.println("--------|-------|-------|-------");
			System.out.println(shelterPet1.getName() + "\t   " + shelterPet1.getHunger() + "\t   "
					+ shelterPet1.getWater() + "\t   " + shelterPet1.getBordem());
			System.out.println(shelterPet2.getName() + "\t   " + shelterPet2.getHunger() + "\t   "
					+ shelterPet2.getWater() + "\t   " + shelterPet2.getBordem());
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

			String optionEntered = input.nextLine();
			if (optionEntered.equals("1")) {

				System.out.println("You fed all the pets in the Shelter food.\n");
			} else if (optionEntered.equals("2")) {

				System.out.println("You gave all the pets in the Shelter water.\n");
			} else if (optionEntered.equals("3")) {

				System.out.println("You took " + "insert pet name" + "for a walk to the field to play.\n");
			} else if (optionEntered.equals("4")) {

				System.out.println("Congrats on adopting your new pet!\n");
			} else if (optionEntered.equals("5")) {

				System.out.println("Your pet will sure miss you.");
				System.out.println("Thanks admitting your pet instead of discarding your pet elsewhere...\n");
			} else if (optionEntered.equals("6")) {
				System.out.println("Are you sure you wish to quit the game?");
				System.out.println("Enter Yes or No");
				decision = input.nextLine();

				if (decision.equalsIgnoreCase("Yes")) {
					System.out.println("You have quit the game...");

				} else {
					decision.equalsIgnoreCase("No");
					System.out.println("Glad you are still with us.");
					System.out.println("The pets will be pleased that you stayed for a while longer.\n");
				}

			}
			shelterPet1.tick();
		} // end while loop

		input.close();
	}

}
