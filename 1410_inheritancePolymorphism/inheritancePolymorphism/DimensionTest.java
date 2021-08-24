package inheritancePolymorphism;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DimensionTest {

	Dimension d1 = new Dimension(19, 12, 15);
	Dimension d2 = new Dimension(14.4, 12.1, 18.4);
	
	@Test
	void dimension_initializesFields() {
		Dimension d = new Dimension(13.2, 16, 14.9);
		assertEquals("(13.2 x 16.0 x 14.9)", d.toString());
	}

	@Test
	void dimension_nonPositiveHeight_ThrowsIllegalArgumentException() {
		Exception exception = assertThrows(IllegalArgumentException.class, 
				() -> {new Dimension(0, 10.3, 9);});
	}
	
	@Test
	void dimension_nonPositiveWidtht_ThrowsIllegalArgumentException() {
		Exception exception = assertThrows(IllegalArgumentException.class, 
				() -> {new Dimension(13.6, 0, 9);});
	}

	@Test
	void dimension_nonPositiveDepth_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, 
				() -> {new Dimension(13.6, 10.3, 0);});
	}
	
	@Test
	void dimension_negativeValues_ThrowsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, 
				() -> {new Dimension(-13.6, -10.3, -9);});
	}
	
	@Test
	void getHeight_wholeNumberDimensions() {
		equals(d1.getHeight());
	}

	@Test
	void getHeight_floatingPointNumberDimensions() {
		assertEquals(14.4, d2.getHeight());
	}
	
	@Test
	void getWidth_wholeNumberDimensions() {
		equals(d1.getWidth());
	}

	@Test
	void getWidth_floatingPointNumberDimensions() {
		assertEquals(12.1, d2.getWidth());
	}
	
	@Test
	void getDepth_wholeNumberDimensions() {
		equals(d1.getDepth());
	}

	@Test
	void getDepth_floatingPointNumberDimensions() {
		assertEquals(18.4, d2.getDepth());
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void toString_wholeNumberDimension_DisplayZeroAfterDecimalPoint() {
		equals(d1.toString());
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void toString_floatingPointNumberDimension_DisplayOneDecimalDigit() {
		equals(d2.toString());
	}


}
