package labCollection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Application for testing Couch class.
 * @author Kevin Mora
 */
public class CouchApp {
	
	/**
	 * Creates multiple Collection<Couch>
	 * & implements them in order to test
	 * Couch class methods.
	 * @param args
	 */
	public static void main(String[] args) {
		Color[] colors = { Color.BLACK, Color.BLUE, Color.DARK_GRAY, Color.GRAY, 
						   Color.GREEN, Color.LIGHT_GRAY, Color.RED, Color.WHITE};
		List<Couch> couches = new ArrayList<>();
		List<Couch> favorites = new ArrayList<>();
		
		for(int i=0; i < colors.length; i++) {
			couches.add(new Couch(colors[i], Material.FABRIC));
			couches.add(new Couch(colors[i], Material.LEATHER));
			couches.add(new Couch(colors[i], Material.VINYL));
		}
		favorites.add(new Couch(Color.RED, Material.FABRIC));
		favorites.add(new Couch(Color.BLACK, Material.LEATHER));
		favorites.add(new Couch(Color.WHITE, Material.VINYL));
		
		printCouches(couches, favorites);
		
		System.out.println("\nRemoving all vinyl couches...\n");
		couches.removeIf(c -> (c.getMaterial() == Material.VINYL));
		printCouches(couches, favorites);
		
		System.out.println("\nAdding all the favorites to the list couches...\n");
		couches.addAll(favorites);
		printCouches(couches, favorites);
		
		System.out.println("\nAdding all the couches to a set...\n");
		Set<Couch> noDuplicates = new HashSet<>(couches);
		printCouches(noDuplicates, favorites);
	}
	
	/**
	 * Prints all Couches in the Collection,
	 * number of elements, and whether or not
	 * all favorites are present.
	 * @param couches
	 * @param favorites
	 */
	private static void printCouches(Collection<Couch> couches, List<Couch> favorites) {
		String collectionType;
		if(couches instanceof Set) {
			collectionType = "the set";
		} else {
			collectionType = "list couches";
		}
		
		couches.forEach(c -> System.out.println(c.toString()));
		System.out.println("Number of elements in " + collectionType + ": " + couches.size());
		if (favoritesIn(couches, favorites)) {
			System.out.println("All favorites are in the list.");
		} else {
			System.out.println("Not all favorites are in the list.");
		}
	}
	
	/**
	 * Checks whether all favorites are 
	 * present in a Collection of Couches.
	 * @param couches Collection
	 * @param favorites List<Couch>
	 * @return if all results are present or not
	 */
	public static boolean favoritesIn(Collection<Couch> couches, List<Couch> favorites) {
		int result = 0;
		
		for (Couch c : favorites) {
			if(couches.contains(c)) {
				result++;
			}
		}
		
		if(result < 3) {
			return false;
		} else {
			return true;
		}	
	}
}