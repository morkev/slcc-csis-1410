package interface_1410;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MosquitoTest {

	Mosquito m = new Mosquito("Aedes", "vexans");

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void buzz_returnsSpeciesPlusMessage() {
		equals(m.buzz().matches("Aedesvexanzs"));
	}

	@Test
	void annoy_returnsMessage() {
		assertEquals("buzz buzz buzz", m.annoy());
	}
}