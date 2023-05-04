package restaurent_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class R_B_A {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					R_B_A window = new R_B_A();
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
	public R_B_A() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 732, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("R_B_A");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(269, 43, 137, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMenu = new JLabel("Menu :");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMenu.setBounds(65, 118, 67, 14);
		frame.getContentPane().add(lblMenu);
		
		JLabel lblQnty = new JLabel("Qnty :");
		lblQnty.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQnty.setBounds(65, 203, 67, 20);
		frame.getContentPane().add(lblQnty);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 20));
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "BIRYANI-Rs130", "DRUMSTICKS-Rs99", "MANDI-Rs399", "FRENCH FRIES-Rs99", "MOJITOS-Rs69"}));
		c1.setBounds(209, 106, 222, 34);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(207, 200, 111, 30);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("ORDER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("BIRYANI-Rs130")) {
					bill=q*130;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n selected item:"+item+"\n qnty: " +q+ " \nyour bill:"+bill);}
				else if(item.equals("DRUMSTICKS-Rs99")) {
					bill=q*99;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n selected item:"+item+"\n qnty: " +q+ " \nyour bill:"+bill); }
				else if(item.equals("MANDI-Rs399")) {
					bill=q*399;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n selected item:"+item+"\n qnty: " +q+ " \nyour bill:"+bill); }
				else if(item.equals("FRENCH FRIES-Rs99")) {
					bill=q*99;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n selected item:"+item+"\n qnty: " +q+ " \nyour bill:"+bill); }
				else if(item.equals("MOJITOS-Rs69")) {
					bill=q*69;
					JOptionPane.showMessageDialog(btnNewButton, "hello\n selected item:"+item+"\n qnty: " +q+ " \nyour bill:"+bill);
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(107, 292, 116, 34);
		frame.getContentPane().add(btnNewButton);
	}
}
