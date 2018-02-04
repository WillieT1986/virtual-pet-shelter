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
	public void shouldRetrieveVirtualPetName() {
		VirtualPet check = new VirtualPet(PET_NAME, DESCRIPTION);
		underTest.intake(check);
		VirtualPet retrieved = underTest.findPet(PET_NAME);
		assertThat(retrieved, is(check));
	}

	@Test
	public void shouldIntakeMultipleVirtualPetNames() {
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

	@Test
	public void shouldAdoptVirtualPets() {
		String anotherName = "Akita";
		VirtualPet pet = new VirtualPet("Husky", DESCRIPTION);
		VirtualPet anotherPet = new VirtualPet(anotherName, DESCRIPTION);

		underTest.adopt(pet);
		underTest.adopt(anotherPet);

		Collection<VirtualPet> pets = underTest.pets();

		assertThat(pets, containsInAnyOrder(pet, anotherPet));

		assertTrue(pets.contains(pet));
		assertTrue(pets.contains(anotherPet));
		assertEquals(2, pets.size());
	}

	// Feeding...?
	@Test
	public void shouldShelterFeedAllPet() {
		VirtualPet pet = new VirtualPet("Hold", "Akita");// will be 52

		underTest.intake(pet);
		underTest.intake(new VirtualPet("Hold2", "Akita2", 0, 0, 0)); // will be 2
		underTest.intake(new VirtualPet("Hold3", "Akita3")); // will be 52
		underTest.feedAll();
		VirtualPet testPet = underTest.findPet("Hold2");
		int hunger = testPet.getHunger();
		// assertEquals("Hold2", testPet.getName()); //looks for specific pet
		assertEquals(2, hunger); // This one will find the Hold2
		assertEquals(52, underTest.findPet("Hold3").getHunger()); // This one will find the Hold 3
	}

	@Test
	public void shouldShelterWaterAllPet() {
		VirtualPet pet = new VirtualPet("Hold", "Akita");

		underTest.intake(pet);
		underTest.intake(new VirtualPet("Hold2", "Akita2", 0, 2, 0));
		underTest.intake(new VirtualPet("Hold3", "Akita3"));
		underTest.waterAll();
		VirtualPet testPet = underTest.findPet("Hold2");
		int water = testPet.getWater();

		assertEquals(5, water);
		assertEquals(63, underTest.findPet("Hold3").getWater());

	}

	@Test
	public void shouldShelterPlayWithAllPet() {
		VirtualPet pet = new VirtualPet("Hold", "Akita");

		underTest.intake(pet);
		underTest.intake(new VirtualPet("Hold2", "Akita2", 0, 0, 2));
		underTest.intake(new VirtualPet("Hold3", "Akita3"));
		underTest.playAll();

		VirtualPet testPet = underTest.findPet("Hold2");

		int bordem = testPet.getBordem();
		assertEquals(3, bordem);
		assertEquals(71, underTest.findPet("Hold3").getBordem());
	}

	@Test
	public void shouldTickAllPets() {
		VirtualPet pet = new VirtualPet("Hold", "Akita");

		underTest.intake(pet);
		underTest.tickAll();

		assertEquals(49, underTest.findPet("Hold").getHunger());
		assertEquals(59, underTest.findPet("Hold").getWater());
		assertEquals(69, underTest.findPet("Hold").getBordem());
	}
}
