package keyValue;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Kevin Mora
 * 
 * Application launcher – 
 * helps us test the code's
 * functionality and behavior.
 */
public class TestClient{
	
    @SuppressWarnings("unchecked")
	public static void main(String[] args){
	    @SuppressWarnings({ "rawtypes" })
	    KeyValuePair p1 = new KeyValuePair("SLC", 189899);
	    @SuppressWarnings("rawtypes")
	    KeyValuePair p2 = new KeyValuePair("NY", 8244910);
	    
	    lineGenerator();
	    System.out.println("Part 1: ");
	    lineGenerator();

	    System.out.println("P1: " + p1.toString());
	    System.out.println("P2: " + p2.toString());
	    System.out.println("p1.equals(p2): " + p1.equals(p2) + "\n");

	    p1 = p2;

	    System.out.println("P1: " + p1.toString());
	    System.out.println("P2: " + p2.toString());
	    System.out.println("p1.equals(p2): " + p1.equals(p2) + "\n");
	    
//---------
	    
	    KeyValuePairList<String, Integer> t1 = 
	    		new KeyValuePairList<>("SLC", 189899);
	    KeyValuePairList<String, Integer> t2 = 
	    		new KeyValuePairList<>("NY", 8244910);
	    KeyValuePairList<String, Integer> t3 = 
	    		new KeyValuePairList<>("LA", 3819702);
	    KeyValuePairList<String, Integer> t4 = 
	    		new KeyValuePairList<>("SF", 812826);

	    ArrayList<KeyValuePairList<String, Integer>> cities = new ArrayList<>();
		    cities.add(t1);
		    cities.add(t2);
		    cities.add(t3);
		    cities.add(t4);

		lineGenerator();
		System.out.println("Part 2: ");
		lineGenerator();
		
	    System.out.println("Original list");
	    for (KeyValuePairList<String, Integer> el : cities){
	    	System.out.println(el.toString());
	    }

	    Collections.sort(cities);
	    
	    System.out.println("\n" + "Sorted list");
	    for (KeyValuePairList<String, Integer> el : cities){
	    	System.out.println(el.toString());
	    }
	    
//----------	    
	    
	    System.out.println();
	    lineGenerator();
	    System.out.println("Part 3: ");
		lineGenerator();
	    
		// N = 5
		System.out.println("Cities with margin N:");
		
		for (KeyValuePairList<String, Integer> el : cities){
	    	System.out.printf("     (%s) \n", el.toString());
	    }
		
		System.out.println("\n" + "Country codes with margin 3:");
		
		ArrayList<KeyValuePairList<String, Integer>> extCountry = new ArrayList<>();
		KeyValuePairList<String, Integer> m1 = 
	    		new KeyValuePairList<>("France", 33);
				extCountry.add(m1);
		KeyValuePairList<String, Integer> m2 = 
	    		new KeyValuePairList<>("Austria", 43);
				extCountry.add(m2);
		KeyValuePairList<String, Integer> m3 = 
	    		new KeyValuePairList<>("Greece", 30);
				extCountry.add(m3);
		
		for (KeyValuePairList<String, Integer> el : extCountry){
	    	System.out.printf("   (%s) \n", el.toString());
	    }
	}
    
    public static void lineGenerator(){
    	System.out.printf("--------------------------------\n");
    }
}