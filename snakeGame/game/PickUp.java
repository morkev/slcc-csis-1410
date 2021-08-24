package game;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Generates a randomized object
 * that will allow the snake to grow
 * by one unit if picked.
 * 
 * @author Kevin Mora
 */
public class PickUp {
    int x, y;

    /**
     * Gets a random number/position 
     * isolated from the current thread
     * with the X and Y coordinates.
     * 
     * In this case the object will appear
     * within an area of (15x15) – our actual
     * grid has dimensions of (16x16). 
     * 
     * This one-unit decrease will avoid the 
     * possibility of spawning the randomized 
     * object outside of the grid.
     */
    public PickUp(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);
    }

    /**
     * If the randomized object was picked, 
     * then a new instance of it will appear
     * in a random position thanks to the 
     * implementation of the X and Y coordinates.
     */
    public void reset(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);
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
}