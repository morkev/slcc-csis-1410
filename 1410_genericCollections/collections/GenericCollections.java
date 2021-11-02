package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This program helps us test the functionality 
 * provided by generic collections, practice
 * the creation of algorithms, and JUnit testing.
 * 
 * @author Kevin Mora
 */
public class GenericCollections {
	
	/**
	 * This method creates a new list based on the rules below.
	 * 
	 * Characters that are neither letters nor numbers are ignored.
	 * The new list includes a string representation of each character 
	 * that is either a letter or a number. 
	 * 
	 * Representations are listed in reverse order.
	 * Each LowerCase letter is represented as L({letter})
	 * An UpperCase L followed by a pair of parentheses 
	 * and the LowerCase letter in between.
	 * Each UpperCase letter is represented as U({letter})
	 * An UpperCase U followed by a pair of parentheses 
	 * and the letter (again spelled in LowerCase) in between.
	 * Each number is represented as N({number})
	 * An UpperCase N followed by a pair of parentheses 
	 * and the number in between.
	 * An empty list should return an empty string.
	 * If the argument passed to the method is null, 
	 * the method should return null.
	 *  
	 * IMPORTANT: The list passed as an argument 
	 * must not be changed in the process.
	 */
	public static List<String> lettersAndNumbers(List<Character> list) {
		if (list == null) {
			return null;
		}
		List<String> result = new ArrayList<>();
		
		for(int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i) == null) {
				result.add(null);
			} else if (Character.isLowerCase(list.get(i))) {
				result.add("L(" + list.get(i) + ")");
			} else if (Character.isUpperCase(list.get(i))) {
				result.add("U(" + Character.toLowerCase(list.get(i)) + ")");
			} else if(Character.isDigit(list.get(i))) {
				result.add("N(" + list.get(i) + ")");
			}
		}
		return result;
	}
	
	/**
	 * This method changes the list by applying a 
	 * number of changes based on the following rules:
	 * 
	 * If the list is null, a NullPointerException should be thrown. 
	 * It should include a message that informs the user that the 
	 * list must not be null.
	 * Delete all multiples of 3.
	 * Add the first 5 multiples of 4, 5, and 6.
	 * 
	 * Sort the list in ascending order.
	 * 
	 * @return the number of unique elements in the 
	 * modified list (not counting the duplicates).
	 */
	public static int modify(List<Integer> list) {
		if (list == null) {
			throw new NullPointerException("List cannot be null");
		}
		list.forEach(el -> {
			if (el == null) {
				throw new NullPointerException("List cannot contain null elements");
			}
		});
		list.removeIf(n -> n % 3 == 0);
			for(int i = 1; i <= 5; i++) {
				list.add(i * 4);
				list.add(i * 5);
				list.add(i * 6);
			}
		Collections.sort(list);
		Set<Integer> countSetter = new HashSet<>(list);
		return countSetter.size();
	}
	
	/**
	 * This method modifies the list by removing every Nth element.
	 * 
	 * If n is zero or negative, an IllegalArgumentException should be thrown. 
	 * If the list is null, a NullPointerException should be thrown. 
	 * It should include a message that informs the user that the list must not be null.
	 * It should include a message that informs the user that n needs 
	 * to be a positive number.
	 * 
	 * Note: The interface list includes two remove methods. 
	 * One removes a specific object, the other removes an 
	 * object on a specific position (index).
	 */
	public static void removeEveryNthElement(List<?> list, int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n must be positive");
		}
		if (list == null) {
			throw new IllegalArgumentException("list cannot be null");
		}
		
		for(int i = 0, j = 1; i < list.size(); i++, j++) {
			if (j % n == 0) {
				list.remove(i);
				i--;
			}
		}
	}
}
