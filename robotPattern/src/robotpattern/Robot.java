package robotpattern;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Robot {


    private DoorRoom room;
    private int x;
    private int y;

    public Robot(DoorRoom room, int sx, int sy) {
        this.room = room;
        this.x = sx;
        this.y = sy;
        this.show();
        try { Thread.sleep(500); }
        catch (InterruptedException e) {}
    }

    public Robot(DoorRoom room) {
        this(room,0,0);
    }

    public Robot(boolean[][] grid, int sx, int sy) {
        this(new DoorRoom(grid), sx, sy);
    }

    public Robot(boolean[][] grid) {
        this(new DoorRoom(grid));
    }

    public Robot(String grid, int sx, int sy) {
        this(new DoorRoom(grid), sx, sy);
    }

    public Robot(String grid) {
        this(new DoorRoom(grid));
    }

    public Robot(int w, int h, int sx, int sy) {
        this(new DoorRoom(w, h), sx, sy);
    }

    public Robot(int w, int h) {
        this(new DoorRoom(w, h));
    }

    public boolean check(char dir) {
        try { Thread.sleep(125); } catch (InterruptedException e) {}
        return room.isDoor(this.x, this.y, dir);
    }

    public boolean check(String dir) { return this.check(dir.charAt(0)); }

    public void go(char dir) {
        if (!this.check(dir)) {
            switch(dir) {
                case 'w': case 'W':
                    for(double i=0; i<0.375; i+=0.03125)
                        this.show(-i,0);
                    break;
                case 'e': case 'E':
                    for(double i=0; i<0.375; i+=0.03125)
                        this.show(i,0);
                    break;
                case 'n': case 'N':
                    for(double i=0; i<0.375; i+=0.03125)
                        this.show(0,-i);
                    break;
                case 's': case 'S':
                    for(double i=0; i<0.375; i+=0.03125)
                        this.show(0,i);
                    break;
                default: throw new
                        IllegalArgumentException("Unknown direction: "+dir);
            }
            throw new Robot.HitWall();
        }
        switch(dir) {
            case 'w': case 'W': for(double i=0; i<1; i+=0.03125)
                this.show(-i,0); this.x -= 1;
                break;
            case 'e': case 'E': for(double i=0; i<1; i+=0.03125)
                this.show(i,0); this.x += 1;
                break;
            case 'n': case 'N': for(double i=0; i<1; i+=0.03125)
                this.show(0,-i); this.y -= 1;
                break;
            case 's': case 'S': for(double i=0; i<1; i+=0.03125)
                this.show(0,i); this.y += 1;
                break;
            default: throw new IllegalArgumentException("Unknown direction: "+dir);
        }
        this.show();
    }

    public void go(String dir) {
        this.go(dir.charAt(0));
    }

    private  void show() {
        this.room.drawBot(this.x, this.y);
    }
    private void show(double dx, double dy) {
        this.room.drawBot(this.x+dx, this.y+dy);
        try { Thread.sleep(10); }
        catch (InterruptedException e) {}
    }

    public void say(Object msg) {
        JLabel l = new JLabel(String.valueOf(msg));
        l.setFont(new Font(l.getFont().getName(),
                Font.PLAIN, 32));
        JOptionPane.showMessageDialog(this.room.window, l,
                "The robot says:", JOptionPane.PLAIN_MESSAGE);
    }

    @SuppressWarnings("serial") private static class HitWall extends RuntimeException {}
}
