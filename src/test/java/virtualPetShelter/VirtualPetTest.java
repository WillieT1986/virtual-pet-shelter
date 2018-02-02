package virtualPetShelter;

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

	// @Test
}
