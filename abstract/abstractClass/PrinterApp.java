package abstractClass;

/**
 * Displays information about the printers, 
 * and demonstrates how the cartridge/toner 
 * change as the printers print and refill.
 * 
 * @author Kevin Mora
 */
public class PrinterApp {

	public static void main(String[] args) {
		
		InkJetPrinter iPrinter = new InkJetPrinter(12346);
		LaserPrinter lPrinter = new LaserPrinter(12347);

			System.out.println(iPrinter + " " + InkJetPrinter.getModel1());
			printerUsage();
			
			System.out.println(lPrinter + " " + InkJetPrinter.getModel2());
			printerUsage();
		
		System.out.println("Remaining cartridge after refilling: " + 
				LaserPrinter.getRemainingToner() + "%");
		
		System.out.println("Remaining toner after refilling: " + 
				LaserPrinter.getRemainingToner() + "%");
	}
	
	/**
	 * Displays the toner/cartridge
	 * left in the Printer with relation 
	 * to the <code>InkJetPrinter</code>
	 * class <code>-=10</code> process. 
	 * 
	 * Creates an array of printers, 
	 * and adds two printers.
	 */
	static void printerUsage() {
		
		InkJetPrinter iPrinter = new InkJetPrinter(12346);
		LaserPrinter lPrinter = new LaserPrinter(12347);
		
		Printer printers[] = { iPrinter, lPrinter };
		for (Printer p : printers) {
			p.print();
			p.print();
			System.out.println();
		}
	}
}