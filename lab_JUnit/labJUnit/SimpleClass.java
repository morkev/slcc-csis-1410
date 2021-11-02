package labJUnit;

/**
 * Simple class to demonstrate automated testing 
 * with JUnit Jupiter (JUnit 5).
 * 
 * @author Kevin Mora
 * 
 */
public class SimpleClass {
	
	/**
	 * Determines whether a given year is a leap year. 
	 * <p>
	 * @param y year
	 * @return true if <code>year</code> is a leap year and false otherwise.
	 * @throws IllegalArgumentException if <code>year</code> is not positive.
	 */
	public static boolean isLeapYear(int year) {  
		
		if(year <= 0) {
			throw new IllegalArgumentException("Wrong value.");
		}
		
		// exactly divided by 4
		if (year % 4 == 0) {
			// if the year is exactly divided by 100
			if (year % 100 == 0) {
		        // if year is divided by 400
		        // then it is a leap year
		        if (year % 400 == 0) {
		        	return true;
		        } else {
		        	return false;
		        }
		        	
			}
		      // if year can't be 
			  // exactly divided by 100
		      else
		    	  return true;
		}
			else
				return false;
	}
	
}