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
		VirtualPet underTest = new VirtualPet("", "");

		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnVirtualPetName() {
		VirtualPet underTest = new VirtualPet("", "");
		String check = underTest.getName();
		assertEquals("", check);
	}

	@Test
	public void shouldReturnVirtualPetDescription() {
		VirtualPet underTest = new VirtualPet("", "");
		String check = underTest.getDescription();
		assertEquals("", check);
	}

	@Test
	public void shouldContstructVirtualPetStatsHungerWaterAndBordem() {
		VirtualPet underTest = new VirtualPet(0, 0, 0);

		assertNotNull(underTest);
	}

}
