package collections;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Creates a total of 24 JUnit tests 
 * – 8 for each method in class 
 * <code>GenericCollections</>
 * 
 * @author Kevin Mora
 */
class GenericCollectionsTest {
	
	/**
	 * JUnits related to the first method in class GenericCollections:
	 * public static List<String> lettersAndNumbers(List<Character> list)
	 */
	@Test
	void lettersAndNumbers_emptyList() {
		List<String> expected = new ArrayList<>();
		List<Character> arg = new ArrayList<>();
		assertEquals(expected, GenericCollections.lettersAndNumbers(arg));
	}
	
	@Test
	void lettersAndNumbers_listIsNull() {
		List<Character> arg = null;
		assertEquals(null, GenericCollections.lettersAndNumbers(arg));
	}
	
	@Test
	void lettersAndNumbers_symbols() {
		List<Character> arg = new ArrayList<>();
			arg.add('@');
			arg.add('~');
			arg.add('+');
		List<String> expected = new ArrayList<>();
		assertEquals(expected, GenericCollections.lettersAndNumbers(arg));
	}
	
	@Test
	void lettersAndNumbers_UpperCaseLetters() {
		List<Character> arg = new ArrayList<>();
			arg.add('&');
			arg.add('S');
			arg.add('O');
			arg.add('$');
			arg.add('T');
		List<String> expected = new ArrayList<>();
			expected.add("U(t)");
			expected.add("U(o)");
			expected.add("U(s)");
		assertEquals(expected, GenericCollections.lettersAndNumbers(arg));
	}
	
	@Test
	void lettersAndNumbers_LowerCaseLetters() {
		List<Character> arg = new ArrayList<>();
			arg.add('+');
			arg.add('p');
			arg.add('o');
			arg.add('%');
			arg.add('j');
		List<String> expected = new ArrayList<>();
			expected.add("L(j)");
			expected.add("L(o)");
			expected.add("L(p)");
		assertEquals(expected, GenericCollections.lettersAndNumbers(arg));
	}
	
	@Test
	void lettersAndNumbers_numbers() {
		List<Character> arg = new ArrayList<>();
			arg.add('1');
			arg.add('*');
			arg.add('4');
			arg.add('+');
			arg.add('3');
			arg.add('-');
			arg.add('2');
		List<String> expected = new ArrayList<>();
			expected.add("N(2)");
			expected.add("N(3)");
			expected.add("N(4)");
			expected.add("N(1)");
		assertEquals(expected, GenericCollections.lettersAndNumbers(arg));
	}
	
	@Test
	void lettersAndNumbers_nullInList() {
		List<Character> arg = new ArrayList<>();
			arg.add(null);
			arg.add('a');
			arg.add('+');
			arg.add('C');
		List<String> expected = new ArrayList<>();
			expected.add("U(c)");
			expected.add("L(a)");
			expected.add(null);
		assertEquals(expected, GenericCollections.lettersAndNumbers(arg));
	}
	
	@Test
	void lettersAndNumbers_all() {
		List<Character> arg = new ArrayList<>();
			arg.add('?');
			arg.add('a');
			arg.add('B');
			arg.add('5');
			arg.add('%');
			arg.add(null);
		List<String> expected = new ArrayList<>();
			expected.add(null);
			expected.add("N(5)");
			expected.add("U(b)");
			expected.add("L(a)");
		assertEquals(expected, GenericCollections.lettersAndNumbers(arg));
	}
	
	/**
	 * JUnits related to the second method in class GenericCollections:
	 * public static int modify(List<Integer> list)
	 */
	@Test
	void modify_listIsNull() {
		assertThrows(NullPointerException.class, () -> {
			GenericCollections.modify(null);
		});
	}
	
	@Test
	void modify_multiplesOfThree() {
		List<Integer> arg = new ArrayList<>();
			arg.add(-3);
			arg.add(0);
			arg.add(27);
		List<Integer> expected = new ArrayList<>();
			expected.add(4);
			expected.add(5);
			expected.add(6);
			expected.add(8);
			expected.add(10);
			expected.add(12);
			expected.add(12);
			expected.add(15);
			expected.add(16);
			expected.add(18);
			expected.add(20);
			expected.add(20);
			expected.add(24);
			expected.add(25);
			expected.add(30);
		assertEquals(13, GenericCollections.modify(arg));
		assertEquals(expected, arg);
	}
	
	@Test
	void modify_emptyList() {
		List<Integer> arg = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
			expected.add(4);
			expected.add(5);
			expected.add(6);
			expected.add(8);
			expected.add(10);
			expected.add(12);
			expected.add(12);
			expected.add(15);
			expected.add(16);
			expected.add(18);
			expected.add(20);
			expected.add(20);
			expected.add(24);
			expected.add(25);
			expected.add(30);
		assertEquals(13, GenericCollections.modify(arg));
		assertEquals(expected, arg);
	}
	
	@Test
	void modify_noMultiplesOfThree() {
		List<Integer> arg = new ArrayList<>();
			arg.add(1);
			arg.add(2);
		List<Integer> expected = new ArrayList<>();
			expected.add(1);
			expected.add(2);
			expected.add(4);
			expected.add(5);
			expected.add(6);
			expected.add(8);
			expected.add(10);
			expected.add(12);
			expected.add(12);
			expected.add(15);
			expected.add(16);
			expected.add(18);
			expected.add(20);
			expected.add(20);
			expected.add(24);
			expected.add(25);
			expected.add(30);
		assertEquals(15, GenericCollections.modify(arg));
		assertEquals(arg, expected);
	}
	
