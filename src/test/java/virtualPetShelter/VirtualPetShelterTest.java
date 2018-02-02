package virtualPetShelter;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	private static final String PET_NAME = "name";
	private static final String DESCRIPTION = "description";

	private VirtualPetShelter underTest;
	// private static final String Pet_Description = "description";

	// @Test
	// public void shouldInstantiateVirtualPetShelter() {
	// VirtualPetShelter underTest = new VirtualPetShelter();
	//
	// assertNotNull(underTest);
	// }

	@Before
	public void setup() {
		underTest = new VirtualPetShelter();
	}

	@Test
	public void shouldAddVirtualPetName() {
		VirtualPet check = new VirtualPet(PET_NAME, DESCRIPTION);
		underTest.intake(check);
		VirtualPet retrieved = underTest.findPet(PET_NAME);
		assertThat(retrieved, is(check));
	}

	@Test
	public void shouldAddMultipleVirtualPetNames() {
		String anotherName = "Akita";
		VirtualPet pet = new VirtualPet("Husky", DESCRIPTION);
		VirtualPet anotherPet = new VirtualPet(anotherName, DESCRIPTION);

		underTest.intake(pet);
		underTest.intake(anotherPet);

		Collection<VirtualPet> pets = underTest.pets();

		assertThat(pets, containsInAnyOrder(pet, anotherPet));

		assertTrue(pets.contains(pet));
		assertTrue(pets.contains(anotherPet));
		assertEquals(2, pets.size());
	}

	// @Test
	// public void shouldShelterFeedPet() {
	// VirtualPet pet = new VirtualPet("Fido", "flea-ridden");
	//
	// underTest.intake(pet); // adds him to the shelter
	// underTest.feedAll(); // feeds all of the pets in the shelter
	//
	// int hunger = pet.getHunger();
	// assertEquals(15, hunger);
	//
	// }

}
