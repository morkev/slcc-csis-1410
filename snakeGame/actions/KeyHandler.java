package actions;

import game.Dir;
import game.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Creates a selection of keys, 
 * functionality and conditions.
 * 
 * @author Kevin Mora
 */
public class KeyHandler implements KeyListener {

    @Override
    /**
     * Creates a set of movement events 
     * for each <code>Direction ENUM</>.
     * 
     * If user selects a certain key, 
     * then the snake will move one
     * unit towards the keyTyped event.
     */
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
            	// If user input is letter "S," go DOWN.
                if (!(Snake.head.getDir() == Dir.DOWN) 
                		&& !Snake.waitToMove) {
                    Snake.head.setDir(Dir.UP);
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_A:
            	// If user input is letter "D," go RIGHT.
                if (!(Snake.head.getDir() == Dir.RIGHT) 
                		&& !Snake.waitToMove) {
                    Snake.head.setDir(Dir.LEFT);
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_S:
            	// If user input is letter "W," go UP.
                if (!(Snake.head.getDir() == Dir.UP) 
                		&& !Snake.waitToMove) {
                    Snake.head.setDir(Dir.DOWN);
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_D:
            	// If user input is letter "A," go LEFT.
                if (!(Snake.head.getDir() == Dir.LEFT) 
                		&& !Snake.waitToMove) {
                    Snake.head.setDir(Dir.RIGHT);
                    Snake.waitToMove = true;
                }
                break;
        }
    }

    @Override
    /**
     * Creates an Override event
     * for the keyReleased.
     */
    public void keyReleased(KeyEvent e) {}
    
    @Override
    /**
     * Creates an Override event
     * for the keyTyped.
     */
    public void keyTyped(KeyEvent e) {}
}
