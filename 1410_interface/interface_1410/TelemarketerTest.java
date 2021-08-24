package interface_1410;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelemarketerTest {

	@Test
	void giveSalesPitch_returnsNamePlusMessage() {
		Telemarketer t = new Telemarketer("Fritz", 27);
		assertTrue(Telemarketer.giveSalesPitch().matches("Fritz pressures others to buy stuff.?"));
	}
	
	@Test
	void annoy_returnsNamePlusMessage() {
		Telemarketer t = new Telemarketer("Fritz", 27);
		assertTrue(t.annoy().matches("Fritz annoys by giving a sales pitch.?"));
	}

}