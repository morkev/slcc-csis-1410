package m04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Module 04 – CSIS 1410
 * @author Kevin Mora
 */
public class Module04 {
	
	/**
	 * Application launcher.
	 */
	public static void main(String[] args) {
		// test 1
		method1(2);
		// number < 1
		method1(-1);
		// test 2
        method2(12);
	}
	
	/**
	 * Divides the values of each double
	 * by 10 after converting the value 
	 * to a primitive data type. If the
	 * number is less than 1, then the 
	 * number will be excluded from the
	 * List. Duplicate elements are 
	 * dynamically eliminated, and
	 * the result is shown in descending
	 * order due to the Collections.
	 * 
	 * @param d of primitive type double
	 */
	public static double method1(double d) {
		List<Double> al = new ArrayList<Double>();
		
		if(d >= 1) {
			al.add(d);
		}
		
		for(Double num : al) {
			double d1 = num.doubleValue() / 10;
			System.out.println(d1);
		}
		
		al = al.stream().distinct().collect(Collectors.toList());
	    Collections.sort(al, Collections.reverseOrder());

		return d;
	}
	 
	/**
	 * Iterates over the array. If the 
	 * value is bigger than 10, it will 
	 * ignore the item and display an
	 * "item removed" message.
	 * 
	 * @param binary of type integer array
	 * @param id of type integer
	 */
	public static void printBinary(int[] binary, int id){
		if(id < 10) {
			for (int i = id - 1; i >= 0; i--) {
				System.out.print(binary[i] + "");
			}
		} else {
			System.out.println("[item removed]");
		}
	}
	 
	/**
	 * Converts integers to binary, 
	 * while numbers are positive.
	 * Creates and assigns the binary 
	 * array size and prints values.
	 * 
	 * @param num of type integer
	 */
	public static void method2(int num) {
		System.out.print("\n" + num + " ... ");
		
		int[] binary = new int[35];
		int id = 0;
	 
		while (num > 0) {
		    binary[id++] = num % 2;
			num = num / 2;
		}
		printBinary(binary, id);
	}
}
