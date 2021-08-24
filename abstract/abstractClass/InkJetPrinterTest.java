package abstractClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

	/**
	 * JUnit tests to test class InkjetPrinter from Lab Abstract.
	 * This test class should not be changed.
	 */
	class InkjetPrinterTest {
		
		private InkJetPrinter printer;

		@BeforeEach
		void setUp() throws Exception {
			printer = new InkJetPrinter(123);
		}	

		@Test
		void testInkejetPrinter_full() {
			InkJetPrinter p = new InkJetPrinter(321);
			assertEquals(100, p.getRemainingCartridge());
		}

		@Test
		void print_once_reduceCartridgeBy10percent() {
			assertEquals(90, printer.getRemainingCartridge() - 10);
		}	

		@Test
		void print_threeTimes_reduceCartridgeBy30percent() {
			assertEquals(70, printer.getRemainingCartridge() - 30);
		}	

		@Test
		void print_elevenTimes_reduceCartridgeUntil0() {
			
			printer.print();
			assertEquals(0, printer.getRemainingCartridge());
			// still 0
		}

		@Test
		void refillCartridge_full_remainsFull() {
			assertEquals(100, printer.getRemainingCartridge());
		}	

		@Test
		void refillCartridge_notFull_fillsUpTo100() {
			for(int i = 0; i < 5; i++) {
				printer.getRemainingCartridge();
			}
			assertEquals(100, printer.getRemainingCartridge());
		}

	}