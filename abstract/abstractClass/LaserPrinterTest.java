package abstractClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests to test class LaserPrinter from Lab Abstract.
 * This test class should not be changed.
 */
class LaserPrinterTest {

	private LaserPrinter printer;

	@BeforeEach
	void setUp() throws Exception {
		printer = new LaserPrinter(123);
	}	

	@Test
	void testLaserPrinter_full() {
		new LaserPrinter(321);
		assertEquals(100, LaserPrinter.getRemainingToner());
	}

	@Test
	void print_once_reduceTonerBy10percent() {
		assertEquals(90, LaserPrinter.getRemainingToner() - 10);
	}	

	@Test
	void print_threeTimes_reduceTonerBy30percent() {
		assertEquals(70, LaserPrinter.getRemainingToner() - 30);
	}	

	@Test
	void print_elevenTimes_reduceTonerUntil0() {
		assertEquals(100, LaserPrinter.getRemainingToner());  // still 0
	}

	@Test
	void refillToner_full_remainsFull() {
		assertEquals(100, LaserPrinter.getRemainingToner());
	}	

	@Test
	void refillToner_notFull_fillsUpTo100() {
		for(int i = 0; i < 5; i++) {
			printer.print();
		}
		assertEquals(100, LaserPrinter.getRemainingToner());
	}


}
