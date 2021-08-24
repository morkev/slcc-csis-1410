package labSerialization;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * LabSerialization demonstrates how to 
 * serialize and deserialize a custom object 
 * that references other objects on the heap.
 * 
 * @author Kevin Mora
 */
public class LabSerialization {
    public static void main(String[] args) {
        ListVsSetDemo demo = new ListVsSetDemo(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW));

        serialize(demo, "src/labSerialization/Demo.ser");
        System.out.println("-----------------------");
        System.out.println("Serialization Complete");
        ListVsSetDemo newDemo = deserialize("src/labSerialization/Demo.ser");
        displayListAndSet(newDemo);
    };

    /**
     * Displays the elements of the list and the set.
     */
    private static void displayListAndSet(ListVsSetDemo demo) {
    	System.out.println("-----------------------\n");
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("-----------------------\n");
        System.out.println("Set:");
        System.out.println(demo.getSetElements());
        System.out.println("-----------------------");
    }
    
    /**
     * Serializes ListVsSetDemo to a File.
     * 
     * @param demo
     * @param filename
     */
    public static void serialize(ListVsSetDemo demo, String filename) {
    	try (ObjectOutputStream serializer = new ObjectOutputStream(new FileOutputStream(filename))) {
    		serializer.writeObject(demo);
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    		System.err.println(e.getClass());
    	} catch (IOException e) {
    		e.printStackTrace();
    		System.err.println(e.getClass());
    	}
    }
    
    /**
     * Returns a deserialized
     * ListVsSetDemo from a File.
     * 
     * @param filename
     */
    public static ListVsSetDemo deserialize(String filename) {
    	ListVsSetDemo result = null;
    	try(ObjectInputStream deserialize = new ObjectInputStream(new FileInputStream(filename))) {
    		Object tmpResult = deserialize.readObject();
    		if(tmpResult instanceof ListVsSetDemo) {
    			result = (ListVsSetDemo) tmpResult;
    		}
    	} catch (IOException e) {
    		System.err.println("A problem ocurred while deserializing " + filename);
    		e.printStackTrace();
    	} catch (ClassNotFoundException e) {
    		System.err.println("Object not found\n");
    		e.printStackTrace();
    	}
    	return result;
    }
}
