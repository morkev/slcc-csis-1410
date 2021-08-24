package gui;

import actions.KeyHandler;

import javax.swing.*;

/**
 * Creation of the outside of the GUI, 
 * pixel dimensions, and behavior.
 * 
 * @author Kevin Mora
 */
public class Gui {
    JFrame jf;
    Draw d;

    // Pixel dimensions
    public static int width = 800, height = 600;
    public static int xoff = 130, yoff = 20;

    /**
     * Creation of mentioned components
     * and definition of boolean expressions.
     */
    public void create(){
        jf = new JFrame("Snake Game");
        jf.setSize(width,height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.addKeyListener(new KeyHandler());

        d = new Draw();
        d.setBounds(0,0,width,height);
        d.setVisible(true);
        jf.add(d);

        jf.requestFocus();
        jf.setVisible(true);
    }
}
