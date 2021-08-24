package inheritancePolymorphism;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RotaryPhoneTest {
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void rotaryPhone_initializesFields() {
		RotaryPhone rotaryPhone1 = new RotaryPhone();
		equals(rotaryPhone1.toString());
	}

	@Test
	void call_returnsMessageIncludingTheNumberProvided() {
		RotaryPhone rotaryPhone2 = new RotaryPhone(); 
	}

}