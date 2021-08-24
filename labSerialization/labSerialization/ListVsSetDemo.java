package labSerialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Demonstrates the different behavior of lists and sets.
 * @author Kevin Mora
 */
public class ListVsSetDemo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private final List<ColoredSquare> list;
    private final Set<ColoredSquare> set;

    /**
     * Initializes the fields list and set with the elements provided.
     * 
     * @param elements
     */
    public ListVsSetDemo(ColoredSquare... elements) {
        list = new ArrayList<>(Arrays.asList(elements));
        set = new HashSet<>(Arrays.asList(elements));
    }

    /**
     * Creates a string that includes all the list elements.
     * Each element is followed by a new-line.
     *
     * @return string of list elements
     */
    public String getListElements() {
        StringBuilder sb = new StringBuilder();
        for (ColoredSquare el : list) {
            sb.append(el).append("\n");
        }
        return sb.toString();
    }

    /**
     * Creates a string that includes all the elements in the set.
     * Each element is followed by a new-line. 
     * 
     * @return string of set elements
     */
    public String getSetElements() {
        StringBuilder sb = new StringBuilder();
        for (ColoredSquare el : set) {
            sb.append(el).append("\n");
        }
        return sb.toString();
    }

    /**
     * Adds the element <code>el</code> to both the list and the set.
     * 
     * @param el
     */
    public void addElement(ColoredSquare el) {
        list.add(el);
        set.add(el);
    }
}
