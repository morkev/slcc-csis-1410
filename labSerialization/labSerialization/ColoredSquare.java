package labSerialization;

import java.awt.Color;
import java.io.Serializable;

/**
 * A square that is defined by its size and color.
 * @author Kevin Mora
 */
public class ColoredSquare implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int side;
    private final Color color;

    /**
     * Initializes the fields <code>side</code> and <code>color</code>.
     * @param s the side length of the square
     * @param c the color of the square
     */
    public ColoredSquare(int s, Color c) {
        side = s;
        color = c;
    }

    /**
     * Calculates the area of the square.
     */
    public int area() {
        return side * side;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + side;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof ColoredSquare))
            return false;
        ColoredSquare other = (ColoredSquare) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (side != other.side)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("side:%d #%02X%02X%02X",
                side, color.getRed(), color.getGreen(),
                color.getBlue());
    }
}
