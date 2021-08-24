package m03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

/**
 * GUI that shows the change of the seasons 
 * within a JFrame with 400 x 400 dimensions,
 * thanks to the implementation of images.
 * 
 * @author Kevin Mora
 */
public class Module03GUI extends JFrame {

	/**
	 * Warning Suppression.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Import required images, and store
	 * them in an array of length N.
	 */
	private ImageIcon a1 = new ImageIcon(Module03GUI.class.getResource("/Images/fall-1.jpg"));
	private ImageIcon a2 = new ImageIcon(Module03GUI.class.getResource("/Images/spring-1.jpg"));
	private ImageIcon a3 = new ImageIcon(Module03GUI.class.getResource("/Images/summer-1.jpg"));
	private ImageIcon a4 = new ImageIcon(Module03GUI.class.getResource("/Images/winter-1.jpg"));
	
	private ImageIcon[] dice = { a1, a2, a3, a4 };
	
	/**
	 * Creation of constructors 
	 * and required parameters.
	 */
	private JLabel change;
	private JPanel contentPane;
	private final Random rand = new Random();
	int randNum = rand.nextInt(4);
	int index_value = 0;
	
	/**
	 * Application launcher.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module03GUI frame = new Module03GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Creates the frame, and sets the bounds
	 * with 400 x 400 dimensions. Sets functionality,
	 * color and font values, as well as alignment.
	 */
	public Module03GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		change = seasons();
		contentPane.add(change, BorderLayout.CENTER);
		JButton btnNewButton = nextSeason();
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		{
			//Top Label Creation.
			JLabel lblNewLabel = new JLabel("FOUR SEASONS");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(new Color(192, 192, 192));
			lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 18));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(lblNewLabel, BorderLayout.NORTH);
			change.setLabelFor(lblNewLabel);
		}
	}
	
	/**
	 * Season image selector.
	 * @return JLabel with an image
	 */
	public JLabel seasons() {
		JLabel lblSeasonsImage = new JLabel("");
		lblSeasonsImage.setHorizontalAlignment(SwingConstants.CENTER);
		return lblSeasonsImage;
	}
	
	/**
	 * Creates the JButton with the
	 * change-image functionality, as 
	 * well as all the decoration
	 * parameters such as font, opaque,
	 * BackGround, alignment, painted, etc.
	 * 
	 * @return new Image every time JButton is pressed.
	 */
	public JButton nextSeason() {
		JButton btnNext = new JButton("As Time Moves On...");
		btnNext.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNext.setFont(new Font("Futura", Font.PLAIN, 20));
		btnNext.setForeground(new Color(255,255,255));
		btnNext.setBackground(Color.GRAY);
		btnNext.setOpaque(true);
		btnNext.setBorderPainted(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(randNum == index_value) {
					randNum = rand.nextInt(4);
				}
				index_value = randNum;
				change.setIcon(dice[index_value]);
			}
		});
		btnNext.setOpaque(true);
		return btnNext;
	}
}