package codingBat;

import org.junit.jupiter.api.Test;

/**
 * Setting up tests that will be executed 
 * with the method <code>wordEnds</code>
 * in order to determine the accuracy of
 * the program.
 * 
 * @author kevinmora
 *
 */
class CodingBatTest {

	@Test
	void testWordEnds_DoesSomething1() {
		CodingBat.wordEnds("abcXY123XYijk", "XY");
	}
	
	@Test
	void testWordEnds_DoesSomething2() {
		CodingBat.wordEnds("XY123XY", "XY");
	}
	
	@Test
	void testWordEnds_DoesSomething3() {
		CodingBat.wordEnds("XY1XY", "XY");
	}
	
	@Test
	void testWordEnds_DoesSomething4() {
		CodingBat.wordEnds("XYXY", "XY");
	}
	
	@Test
	void testWordEnds_DoesSomething5() {
		CodingBat.wordEnds("XY", "XY");
	}
	
	@Test
	void testWordEnds_DoesSomething6() {
		CodingBat.wordEnds("Hi", "XY");
	}
	
	@Test
	void testWordEnds_DoesSomething7() {
		CodingBat.wordEnds("", "XY");
	}
	
	@Test
	void testWordEnds_DoesSomething8() {
		CodingBat.wordEnds("abc1xyz1i1j", "1");
	}
	
	@Test
	void testWordEnds_DoesSomething9() {
		CodingBat.wordEnds("abc1xyz1", "1");
	}
	
	@Test
	void testWordEnds_DoesSomething10() {
		CodingBat.wordEnds("abc1xyz11", "1");
	}
	
	@Test
	void testWordEnds_DoesSomething11() {
		CodingBat.wordEnds("abc1xyz1abc", "abc");
	}
	
	@Test
	void testWordEnds_DoesSomething12() {
		CodingBat.wordEnds("abc1xyz1abc", "b");
	}
	
	@Test
	void testWordEnds_DoesSomething13() {
		CodingBat.wordEnds("abc1abc1abc", "abc");
	}

}