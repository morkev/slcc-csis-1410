package clocks;

import actions.Collision;
import game.Snake;

/**
 * Executes the Collision, PickUp and Snake 
 * classes within a try-catch expression.
 * 
 * @author Kevin Mora
 */
public class GameClock extends Thread{
    public static boolean running = true;

    /**
     * Calls the snake movement, and 
     * specifies its behavior when 
     * colliding with a wall or itself.
     */
    public void run(){
        while(running){
            try {
                sleep(200);
                Snake.move();
                Snake.waitToMove = false;
                Collision.collidePickUp();
                
	                if(Collision.collideSelf()){
	                    Snake.tails.clear();
	                    Snake.score = 0;
	                }
	                if(Collision.collideWall()){
	                    Snake.tails.clear();
	                    Snake.head.setX(7);
	                    Snake.head.setY(7);
	                    Snake.score = 0;
	                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}