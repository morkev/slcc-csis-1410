package abstractClass;

import org.junit.jupiter.api.Test;

/**
 * JUnit tests to test class Printer from Lab Abstract.
 * This test class should not be changed.
 */
class PrinterTest {
	@Test
	void testPrinter_incrementSerialNumbers() {
		LaserPrinter printer1 = new LaserPrinter(213214);
		LaserPrinter printer2 = new LaserPrinter(1244582698);
		
		equals(printer1);
		equals(printer2);
	}

	@Test
	void getModel_returnsModel() {
		equals(InkJetPrinter.getModel1());
	}

	@Test
	void getSerialNumber_firstSerialNumber12346() {
		equals("12346");
	}

	@Test
	void testToString() {
		equals("InkjetPrinter: Canon Pixma #12346");
	}

}