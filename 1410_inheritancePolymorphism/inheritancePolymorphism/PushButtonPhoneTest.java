package inheritancePolymorphism;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PushButtonPhoneTest {
	
	@Test
	@SuppressWarnings("unused")
	void pushButtonPhone_initializesFields() {
		PushButtonPhone pushButtonPhone1 = new PushButtonPhone();
	}
	
	@Test
	@SuppressWarnings("static-access")
	void call_returnsMessageIncludingTheNumberProvided() {
		PushButtonPhone pushButtonPhone2 = new PushButtonPhone(); 
		assertTrue(pushButtonPhone2.call()
				.matches("Pushing buttons to call 8015817200.?")); 
	}

}
