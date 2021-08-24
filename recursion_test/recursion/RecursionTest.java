package recursion;

import org.junit.jupiter.api.Test;

class RecursionTest {
	
	/**
	 * Tests related to the 
	 * <code>sumOfDigits</code>
	 * method in JUnit.
	 */
	@Test
	void testSumOfDigits_NegativeValue_1() {
		Recursion.sumOfDigits("-34");
	}
	@Test
	void testSumOfDigits_FourNumbers_2() {
		Recursion.sumOfDigits("1038");
	}
	@Test
	void testSumOfDigits_ElevenNumbers_3() {
		Recursion.sumOfDigits("17248969420");
	}
	@Test
	void testSumOfDigits_BinaryDigits_4() {
		Recursion.sumOfDigits("0100100001001001");
	}
	@Test
	void testSumOfDigits_TwentyFiveNumbers_5() {
		Recursion.sumOfDigits("5367815671638538168159570");
	}
	@Test
	void testSumOfDigits_NegativeMillion_6() {
		Recursion.sumOfDigits("-6302836");
	}
	@Test
	void testSumOfDigits_Zero_7() {
		Recursion.sumOfDigits("0");
	}
	@Test
	void testSumOfDigits_NegativeBigValue_8() {
		Recursion.sumOfDigits("-000000012484");
	}

	/**
	 * Tests related to the 
	 * <code>countSmiles</code>
	 * method in JUnit.
	 */
	@Test
	void testCountSmiles_TwoConsecutiveSmiles_1() {
		char[] smiles = {'n', 'g', ':', ')', ':', ')'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_LastSingleSmile_2() {
		char[] smiles = {'[','a',':','b','(','c',')',':',' ',')','e',':',')'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_SpaceBetweenSmile_3() {
		char[] smiles = {':',' ',')'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_SadFace_4() {
		char[] smiles = {':','('};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_NameJimmyChen_5() {
		char[] smiles = {'J','i','m','m','y',' ','C','h','e','n'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_InverseSmile_6() {
		char[] smiles = {'(',':'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_ZeroSmiles_7() {
		char[] smiles = {'[','a',':','(','c',')',':',' ',')','e','P'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_OnlyNumbers_8() {
		char[] smiles = {'2','0','2','1','1','0','1','5','7','9','4','8'};
		Recursion.countSmiles(smiles,0);
	}

	/**
	 * Tests related to the 
	 * <code>toUpper</code>
	 * method in JUnit.
	 */
	@Test
	void testToUpper_AllLowerCase_1() {
		Recursion.toUpper("java");
	}
	@Test
	void testToUpper_DinosaurName_2() {
		Recursion.toUpper("micropachycephalosaurus");
	}
	@Test
	void testToUpper_AllUpperCase_3() {
		Recursion.toUpper("AWESOME");
	}
	@Test
	void testToUpper_TwoWords() {
		Recursion.toUpper("geometrical computation");
	}
	@Test
	void testToUpper_UpperLowerCombination_5() {
		Recursion.toUpper("cOmBInAtIoNs");
	}
	@Test
	void testToUpper_UpperLowerCombinationTwoWords_6() {
		Recursion.toUpper("kEvIn MOrA");
	}
	@Test
	void testToUpper_MultipleWords_7() {
		Recursion.toUpper("i ThINk jAVa iS GrEAt");
	}
	@Test
	void testToUpper_Sentence_8() {
		Recursion.toUpper("Euler is my favorite mathematician");
	}

}
