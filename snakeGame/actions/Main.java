package actions;

import clocks.GameClock;
import gui.Gui;

/**
 * Executes the main program by 
 * letting the user interact with 
 * the logic of the program.
 * 
 * @author Kevin Mora
 */
public class Main {
    public static void main(String[] args) {
        Gui g = new Gui();
        GameClock gc = new GameClock();
	        g.create();
	        gc.start();
    }
}