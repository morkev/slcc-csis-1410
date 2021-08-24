package actions;

import game.Snake;

/**
 * Determines the conditions that will 
 * allow the snake to increase or 
 * decrease its length and score.
 * 
 * @author Kevin Mora
 */
public class Collision {

	/**
	 * Creates a set of conditions that 
	 * will allow the game to reset if
	 * the Snake collides with itself.
	 */
    public static boolean collideSelf() {
        for(int i = 0; i < Snake.tails.size(); i++){
            if(Snake.head.getX() == Snake.tails.get(i).getX() 
            		&& Snake.head.getY() == Snake.tails.get(i).getY() 
            		&& !Snake.tails.get(i).isWait()) {
                return true;
            }
        }
        return false;
    }
    
    /**
	 * Creates a set of conditions that 
	 * will allow the game to reset if
	 * the Snake collides with a wall
	 * within a range of (15x15).
	 */
    public static boolean collideWall() {
        return (Snake.head.getX() < 0 || Snake.head.getX() > 15 
        		|| Snake.head.getY() < 0 || Snake.head.getY() > 15);
    }

    /**
     * Controls the current Score
     * and the BestScore according
     * to the tail's length.
     */
    public static void collidePickUp() {
        if (Snake.head.getX() == Snake.pickup.getX() 
        		&& Snake.head.getY() == Snake.pickup.getY()) {
			        Snake.pickup.reset();
			        Snake.addTail();
			        Snake.score += 1;
		    if(Snake.score > Snake.bestscore) {
		    	Snake.bestscore = Snake.score;
		    }
        }
    }
}