	@Test
	void modify_duplicates() {
		List<Integer> arg = new ArrayList<>();
			arg.add(4);
			arg.add(5);
			arg.add(6);
			arg.add(8);
			arg.add(10);
			arg.add(12);
			arg.add(12);
			arg.add(15);
			arg.add(16);
			arg.add(18);
			arg.add(20);
			arg.add(20);
			arg.add(24);
			arg.add(25);
			arg.add(30);
		List<Integer> expected = new ArrayList<>();
			expected.add(4);
			expected.add(4);
			expected.add(5);
			expected.add(5);
			expected.add(6);
			expected.add(8);
			expected.add(8);
			expected.add(10);
			expected.add(10);
			expected.add(12);
			expected.add(12);
			expected.add(15);
			expected.add(16);
			expected.add(16);
			expected.add(18);
			expected.add(20);
			expected.add(20);
			expected.add(20);
			expected.add(20);
			expected.add(24);
			expected.add(25);
			expected.add(25);
			expected.add(30);
		assertEquals(13, GenericCollections.modify(arg));
		assertEquals(expected, arg);
	}
	
	@Test
	void modify_ascendingOrder() {
		List<Integer> arg = new ArrayList<>();
			arg.add(-100);
			arg.add(-151);
			arg.add(-150);
			arg.add(151);
			arg.add(100);
		List<Integer> expected = new ArrayList<>();
			expected.add(-151);
			expected.add(-100);
			expected.add(4);
			expected.add(5);
			expected.add(6);
			expected.add(8);
			expected.add(10);
			expected.add(12);
			expected.add(12);
			expected.add(15);
			expected.add(16);
			expected.add(18);
			expected.add(20);
			expected.add(20);
			expected.add(24);
			expected.add(25);
			expected.add(30);
			expected.add(100);
			expected.add(151);
		assertEquals(17, GenericCollections.modify(arg));
		assertEquals(expected, arg);
	}
	
	@Test
	void modify_nullInList() {
		List<Integer> arg = new ArrayList<>();
		arg.add(null);
		assertThrows(NullPointerException.class, () -> {
			GenericCollections.modify(null);
		});
	}
	
	@Test
	void modify_largeNumbers() {
		List<Integer> arg = new ArrayList<>();
			arg.add(2187);
			arg.add(2186);
			arg.add(-2190);
			arg.add(-2189);
		List<Integer> expected = new ArrayList<>();
			expected.add(-2189);
			expected.add(4);
			expected.add(5);
			expected.add(6);
			expected.add(8);
			expected.add(10);
			expected.add(12);
			expected.add(12);
			expected.add(15);
			expected.add(16);
			expected.add(18);
			expected.add(20);
			expected.add(20);
			expected.add(24);
			expected.add(25);
			expected.add(30);
			expected.add(2186);
		assertEquals(15, GenericCollections.modify(arg));
		assertEquals(expected, arg);
	}
	
	/**
	 * JUnits related to the third method in class GenericCollections:
	 * public static void removeEveryNthElement(List<?> list, int n)
	 */
	@Test
	void removeEveryNthElement_nEqualsZero() {
		List<?> arg = new ArrayList<>();
		assertThrows(IllegalArgumentException.class, () -> {
			GenericCollections.removeEveryNthElement(arg, 0);
		});
	}
	
	@Test
	void removeEveryNthElement_nIsNegative() {
		List<?> arg = new ArrayList<>();
		assertThrows(IllegalArgumentException.class, () -> {
			GenericCollections.removeEveryNthElement(arg, -420);
		});
	}
	
	@Test
	void removeEveryNthElement_listIsNull() {
		List<?> arg = null;
		assertThrows(IllegalArgumentException.class, () -> {
			GenericCollections.removeEveryNthElement(arg, 1);
		});
	}
	
	@Test
	void removeEveryNthElement_nIsGreaterThanList() {
		List<Integer> arg = new ArrayList<>();
			arg.add(1);
			arg.add(7);
		List<Integer> expected = new ArrayList<>();
			expected.add(1);
			expected.add(7);
		GenericCollections.removeEveryNthElement(arg, 100);
		assertEquals(expected, arg);
	}
	
	@Test
	void removeEveryNthElement_multipleNthElements() {
		List<String> arg = new ArrayList<>();
			arg.add("aa");
			arg.add("7");
			arg.add("eri");
			arg.add("sgdjr");
			arg.add("yikes");
		List<String> expected = new ArrayList<>();
			expected.add("aa");
			expected.add("eri");
			expected.add("yikes");
		GenericCollections.removeEveryNthElement(arg, 2);
		assertEquals(expected, arg);
	}
	
	@Test
	void removeEveryNthElement_nIsOne() {
		List<Character> arg = new ArrayList<>();
			arg.add('a');
			arg.add('7');
			arg.add('9');
			arg.add('$');
			arg.add('*');
		List<Character> expected = new ArrayList<>();
		GenericCollections.removeEveryNthElement(arg, 1);
		assertEquals(expected, arg);
	}
	
	@Test
	void removeEveryNthElement_listIsEmpty() {
		List<Boolean> arg = new ArrayList<>();
		List<Boolean> expected = new ArrayList<>();
		GenericCollections.removeEveryNthElement(arg, 8);
		assertEquals(expected, arg);
	}
	
	@Test
	void removeEveryNthElement_nullInList() {
		List<Integer> arg = new ArrayList<>();
			arg.add(null);
			arg.add(8);
			arg.add(9);
			arg.add(5);
		List<Integer> expected = new ArrayList<>();
			expected.add(null);
			expected.add(8);
			expected.add(5);
		GenericCollections.removeEveryNthElement(arg, 3);
		assertEquals(expected, arg);
	}

}