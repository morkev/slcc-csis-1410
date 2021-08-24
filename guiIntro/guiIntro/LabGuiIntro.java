package guiIntro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LabGuiIntro extends JFrame {

	/**
	 * Creation of fields, and
	 * warning suppression with
	 * <code>serialVersionUID = 1L</>
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Application launcher.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiIntro frame = new LabGuiIntro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the frame, and
	 * sets the values of parameters
	 * such as color, size, etc.
	 */
	public LabGuiIntro() {
		// EXIT ON CLOSE EVENT
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// TOP Border Layout
		JLabel lblNewLabel = new JLabel("My First GUI");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(52, 63, 86)); // dark blue
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		// LEFT Border Layout
		JButton btnWest = new JButton("West");
		contentPane.add(btnWest, BorderLayout.WEST);
		
		// CENTER Border Layout
		JLabel lblHi = new JLabel("Hi");
		lblHi.setFont(new Font("Lucida Grande", Font.PLAIN, 77));
		lblHi.setForeground(Color.ORANGE);
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setBackground(new Color(245, 71, 72)); // salmon
		lblHi.setOpaque(true);
		contentPane.add(lblHi, BorderLayout.CENTER);
		
		// BOTTOM Border Layout
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.SOUTH);

		// BOTTOM TEXT
		JLabel lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblName);
		// Space between JLabel and text field
		// text field is 16 characters wide
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(16);
	}

}