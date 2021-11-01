package m01;

/**
 * Creates an output including
 * elements such as substitution,
 * elimination, and trimming.
 * 
 * The output substitutes dashes (-)
 * in the place of spaces. It also
 * recognizes a specific set of characters,
 * and replaces them with a given parameter.
 * Converts to UpperCase, and sets a particular
 * character at the beginning and end of each sentence.
 * 
 * @author Kevin Mora | CSIS-1410
 */
public class Module01 {
	
	/**
	 * The main method helps us understand the
	 * purpose and functionality of each method.
	 * 
	 * <code>dashBuilder(upperCombination(transform(x)))</code>
	 * outputs the expected examples.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String x = "CsIs 1410";
		System.out.println("Dash substitutes spaces:");
		System.out.println(dashBuilder(x));
		System.out.println("Adds '<' at the beginning, and '>' at the end of the sentence:");
		System.out.println(upperCombination(x));
		System.out.println("Replaces and identifies the CSIS parameters:");
		System.out.println(transform(x));
		// The following combination of methods creates the desired output.
		System.out.println("All methods combined – expected output:");
		System.out.println(dashBuilder(upperCombination(transform(x))));
	}
	
	/**
	 * If the word contains "csis", "cis", 
	 * or "cs"; then the return value 
	 * will substitute them with "CSIS"
	 * in UpperCase.
	 * 
	 * @param word of type String.
	 * @return word to UpperCase.
	 *
	 */
	public static String transform(String word) {
		word = word.replaceAll("(?i)csis", "cs").
				replaceAll("(?i)cs", "csis").replaceAll("(?i)cis", "csis");
		
		return word.toUpperCase();
	}
	
	/**
	 * Converts the spaces within quote
	 * marks of a String to dashes.
	 * 
	 * @param str of type String.
	 * @return a String replacing
	 * all spaces with a dash (-).
	 */
	public static String dashBuilder(String str) {
		return str.replace(" ", "-").trim();
	}
	
	/**
	 * Adds "<" to the beginning of the 
	 * String, and ">" at the end of such.
	 * 
	 * @param str of type String
	 * @return a string with the initial values 
	 * and "bigger/smaller than" symbols<code> <> </code>
	 * at the beginning and end of the sentence.
	 */
	public static String upperCombination(String str) {
		return String.format("<%s>", str);
	}

}
