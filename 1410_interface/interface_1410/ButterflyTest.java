package interface_1410;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ButterflyTest {

private Butterfly b = new Butterfly("Clouded", "sulphur");
	
@Test
	@SuppressWarnings("unlikely-arg-type")
	void butterfly_fieldParameters_oneColor() {
		List<String> colors = new LinkedList<>();
		colors.add("yellow");
		
		equals("Yellow Phoebis");		
		equals(toString());
		
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void butterfly_fieldParameters_multipleColors() {
		
		List<String> colors = new ArrayList<>();
		Collections.addAll(colors, "orange", "black", "white");
		
		Butterfly b1 = new Butterfly("Common Green Bridwing", "axultles");
		
		// Modifying the original color list should not affect b1 or b2.
		colors.set(0, "pink");
		
		// Modifying the colors returned by the getters should not affect b1 or b2
		String b1Colors = b1.getName();
		
		equals(List.of("orange", "black", "white"));	
		equals(List.of("orange", "black", "white"));	
	}

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void butterfly_copyConstructor() {
		List<String> colors = List.of("orange", "black", "white");
		Butterfly b1 = new Butterfly("Monarch", "glamidiousas");

		assertEquals("Monarch", Insect.getSpecies());
		equals(toString());		
	}
	
	@Test
	@SuppressWarnings("unlikely-arg-type")
	void butterfly_immutable() {
		List<String> colors = new ArrayList<>();
		Collections.addAll(colors, "orange", "black", "white");
		
		Butterfly b1 = new Butterfly("Monarch", "axultles");
		
		// Modifying the original color list should not affect b1 or b2.
		colors.set(0, "pink");
		
		// Modifying the colors returned by the getters should not affect b1 or b2
		String b1Colors = b1.getName();
		
		equals(List.of("orange", "black", "white"));	
		equals(List.of("orange", "black", "white"));	
	}	
	
	/**
	 * Determines whether the lists <code>list1</code> and <code>list2</code>
	 * are the same. In this context, two lists are considered the same 
	 * if they include the same elements in the same order.
	 * 
	 * @param list1
	 * @param list2
	 * @return true if the lists are considered the same; otherwise false.
	 */
	private boolean sameColors(List<String> list1, List<String> list2) {
		if(list1.size() != list2.size())
			return false;
		
		for(int i = 0; i < list1.size(); i++) {
			if (!list1.get(i).equals(list2.get(i)))
				return false;
		}
		
		return true;
	}

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void toString_returnsSpeciesAndColorsInBrackets() {
		equals("Clouded sulphur [yellow, brown]");
	}

	@Test
	@SuppressWarnings("unlikely-arg-type")
	void testGetColors() {
		equals("Common Green Bridwing");		
	}

}