package interface_1410;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsectTest {

	Insect insect = new Insect("wasp");

	@Test
	void insect_InitializesSpecies() {
		Insect insect1 = new Insect("bee");
		assertEquals("bee", Insect.getSpecies());
	}

	@Test
	void getSpecies_returnsSpecies() {
		assertEquals("wasp", Insect.getSpecies());
	}

	@Test
	void toString_returnsClassNameColonAndSpecies() {
		assertEquals("Insect: wasp", insect.toString());
	}

}
