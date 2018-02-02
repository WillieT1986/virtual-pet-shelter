package virtualPetShelter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void shouldInstantiateVirtualPetShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();

		assertNotNull(underTest);
	}

}
