import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

public class Divsbleby3 
{

	private JFrame frame;
	private JTextField TF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try {
					Divsbleby3 window = new Divsbleby3();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Divsbleby3() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 240));
		frame.setBounds(100, 100, 566, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 255));
		panel.setForeground(Color.BLUE);
		panel.setBounds(0, 0, 550, 426);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		TF = new JTextField();
		TF.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			
			}
		
		});
		TF.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			
			}
	
		});
		TF.setText("Divisible by 3");
		TF.setBounds(156, 11, 247, 63);
		TF.setBackground(Color.WHITE);
		panel.add(TF);
		TF.setColumns(10);
		
		Button submit = new Button("Select an Interger");
		submit.setBounds(10, 113, 222, 63);
		panel.add(submit);
		submit.setActionCommand("Submit");
		
		JLabel LB = new JLabel("");
		LB.setBounds(159, 341, 303, 63);
		panel.add(LB);
		LB.setBackground(Color.LIGHT_GRAY);
		LB.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		
		JButton btnNewButton = new JButton("Check Answer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
			 txtInterger.getText();
			 txtAnswer.getText();
			}
		});
		btnNewButton.setBounds(10, 216, 216, 63);
		panel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox() ;
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"9", "12", "16", "18", "24", "57", "96", "100", "105", "112", "119"}));
		comboBox.setBounds(324, 113, 216, 63);
		panel.add(comboBox);
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				
			}
		});
	}
}
