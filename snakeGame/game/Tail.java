package game;

/**
 * Creates the snake's tail conditions, 
 * getters and setters related to the
 * directions in which the body will move.
 * 
 * @author Kevin Mora
 */
public class Tail {
    int x,y;
    boolean wait = true;

    /**
     * Constructs a set of two dimensional 
     * movements for he snake's tail.
     */
    public Tail(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets/sets the X-movement 
     * of the object.
     */
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets/sets the Y-movement 
     * of the object.
     */
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Creates a boolean expression 
     * that allows the snake to
     * reduce/pause movement.
     */
    public boolean isWait() {
        return wait;
    }
    public void setWait(boolean wait) {
        this.wait = wait;
    }
}
