

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class breakaplate {

	private JFrame frame;
	private JTextField txtYouWinTiger;
	private JTextField txtBreakAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					breakaplate window = new breakaplate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public breakaplate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon img1 = new ImageIcon("../Chapter10/src/plates.gif");
		ImageIcon img2 = new ImageIcon("../Chapter10/src/plates_all_broken.gif");
		ImageIcon img3 = new ImageIcon("../Chapter10/src/plates_two_broken.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel di = new JLabel("");
		di.setBounds(79, 63, 320, 64);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setBounds(152, 175, 145, 28);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				di.setIcon(img1);
				di.setIcon(img2);
				di.setIcon(img3);
				
				
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		txtYouWinTiger = new JTextField();
		txtYouWinTiger.setBounds(134, 215, 193, 35);
		panel.add(txtYouWinTiger);
		txtYouWinTiger.setText("You win : Sticker");
		txtYouWinTiger.setColumns(10);
		
		txtBreakAll = new JTextField();
		txtBreakAll.setText("Break All 3 and you win a prize");
		txtBreakAll.setBounds(134, 11, 193, 28);
		panel.add(txtBreakAll);
		txtBreakAll.setColumns(10);
		
		
		panel.add(di);
	}
}
