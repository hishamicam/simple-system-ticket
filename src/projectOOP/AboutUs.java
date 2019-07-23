package projectOOP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
					frame.setTitle("Group Members");
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutUs() {
		
		show1();
		
		
	}

	private void show1() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setBackground(new Color(176, 224, 230));
		contentPane.setLayout(null);
	
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 130, 540, 160);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("No Matriks");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Hishamudin Bin Ali");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("B031820050 (BITD)");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Muhammad Fathillah Bin Hamzan");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("B031820076 (BITM)");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Muhammad Aidil Hakim Bin Ahmad");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("B031820077 (BITZ)");
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel = new JLabel("Omar Zidane Bin Abdul Shariff\t");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("B031820078 (BITM)");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_10 = new JLabel("Omar Daniel Bin Abdul Shariff\t");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("B031820079 (BITD)");
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(lblNewLabel_11);
		
		JLabel lblGroupMembers = new JLabel("Group Members");
		lblGroupMembers.setFont(new Font("Dialog", Font.BOLD, 17));
		lblGroupMembers.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupMembers.setBounds(254, 92, 128, 27);
		contentPane.add(lblGroupMembers);
		
		JLabel lblBitp = new JLabel("BITP3113 OBJECT ORIENTED PROGRAMMING");
		lblBitp.setHorizontalAlignment(SwingConstants.CENTER);
		lblBitp.setFont(new Font("Dialog", Font.BOLD, 17));
		lblBitp.setBounds(56, 11, 517, 27);
		contentPane.add(lblBitp);
		
		JLabel label = new JLabel("2019");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setBounds(254, 35, 128, 27);
		contentPane.add(label);
	}
}
