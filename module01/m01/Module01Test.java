package m01;

import org.junit.jupiter.api.Test;

/**
 * The purpose of these tests
 * is to determine whether the
 * expected functionality was, or not, 
 * properly implemented.
 * 
 * @author Kevin Mora
 *
 */
class Module01Test {
	
	/**
	 * JUnit related to the <code>transform</code>
	 * method within the Module01.java class.
	 */
	@Test
	void testTransform_UpperLowerCase_1() {
		Module01.transform("CsIS1410");
	}
	@Test
	void testTransform_SpaceBetween_2() {
		Module01.transform("Cs 2410");
	}
	@Test
	void testTransform_AllLowerCaseSpace_3() {
		Module01.transform("css 1430");
	}
	@Test
	void testTransform_UnrelatedString_4() {
		Module01.transform("Cisco_sale");
	}
	@Test
	void testTransform_CisBehavior_5() {
		Module01.transform("cIs1340dfkbjj");
	}
	
	/**
	 * JUnit related to the <code>dashBuilder</code>
	 * method within the Module01.java class.
	 */
	@Test
	void testDashBuilder_CityWithSpaces_1() {
		Module01.dashBuilder("Salt Lake City");
	}
	@Test
	void testDashBuilder_Palindrome_2() {
		Module01.dashBuilder("1 12 123 21 1");
	}
	@Test
	void testDashBuilder_SentenceExample_3() {
		Module01.dashBuilder("Texas is not in Europe!");
	}
	@Test
	void testDashBuilder_StrangeAbstractionSentence_4() {
		Module01.dashBuilder("D as hes a r e co ol");
	}
	@Test
	void testDashBuilder_Binary_5() {
		Module01.dashBuilder("1 0 1 0 0 1 0 1");
	}

	/**
	 * JUnit related to the <code>upperCombination</code>
	 * method within the Module01.java class.
	 */
	@Test
	void testUpperCombination_CSIS_example_1() {
		Module01.upperCombination("csis1410");
	}
	@Test
	void testUpperCombination_ToUpperCase_2() {
		Module01.upperCombination("this sentence will be uppercase");
	}
	@Test
	void testUpperCombination_UpperLowerCombination_3() {
		Module01.upperCombination("i Am HaPpY tOdAY");
	}
	@Test
	void testUpperCombination_StateExample_4() {
		Module01.upperCombination("caLIforNIA");
	}
	@Test
	void testUpperCombination_StrangeCombination_5() {
		Module01.upperCombination("Gui214jdshJSDH214");
	}
}