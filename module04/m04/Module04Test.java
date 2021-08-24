package m04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class Module04Test {

	/**
	 * Method 1 JUnit functionality test.
	 * Total tests = 3.
	 */
	@Test
	void testMethod1_first1000_positiveIntegers() {
		for(int i = 1; i < 1000; i++) {
			Module04.method1(i);
		}
	}
	
	@Test
	void testMethod1_reverseOrder() {
		List<Double> test = new ArrayList<Double>();
		Module04.method1(1453);
		Module04.method1(35);
		Module04.method1(1001001);
		Collections.sort(test, Collections.reverseOrder());
	}
	
	@Test
	void testMethod1_first500_negativeIntegers() {
		for(int i = 0; i != -500; i--) {
			Module04.method1(i);
		}
	}

	/**
	 * Method 2 JUnit functionality test.
	 * Total tests = 3.
	 */
	@Test
	void testMethod2_numberLimit() {
		int x = 420;
		Module04.method2(x);
		while(x != 69) {
			x -= 1;
		}
	}
	
	@Test
	void testMethod2_35BinaryLimitArray() {
		int num = 346362;
		Module04.method2(num);
		
		int[] binary = new int[35];
		int id = 0;
		
		while (num > 0) {
		    binary[id++] = num % 2;
			num = num / 2;
		}
	}
	
	@Test
	void testMethod2_noAdditionToList() {
		int z = -00010001000;
		Module04.method2(z);
	}

	/**
	 * Binary method test.
	 * Test 1/1 – additional.
	 */
	@Test
	void testPrintBinary() {
		Module04.printBinary(null, 21427);
	}
}
