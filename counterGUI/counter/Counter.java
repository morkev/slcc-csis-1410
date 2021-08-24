package counter;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;


public class Counter extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField DisplayOne;
    
	int count;

    /**
     * 
     */
    public Counter() {
		
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 460, 180);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);
        count = 0;
        
        DisplayOne = new JTextField();
        DisplayOne.setFont(new Font("Futura", Font.BOLD, 16));
        DisplayOne.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(DisplayOne, BorderLayout.WEST);
        DisplayOne.setColumns(10);
                        
        JButton btnCountOne = new JButton("CLICK ME");
        btnCountOne.setFont(new Font("Futura", Font.PLAIN, 16));
        btnCountOne.setOpaque(true);
        btnCountOne.setBackground(colorGenerator());
        contentPane.add(btnCountOne, BorderLayout.CENTER);
        
                        
        JLabel lblNewLabel = new JLabel("Kevin's GUI");
        lblNewLabel.setFont(new Font("Euphemia UCAS", Font.BOLD, 16));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblNewLabel, BorderLayout.SOUTH);
        
        btnCountOne.addActionListener(new ActionListener() {                
	        public void actionPerformed(ActionEvent arg0) {
	        	btnCountOne.setBackground(colorGenerator());
	        	
	        }
        });
    }
    
    /**
     * 
     * @return
     */
    public Color colorGenerator() {
    	Random rand = new Random();
    	
    	Color r = Color.RED;
    	Color g = Color.GREEN;
    	Color b = Color.BLUE;
    	
    	int i = rand.nextInt() % 3;

        switch (i) {
            case 0:
            	DisplayOne.setText(Integer.toString(count++));
                return r;
            case 1:
                return g;
            case 2:
                return b;
            default:
                break;
        }
        
		return b;
    }
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
        	public void run() {
        		try {
        			Counter frame = new Counter();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}