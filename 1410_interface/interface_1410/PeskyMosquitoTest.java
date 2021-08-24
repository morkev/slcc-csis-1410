package interface_1410;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PeskyMosquitoTest {

	@Test
	@SuppressWarnings("static-access")
	void testPeskyMosquito() {
		PeskyMosquito mosquito = new PeskyMosquito("Anopheles", "freeborni");
		assertEquals("Anopheles", mosquito.getSpecies());
	}

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void testBite() {
		String message = new PeskyMosquito("Culex", " pipiens").bite();
		equals(message.matches("suckingBlood"));
	}

}