package labCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a list of numbers to review the 
 * method forEach and lambda expressions. 
 * 
 * Implements the method removeIf,
 * and the Interface Predicate<T>.
 * 
 * @author Kevin Mora
 *
 */
public class Warmup {
	
	/**
	 * Creates a List of all even numbers between 2-50, 
	 * and performs mutations on it.
	 */
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for(int i = 2; i <= 50; i += 2) {
			numbers.add(i);
		}
		System.out.print("Numbers: ");
		printNumbers(numbers);
		System.out.println("\nRemoving multiples of three...");
		numbers.removeIf(n -> n % 3 == 0);
		printNumbers(numbers);
	}
	
	/**
	 * Prints all elements of a List<Integer>
	 * @param numbers
	 */
	private static void printNumbers(List<Integer> numbers) {
		numbers.forEach(n -> System.out.print(n + " "));
	}
}