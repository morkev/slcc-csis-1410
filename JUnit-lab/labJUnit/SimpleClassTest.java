package labJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleClassTest {

	@Test
	void isLeapYear_YearIsMultipleOf4ButNotOf100_True() {
		assertTrue(SimpleClass.isLeapYear(2024));
	}
	
	@Test
	void isLeapYear_YearIsMultipleOf100ButNotOf400_False() {
		assertFalse(SimpleClass.isLeapYear(1900));
	}
	
	@Test
	void isLeapYear_YearIsMultipleOf400_True() {
		//here
		assertTrue(SimpleClass.isLeapYear(2000), 
				"Years that can be exactly divided by 400, should be leap years.");
	}
	
	@Test
	void isLeapYear_YearIsNotMultipleOf4_False() {
		assertFalse(SimpleClass.isLeapYear(2021));
	}
	
	@Test
	void isLeapYear_YearIsZero_ThrowsIllegalArgumentException() {
	   assertThrows(IllegalArgumentException.class, 
			   () -> {SimpleClass.isLeapYear(0);});
	}
	
	@Test
	void isLeapYear_YearIsNegative_ThrowsIllegalArgumentException() {
	   assertThrows(IllegalArgumentException.class, 
			   () -> {SimpleClass.isLeapYear(-400);});
	} 

}