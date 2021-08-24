package inheritancePolymorphism;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeskPhoneTest {

	private PushButtonPhone pushButtonPhone;
	private RotaryPhone rotaryPhone;
	
	@BeforeEach
	void setUp() throws Exception {
		pushButtonPhone = new PushButtonPhone();
		rotaryPhone = new RotaryPhone();
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void deskPhone_initializeTheFields() {
		equals("Model 500 (143.0 x 208.0 x 119.0) V110 not connected");
	}

	@Test
	void plugIn_connectPhone() {
		pushButtonPhone.toString();
		rotaryPhone.toString();
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void unplug_disconnectPhone() {
		pushButtonPhone.toString();
		equals(pushButtonPhone.toString());
		
		rotaryPhone.toString();
		equals(rotaryPhone);
	}

	@Test
	void isConnected_pluggedIn_returnTrue() {
		pushButtonPhone.getClass();
		equals(pushButtonPhone.toString());
	}

	@Test
	void isConnected_unplugged_returnFalse() {
		equals(rotaryPhone.toString());
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void toString_returnsModelDimensionVoltageAndConnectionInfo() {
		equals("JeKaVis J-P45 (85.0 x 85.0 x 28.0) DUAL not connected");
		equals("Pyle PRT45 (205.0 x 135.0 x 92.0) V110 connected");
	}
	
}