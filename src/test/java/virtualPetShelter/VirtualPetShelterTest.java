package virtualPetShelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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
		underTest.add(check);
		VirtualPet retrieved = underTest.findPet(PET_NAME);
		assertThat(retrieved, is(check));
	}

}
