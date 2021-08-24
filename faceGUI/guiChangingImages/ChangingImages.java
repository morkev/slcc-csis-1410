package guiChangingImages;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author Kevin Mora
 */
public class ChangingImages extends JFrame {

  // Suppression Warning
  private static final long serialVersionUID = 1L;
  
  private ArrayList<Image> backGroundList = new ArrayList<Image>();
  private ArrayList<Image> eyeList = new ArrayList<Image>();
  private ArrayList<Image> mouthList = new ArrayList<Image>();
  private ArrayList<Image> noseList = new ArrayList<Image>();

  /**
   * Integer variables will be used to 
   * loop through the different images.
   */
  private int numEyes = 0;
  private int numNose = 0;
  private int numMouth = 0;
  private int numBackGround = 0;
  
  public ChangingImages() {
	/**
	 * Adds the images into the respective ArrayList.
	 * The limit equals 4 since there's a total of
	 * four images of each instance.
	 */
    for(int i = 0; i < 4; i++){
      eyeList.add(new ImageIcon(getClass().
    		  getResource("/face/eyes" + String.valueOf(i) + ".png")).getImage());
      noseList.add(new ImageIcon(getClass().
    		  getResource("/face/nose" + String.valueOf(i) + ".png")).getImage());
      mouthList.add(new ImageIcon(getClass().
    		  getResource("/face/mount" + String.valueOf(i) + ".png")).getImage());
      backGroundList.add(new ImageIcon(getClass().
    		  getResource("/face/background" + String.valueOf(i) + ".png")).getImage());
    }
    
    /**
     * Creates the JPanel – sets
     * the BorderLayout, background,
     * and location of the Pane.
     */
    JPanel panel = new JPanel();
    panel.setBackground(Color.GRAY);
    getContentPane().add(panel, BorderLayout.WEST);
    panel.setLayout(new GridLayout(5,1,0,-20));
    
    /**
     * Creates 4 CheckBoxes
     * with the font, addition,
     * and opaque parameters.
     */
    JCheckBox checkBoxEye = new JCheckBox("Eyes");
    checkBoxEye.setFont(new Font("Geneva", Font.BOLD, 16));
    checkBoxEye.setOpaque(true);
    panel.add(checkBoxEye);

    JCheckBox checkBoxNose = new JCheckBox("Nose");
    checkBoxNose.setFont(new Font("Geneva", Font.BOLD, 16));
    checkBoxNose.setOpaque(true);
    panel.add(checkBoxNose);

    JCheckBox checkBoxMouth = new JCheckBox("Mouth");
    checkBoxMouth.setFont(new Font("Geneva", Font.BOLD, 16));
    checkBoxMouth.setOpaque(true);
    panel.add(checkBoxMouth);
    
    JCheckBox checkBack = new JCheckBox("Face");
    checkBack.setFont(new Font("Geneva", Font.BOLD, 16));
    checkBack.setOpaque(true);
    panel.add(checkBack);

    /**
     * Creates the 'UPDATE' JButton: adds
     * font, and ActionListener parameters.
     * Sets the condition for each CheckBox
     * having the integer fields in consideration. 
     * 
     * NOTE: Checks the number of boxes that are marked – 
     * if no boxes are checked then <code>checked variable</>
     * will remain zero. The max index has to be changed
     * if there are more than 4 elements.
     */
    JButton buttonUpdate = new JButton("u");
    buttonUpdate.setFont(new Font("Wingdings 3", Font.BOLD, 24));
    buttonUpdate.addActionListener(new ActionListener() {
    	
      public void actionPerformed(ActionEvent e) {
        int checked = 0;

        if(checkBoxEye.isSelected()) {
          checked += 1;
        if(numEyes != 3)
          numEyes++;
        else numEyes = 0;
      }
        if(checkBoxMouth.isSelected()) {
          checked++;
        if(numMouth != 3)
          numMouth++;
        else numMouth = 0;
      }
        if(checkBoxNose.isSelected()) {
          checked++;
        if(numNose != 3)
          numNose++;
        else numNose = 0;
      }
        if(checked == 0) {
          if(numBackGround != 3)
            numBackGround++; 
          else numBackGround = 0;
        }
      }
    });
    
    buttonUpdate.setOpaque(true);
    panel.add(buttonUpdate);

    getContentPane().add(new Face(), BorderLayout.CENTER);
  }

  /**
   * Creates the visualization panel.
   * 
   * Keyword <code>super</> allows this subclass 
   * to overload the methods inherited by the superclass.
   */
  protected class Face extends JPanel {
	
	// Suppression Warning  
	private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
      super.paint(g);
      g.drawImage(backGroundList.get(numBackGround), 50, 50, 400, 400, null);
      g.drawImage(eyeList.get(numEyes), 0, 0, 500, 500, null);
      g.drawImage(noseList.get(numNose), 0, 10, 500, 500, null);
      g.drawImage(mouthList.get(numMouth), 0, 35, 500, 500, null);
      repaint();
    }
  }
  
  /**
   * Application launcher.
   */
  public static void main(String[] args){
    ChangingImages frame = new ChangingImages();
	    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    frame.setTitle("GUI Changing Images");
	    frame.setVisible(true);
  }
}