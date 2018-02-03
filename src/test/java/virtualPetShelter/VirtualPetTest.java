package virtualPetShelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {

	// This created the Virtual Pet Class
	// @Test
	// public void shouldInstantiateVirtualPet() {
	// VirtualPet underTest = new VirtualPet;
	//
	// assertNotNull(underTest);
	// }

	@Test
	public void shouldConstructNameAndDescription() {
		VirtualPet underTest = new VirtualPet("name", "description");
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnVirtualPetName() {
		VirtualPet underTest = new VirtualPet("name", "description");
		String check = underTest.getName();
		assertEquals("name", check);
	}

	@Test
	public void shouldReturnVirtualPetDescription() {
		VirtualPet underTest = new VirtualPet("name", "description");
		String check = underTest.getDescription();
		assertEquals("description", check);
	}

	@Test
	public void shouldContstructVirtualPetStatsNameDescriptionHungerWaterAndBordem() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnVirtualPetHunger() {
		VirtualPet underTest = new VirtualPet("name", "description", 1, 0, 0);
		int check = underTest.getHunger();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnVirtualPetWater() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 1, 0);
		int check = underTest.getWater();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnVirtualPetBordem() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 1);
		int check = underTest.getBordem();
		assertEquals(1, check);
	}

	@Test
	public void shouldFeedPet() {
		VirtualPet underTest = new VirtualPet("name", "description", 0, 0, 1);
		underTest.feedPet();
		int check = underTest.getHunger();
		assertEquals(2, check);

	}

}
