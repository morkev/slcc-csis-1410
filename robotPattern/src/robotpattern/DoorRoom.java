package robotpattern;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DoorRoom {

    JFrame window;
    BufferedImage content;
    Graphics2D paintbrush;

    public static final Color E =
            new Color(50, 0, 80);
    public static final Color W =
            new Color(120, 80, 10);
    public static final Color N =
            new Color(210, 255, 0);
    public static final Color S =
            new Color(255, 220, 50);
    public static final Color DOOR =
            new Color(0, 191, 191);
    public static final int RS = 96;

    boolean[][] open;

    public DoorRoom(boolean[][] grid) {
        this.open = grid;
        this.init();
    }

    private void init() {
        this.window = new JFrame("Grid of Doors");
        this.content = new BufferedImage(this.open.length*RS,
                this.open[0].length*RS, BufferedImage.TYPE_INT_ARGB);
        this.paintbrush = (Graphics2D)
                this.content.getGraphics();
        this.paintbrush.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        this.window.setContentPane(new JLabel(new ImageIcon(this.content)));
        this.window.pack();
        this.window.setVisible(true);
        this.window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public DoorRoom(String map) {
        String[] rows = map.split("\n");
        int cols = 0;
        for(String row : rows) {
            cols = Math.max(cols, row.length());
        }
        this.open = new boolean[cols][rows.length];
        for(int row = 0; row < rows.length; row+=1) {
            for (int col = 0; col < rows[row].length(); col+=1) {
                this.open[col][row] = rows[row].charAt(col) > ' ';
            }
        }
        this.init();
    }

    public DoorRoom(int w, int h) {
        this.open = new boolean[w][h];
        for(int i = 0; i < this.open.length; i+=1) {
            for (int j=0; j < this.open[i].length; j+=1) {
                this.open[i][j] = true;
            }
        }
        this.init();
    }

    public boolean isDoor(int x, int y, char direction) {
        if (x < 0 || y < 0 || x >= this.open.length || y >= this.open[0].length)
            return false;
        if (!open[x][y])
            return false;
        switch(direction) {
            case 'w': case 'W': x -= 1;
            break;
            case 'e': case 'E': x += 1;
            break;
            case 'n': case 'N': y -= 1;
            break;
            case 's': case 'S': y += 1;
            break;
            default: throw new
                    IllegalArgumentException("Unknown direction: "+direction);
        }
        if (x < 0 || y < 0 || x >= this.open.length || y >= this.open[0].length)
            return false;
                return open[x][y];
    }

    public void drawBot(double x, double y) {
        this.paintbrush.setColor(Color.BLACK);
        this.paintbrush.fillRect(0, 0,
                this.content.getWidth(),
                this.content.getHeight());

        for(int i = 0; i < this.open.length; i+=1) {
            for (int j = 0; j < this.open[i].length; j+=1) {
                if (this.open[i][j]) {
                    {
                        this.paintbrush.setColor(W);
                        int[] xs = { i*RS, i*RS, i*RS+RS/2};
                        int[] ys = { j*RS, j*RS+RS, j*RS+RS/2};
                        this.paintbrush.fillPolygon(xs,ys,3);
                        if (this.isDoor(i, j, 'w')) {
                            this.paintbrush.setColor(DOOR);
                            this.paintbrush.fillRect(i*RS,
                                    j*RS+RS/4, RS/8, RS/2);
                        }
                    }

                    {
                        this.paintbrush.setColor(E);
                        int[] xs = { i*RS+RS, i*RS+RS, i*RS+RS/2};
                        int[] ys = { j*RS, j*RS+RS, j*RS+RS/2};
                        this.paintbrush.fillPolygon(xs,ys,3);
                        if (this.isDoor(i, j, 'e')) {
                            this.paintbrush.setColor(DOOR);
                            this.paintbrush.fillRect(i*RS+RS-RS/8,
                                    j*RS+RS/4, RS/8, RS/2);
                        }
                    }

                    {
                        this.paintbrush.setColor(N);
                        int[] xs = { i*RS, i*RS+RS, i*RS+RS/2};
                        int[] ys = { j*RS, j*RS, j*RS+RS/2};
                        this.paintbrush.fillPolygon(xs,ys,3);
                        if (this.isDoor(i, j, 'n')) {
                            this.paintbrush.setColor(DOOR);
                            this.paintbrush.fillRect(i*RS+RS/4,
                                    j*RS, RS/2, RS/8);
                        }
                    }

                    {
                        this.paintbrush.setColor(S);
                        int[] xs = { i*RS, i*RS+RS, i*RS+RS/2};
                        int[] ys = { j*RS+RS, j*RS+RS, j*RS+RS/2};
                        this.paintbrush.fillPolygon(xs,ys,3);
                        if (this.isDoor(i, j, 's')) {
                            this.paintbrush.setColor(DOOR);
                            this.paintbrush.fillRect(i*RS+RS/4,
                                    j*RS+RS-RS/8, RS/2, RS/4);
                        }
                    }
                    this.paintbrush.setColor(Color.GRAY);
                    this.paintbrush.fillRect(i*RS+RS/8,
                            j*RS+RS/8, RS-RS/4, RS-RS/4);
                }
            }
        }
        this.paintbrush.setColor(Color.WHITE);
        this.paintbrush.fillOval((int)(x*RS)+RS/4,
                (int)(y*RS)+RS/4, RS/2, RS/2);
        this.paintbrush.setColor(Color.BLACK);
        this.paintbrush.fillOval((int)(x*RS)+RS/4+RS/8,
                (int)(y*RS)+RS/4+RS/8, RS/4, RS/4);

        this.window.repaint(); // necessary to see any changes to the screen
    }
}