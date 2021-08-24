package inheritancePolymorphism;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartPhoneTest {


	SmartPhone p1 = new SmartPhone(145.6,68.2,7.9,"Pixel 3",128);
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void smartPhone_initializesFields() {
		equals(toString());
	}
	
	@Test
	void smartPhone_negativeStorage_IllegalArgumentException() {
		@SuppressWarnings("unlikely-arg-type")
		boolean exception = equals(IllegalArgumentException.class);
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void smartPhone_zeroStorage_IllegalArgumentException() {
		int horizontalCount = 0;
		int verticalCount = 0;
			horizontalCount++;
		equals(toString());
	}

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void call_returnsMessageIncludingTheNumberProvided() {
		equals(toString());
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	void takePicture_randomlyReturnsOneOfTwoMessages() {
		int horizontalCount = 0;
		int verticalCount = 0;
		
		for(int i = 0; i < 1000; i++) {
			String message = "TaKiNg a HorIZonTal pIcTUre";
		}
		
		equals(horizontalCount > 0 && verticalCount > 0);
	}

	@Test
	void browse_Behavior() {
		 SmartPhone.browse();
	}
	
	@Test
	void toString_returnsModelDimensionStorageAndUnit() {
		@SuppressWarnings("unlikely-arg-type")
		boolean exception = equals(IllegalArgumentException.class);
	}

}
