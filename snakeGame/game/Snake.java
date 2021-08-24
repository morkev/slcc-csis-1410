package game;

import gui.Gui;

import java.awt.*;
import java.util.ArrayList;

/**
 * Creates the snake as an object,
 * and how it will interact with 
 * the grid, and what such object
 * will do if certain conditions 
 * are met – add length, move, etc.
 * 
 * @author Kevin Mora
 */
public class Snake {

    public static int score = 0, bestscore = 0;
    public static boolean waitToMove = false;
    public static Head head = new Head(7, 7);
    public static ArrayList<Tail> tails = new ArrayList<>();
    public static PickUp pickup = new PickUp();

    /**
     * If the snake picks a randomized object, 
     * then add one to its total length.
     */
    public static void addTail() {
        if (tails.size() < 1) {
            tails.add(new Tail(head.getX(), head.getY()));
        } else {
            tails.add(new Tail(tails.get(tails.size() - 1).x, tails.get(tails.size() - 1).y));
        }
    }

    /**
     * Creates the movement of the
     * snake, and sets conditions
     * related to the length of
     * the snake's tail.
     */
    public static void move() {
        if (tails.size() >= 2) {
            for (int i = tails.size() - 1; i >= 1; i--) {
                if (tails.get(i).isWait()) {
                    tails.get(i).setWait(false);
                } else {
                    tails.get(i).setX(tails.get(i - 1).getX());
                    tails.get(i).setY(tails.get(i - 1).getY());
                }
            }
        }
        // Move first Tail to Head
        if (tails.size() >= 1) {
            if (tails.get(0).isWait()) {
                tails.get(0).setWait(false);
            } else {
                tails.get(0).setX(head.getX());
                tails.get(0).setY(head.getY());
            }
        }
        // Move Head
        switch (head.getDir()) {
            case RIGHT:
                head.setX(head.getX() + 1);
                break;
            case UP:
                head.setY(head.getY() - 1);
                break;
            case LEFT:
                head.setX(head.getX() - 1);
                break;
            case DOWN:
                head.setY(head.getY() + 1);
                break;
        }
    }

    /**
     * Creates and translates
     * position to coordinates.
     */
    public static Point ptc(int x, int y) {
        Point p = new Point(0, 0);
        p.x = x * 32 + Gui.xoff;
        p.y = y * 32 + Gui.yoff;
        
        return p;
    }
}