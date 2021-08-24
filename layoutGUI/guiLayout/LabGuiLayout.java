package guiLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LabGuiLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel mainPanel;
	private int blueTile = 1;

	/**
	 * Application launcher.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiLayout frame = new LabGuiLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creation of frame.
	 */
	public LabGuiLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 317);
		
		createContentPane(); {
			createContentPanel();
		}{
			instantiateMainPanel();
		}
	}
	
	/**
	 * Creation of 4 panels.
	 */
	private void instantiateMainPanel() {
		mainPanel= new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		GridBagLayout gbl_mainPanel = new GridBagLayout();
		gbl_mainPanel.columnWidths = new int[] {150,150,150,150,0};
		gbl_mainPanel.rowHeights = new int[] {200,0};
		gbl_mainPanel.columnWeights = new double[] {0.0,0.0,0.0,0.0, Double.MIN_VALUE};
		gbl_mainPanel.rowWeights = new double[] {0.0, Double.MIN_VALUE};
		mainPanel.setLayout(gbl_mainPanel); 
		{
			JLabel tileFour = new JLabel("1");
			tileFour.setHorizontalAlignment(SwingConstants.CENTER);
			tileFour.setPreferredSize(new Dimension(140,200));
//			tileTwo.setMinimumSize(new Dimension(0,0));
//			tileTwo.setMaximumSize(new Dimension(100000000, 100000000));
			tileFour.setOpaque(true);
			tileFour.setBackground(Color.YELLOW);
			tileFour.setFont(new Font("Futura", Font.BOLD, 18));
			GridBagConstraints gbl_tileFour = new GridBagConstraints();
			gbl_tileFour.insets = new Insets(0, 0, 0, 5);
			//gbl_tileOne.insets = new Insets(0,0,0,0);
			gbl_tileFour.gridx = 0;
			gbl_tileFour.gridy = 0;
			mainPanel.add(tileFour, gbl_tileFour);
		}
		{
			JLabel tileOne = new JLabel("2");
			tileOne.setHorizontalAlignment(SwingConstants.CENTER);
			tileOne.setPreferredSize(new Dimension(140,200));
//			tileOne.setMinimumSize(new Dimension(0,0));
//			tileOne.setMaximumSize(new Dimension(100000000, 100000000));
			tileOne.setOpaque(true);
			tileOne.setBackground(Color.YELLOW);
			tileOne.setFont(new Font("Futura", Font.BOLD, 18));
			GridBagConstraints gbl_tileOne = new GridBagConstraints();
			gbl_tileOne.insets = new Insets(0, 0, 0, 5);
			gbl_tileOne.gridx = 1;
			gbl_tileOne.gridy = 0;
			mainPanel.add(tileOne, gbl_tileOne);
		}
		{
			JLabel tileThree = new JLabel("3");
			tileThree.setHorizontalAlignment(SwingConstants.CENTER);
			tileThree.setPreferredSize(new Dimension(140,200));
//			tileTwo.setMinimumSize(new Dimension(0,0));
//			tileTwo.setMaximumSize(new Dimension(100000000, 100000000));
			tileThree.setOpaque(true);
			tileThree.setBackground(Color.YELLOW);
			tileThree.setFont(new Font("Futura", Font.BOLD, 18));
			GridBagConstraints gbl_tileThree = new GridBagConstraints();
			gbl_tileThree.insets = new Insets(0, 0, 0, 5);
			//gbl_tileOne.insets = new Insets(0,0,0,0);
			gbl_tileThree.gridx = 2;
			gbl_tileThree.gridy = 0;
			mainPanel.add(tileThree, gbl_tileThree);
		}
		{
			JLabel tileTwo = new JLabel("4");
			tileTwo.setHorizontalAlignment(SwingConstants.CENTER);
			tileTwo.setPreferredSize(new Dimension(140,200));
//			tileTwo.setMinimumSize(new Dimension(0,0));
//			tileTwo.setMaximumSize(new Dimension(100000000, 100000000));
			tileTwo.setOpaque(true);
			tileTwo.setBackground(Color.YELLOW);
			tileTwo.setFont(new Font("Futura", Font.BOLD, 18));
			GridBagConstraints gbl_tileTwo = new GridBagConstraints();
			//gbl_tileOne.insets = new Insets(0,0,0,0);
			gbl_tileTwo.gridx = 3;
			gbl_tileTwo.gridy = 0;
			mainPanel.add(tileTwo, gbl_tileTwo);
		}
		{
			/**
			 * Creation of Label.
			 */
			JLabel titleLabel = new JLabel("Demo Layout");
			titleLabel.setBorder(new EmptyBorder(13,0,15,0));
			titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
			titleLabel.setFont(new Font("Futura", Font.PLAIN, 20));
			contentPane.add(titleLabel, BorderLayout.NORTH);
		}
	}
	
	private void createContentPanel() {
		JPanel controlPanel = new JPanel();
		contentPane.add(controlPanel,BorderLayout.WEST);
		GridBagLayout gbl_controlPanel = new GridBagLayout();
		gbl_controlPanel.columnWidths = new int[] {80,0};
		gbl_controlPanel.rowHeights = new int[] {40,40,25,0, 0,0};
		gbl_controlPanel.columnWeights = new double[] {0.0, Double.MIN_VALUE};
		gbl_controlPanel.rowWeights = new double[] {0.0,0.0,0.0,0.0, 0.0, Double.MIN_VALUE};
		controlPanel.setLayout(gbl_controlPanel);
		{
			{
				/**
				 * Left Button functionality.
				 */
				JButton leftButton = new JButton("<––");
				leftButton.addActionListener(new ActionListener () {
					public void actionPerformed(ActionEvent e) {
						if(blueTile - 1 < 0) {
							mainPanel.getComponent(3).setBackground(Color.BLUE);
							mainPanel.getComponent(blueTile).setBackground(Color.YELLOW);
							blueTile = 3;
							
						} else {
							mainPanel.getComponent(blueTile - 1).setBackground(Color.BLUE);
							mainPanel.getComponent(blueTile --).setBackground(Color.YELLOW);
						}
					}
				});
				leftButton.setPreferredSize(new Dimension(62,35));
				leftButton.setFont(new Font("Tahoma", Font.BOLD, 16));
				GridBagConstraints gbc_leftButton = new GridBagConstraints();
				gbc_leftButton.insets = new Insets(0, 0, 5, 0);
				gbc_leftButton.gridx = 0;
				gbc_leftButton.gridy = 0;
				controlPanel.add(leftButton, gbc_leftButton);
			}
		}
		/**
		 * Right Button functionality.
		 */
		JButton rightButton = new JButton("––>");
		rightButton.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if(blueTile + 1 > 3) {
					mainPanel.getComponent(0).setBackground(Color.BLUE);
					mainPanel.getComponent(blueTile).setBackground(Color.YELLOW);
					blueTile = 0;
				} else {
					mainPanel.getComponent(blueTile + 1).setBackground(Color.BLUE);
					mainPanel.getComponent(blueTile ++).setBackground(Color.YELLOW);
				}
			}
		});
		rightButton.setPreferredSize(new Dimension(62,35));
		rightButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_rightButton = new GridBagConstraints();
		gbc_rightButton.insets = new Insets(0,0,5,0);
		gbc_rightButton.gridx = 0;
		gbc_rightButton.gridy = 1;
		controlPanel.add(rightButton, gbc_rightButton);
	}
	
	/**
	 * Creation of Panel.
	 */
	private void createContentPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
	}
}
	