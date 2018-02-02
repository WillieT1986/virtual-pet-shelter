package virtualPetShelter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldInstantiateVirtualPet() {
		VirtualPet underTest = new VirtualPet();

		assertNotNull(underTest);
	}

}
