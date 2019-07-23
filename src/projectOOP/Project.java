package projectOOP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.util.Date;
import java.beans.PropertyChangeEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Project {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldChild;
	private JTextField textField_Adult;
	private JTextField textField;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textFieldCookies;
	private JTextField textFieldSpa;
	private JTextField textField_Pan;
	private JTextField textField_NS;
	private JTextField textField_CFR;
	private JTextField textField_CB;
	private JTextField textField_MN;
	private JTextField textField_OJ;
	private JTextField textField_CC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
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
	public Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Flight Ticketing System");
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(100, 100, 1089, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(299, 11, 491, 30);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Welcome to the flight ticketing system");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JPanel panelType = new JPanel();
		panelType.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Flight type", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelType.setBounds(10, 165, 156, 103);
		frame.getContentPane().add(panelType);
		panelType.setLayout(new GridLayout(3, 1, 0, 0));
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(rdbtnStandard);
		panelType.add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(rdbtnEconomy);
		panelType.add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(rdbtnFirstClass);
		panelType.add(rdbtnFirstClass);
		
		JPanel panel_Pass = new JPanel();
		panel_Pass.setBorder(new TitledBorder(null, "Passenger", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Pass.setBounds(10, 279, 156, 161);
		frame.getContentPane().add(panel_Pass);
		GridBagLayout gbl_panel_Pass = new GridBagLayout();
		gbl_panel_Pass.columnWidths = new int[]{55, 55, 0};
		gbl_panel_Pass.rowHeights = new int[]{47, 47, 0, 0};
		gbl_panel_Pass.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_Pass.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Pass.setLayout(gbl_panel_Pass);
		
		JLabel lblChild = new JLabel("Child :");
		lblChild.setFont(new Font("Dialog", Font.PLAIN, 15));
		GridBagConstraints gbc_lblChild = new GridBagConstraints();
		gbc_lblChild.fill = GridBagConstraints.BOTH;
		gbc_lblChild.insets = new Insets(0, 0, 5, 5);
		gbc_lblChild.gridx = 0;
		gbc_lblChild.gridy = 0;
		panel_Pass.add(lblChild, gbc_lblChild);
		
		textFieldChild = new JTextField();
		textFieldChild.setFont(new Font("Dialog", Font.PLAIN, 15));
		textFieldChild.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldChild.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textFieldChild.selectAll();
			}
		});
		
		textFieldChild.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				tukar();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				tukar();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				tukar();
			}
			
			public void tukar() {
				
				try	{
					int result = Integer.valueOf(textFieldChild.getText()) + Integer.valueOf(textField_Adult.getText());
					//textField.setText(Integer.valueOf(result));
					textField.setText(String.valueOf(result));
					
					if(textFieldChild.getText() == null) {
						textField_Adult.addFocusListener(new FocusAdapter() {
							@Override
							public void focusGained(FocusEvent e) {
								textField_Adult.selectAll();
							}
						});
					}
					
				}
				catch(Exception e){
					//JOptionPane.showMessageDialog(null, message);
					//JOptionPane.showMessageDialog(null, "Please fill the number passenger!", "Info Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		

		
		textFieldChild.setText("0");
		GridBagConstraints gbc_textFieldChild = new GridBagConstraints();
		gbc_textFieldChild.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldChild.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldChild.gridx = 1;
		gbc_textFieldChild.gridy = 0;
		panel_Pass.add(textFieldChild, gbc_textFieldChild);
		textFieldChild.setColumns(10);
		
		JLabel lblAdult = new JLabel("Adult :");
		lblAdult.setFont(new Font("Dialog", Font.PLAIN, 15));
		GridBagConstraints gbc_lblAdult = new GridBagConstraints();
		gbc_lblAdult.fill = GridBagConstraints.BOTH;
		gbc_lblAdult.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdult.gridx = 0;
		gbc_lblAdult.gridy = 1;
		panel_Pass.add(lblAdult, gbc_lblAdult);
		
		textField_Adult = new JTextField();
		textField_Adult.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_Adult.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Adult.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				tukar();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				tukar();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				tukar();
			}
			
			public void tukar() {
				
				try	{
					int result = Integer.valueOf(textFieldChild.getText()) + Integer.valueOf(textField_Adult.getText());
					//textField.setText(Integer.valueOf(result));
					textField.setText(String.valueOf(result));
					
					if(textField_Adult.getText() == null) {
						textFieldChild.addFocusListener(new FocusAdapter() {
							@Override
							public void focusGained(FocusEvent e) {
								textFieldChild.selectAll();
							}
						});
					}
				}
				catch(Exception e){
					//JOptionPane.showMessageDialog(null, message);
					//JOptionPane.showMessageDialog(null, "Please fill the number passenger!", "Info Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		textField_Adult.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textField_Adult.selectAll();
			}
		});
		textField_Adult.setText("0");
		textField_Adult.setColumns(10);
		GridBagConstraints gbc_textField_Adult = new GridBagConstraints();
		gbc_textField_Adult.insets = new Insets(0, 0, 5, 0);
		gbc_textField_Adult.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_Adult.gridx = 1;
		gbc_textField_Adult.gridy = 1;
		panel_Pass.add(textField_Adult, gbc_textField_Adult);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Dialog", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lblTotal.anchor = GridBagConstraints.EAST;
		gbc_lblTotal.gridx = 0;
		gbc_lblTotal.gridy = 2;
		panel_Pass.add(lblTotal, gbc_lblTotal);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Dialog", Font.PLAIN, 24));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		panel_Pass.add(textField, gbc_textField);
		textField.setColumns(10);
		//textField_Adult.getDocument()
		
		JPanel panel_Food = new JPanel();
		panel_Food.setBorder(new TitledBorder(null, "Meals", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Food.setBounds(176, 177, 437, 276);
		frame.getContentPane().add(panel_Food);
		panel_Food.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel labelCookies = new JLabel("");
		JCheckBox chckbxCookies = new JCheckBox("Cookies (RM6)");
		chckbxCookies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCookies.isSelected())
				{
					textFieldCookies.setEnabled(true);
				}
				else
				{
					textFieldCookies.setEnabled(false);
					textFieldCookies.setText(null);
					labelCookies.setText("");
				}
			}
		});
		chckbxCookies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxCookies.isSelected())
				{
					textFieldCookies.setEnabled(true);
				}
				else
				{
					textFieldCookies.setEnabled(false);
					textFieldCookies.setText(null);
					labelCookies.setText("");
				}
			}
		});
		chckbxCookies.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Food.add(chckbxCookies);
		
		JPanel panel_1 = new JPanel();
		panel_Food.add(panel_1);
		panel_1.setLayout(null);
		
		
		labelCookies.setFont(new Font("Dialog", Font.PLAIN, 15));
		labelCookies.setHorizontalAlignment(SwingConstants.CENTER);
		labelCookies.setBounds(106, 10, 78, 19);
		panel_1.add(labelCookies);
		
		textFieldCookies = new JTextField();
		textFieldCookies.setEnabled(false);
		textFieldCookies.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCookies.setBounds(10, 11, 86, 20);
		panel_1.add(textFieldCookies);
		textFieldCookies.setColumns(10);
		textFieldCookies.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textFieldCookies.getText());
				double total = i * 6;
				labelCookies.setText("RM "+ String.format( "%.2f",total));
			}
			});
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setBounds(10, -10, 86, 30);
		panel_1.add(lblQuantity);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal_1.setBounds(138, -2, 46, 14);
		panel_1.add(lblTotal_1);
		
		
		JLabel label_Spa = new JLabel("");
		JCheckBox chckbxSpaghetti = new JCheckBox("Spaghetti (RM12)");
		chckbxSpaghetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpaghetti.isSelected())
				{
					textFieldSpa.setEnabled(true);
				}
				else
				{
					textFieldSpa.setEnabled(false);
					textFieldSpa.setText(null);
					label_Spa.setText("");
				}
			}
		});
		chckbxSpaghetti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxSpaghetti.isSelected())
				{
					textFieldSpa.setEnabled(true);
				}
				else
				{
					textFieldSpa.setEnabled(false);
					textFieldSpa.setText(null);
					label_Spa.setText("");
				}
			}
		});
		chckbxSpaghetti.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Food.add(chckbxSpaghetti);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_Food.add(panel_2);
		
		textFieldSpa = new JTextField();
		textFieldSpa.setEnabled(false);
		textFieldSpa.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSpa.setColumns(10);
		textFieldSpa.setBounds(10, 11, 86, 20);
		panel_2.add(textFieldSpa);
		textFieldSpa.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textFieldSpa.getText());
				double total = i * 12;
				label_Spa.setText("RM "+ String.format( "%.2f",total));
			}
			});
		
		
		
		label_Spa.setHorizontalAlignment(SwingConstants.CENTER);
		label_Spa.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_Spa.setBounds(106, 12, 78, 19);
		panel_2.add(label_Spa);
		
		JLabel label_Pan = new JLabel("");
		JCheckBox chckbxPancake = new JCheckBox("Pancake (RM9)");
		chckbxPancake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPancake.isSelected())
				{
					textField_Pan.setEnabled(true);
				}
				else
				{
					textField_Pan.setEnabled(false);
					textField_Pan.setText(null);
					label_Pan.setText("");
				}
			}
		});
		chckbxPancake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxPancake.isSelected())
				{
					textField_Pan.setEnabled(true);
				}
				else
				{
					textField_Pan.setEnabled(false);
					textField_Pan.setText(null);
					label_Pan.setText("");
				}
			}
		});
		chckbxPancake.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Food.add(chckbxPancake);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_Food.add(panel_3);
		
		textField_Pan = new JTextField();
		textField_Pan.setEnabled(false);
		textField_Pan.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Pan.setColumns(10);
		textField_Pan.setBounds(10, 11, 86, 20);
		panel_3.add(textField_Pan);
		textField_Pan.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textField_Pan.getText());
				double total = i * 9;
				label_Pan.setText("RM "+ String.format( "%.2f",total));
			}
			});
		
		
		
		label_Pan.setHorizontalAlignment(SwingConstants.CENTER);
		label_Pan.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_Pan.setBounds(106, 12, 78, 19);
		panel_3.add(label_Pan);
		
		JLabel label_NS = new JLabel("");
		JCheckBox chckbxNasiLemak = new JCheckBox("Nasi Lemak (RM10)");
		chckbxNasiLemak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxNasiLemak.isSelected())
				{
					textField_NS.setEnabled(true);
				}
				else
				{
					textField_NS.setEnabled(false);
					textField_NS.setText(null);
					label_NS.setText("");
				}
			}
		});
		chckbxNasiLemak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNasiLemak.isSelected())
				{
					textField_NS.setEnabled(true);
				}
				else
				{
					textField_NS.setEnabled(false);
					textField_NS.setText(null);
					label_NS.setText("");
				}
			}
		});
		chckbxNasiLemak.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Food.add(chckbxNasiLemak);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_Food.add(panel_4);
		
		textField_NS = new JTextField();
		textField_NS.setEnabled(false);
		textField_NS.setHorizontalAlignment(SwingConstants.CENTER);
		textField_NS.setColumns(10);
		textField_NS.setBounds(10, 11, 86, 20);
		panel_4.add(textField_NS);
		textField_NS.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textField_NS.getText());
				double total = i * 10;
				label_NS.setText("RM "+ String.format( "%.2f",total));
			}
			});
		
		
		
		label_NS.setHorizontalAlignment(SwingConstants.CENTER);
		label_NS.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_NS.setBounds(106, 11, 78, 19);
		panel_4.add(label_NS);
		
		JLabel label_CFR = new JLabel("");
		JCheckBox chckbxFriedRice = new JCheckBox("Chicken Fried Rice (RM14)");
		chckbxFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFriedRice.isSelected())
				{
					textField_CFR.setEnabled(true);
				}
				else
				{
					textField_CFR.setEnabled(false);
					textField_CFR.setText(null);
					label_CFR.setText("");
				}
			}
		});
		chckbxFriedRice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxFriedRice.isSelected())
				{
					textField_CFR.setEnabled(true);
				}
				else
				{
					textField_CFR.setEnabled(false);
					textField_CFR.setText(null);
					label_CFR.setText("");
				}
			}
		});
		chckbxFriedRice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Food.add(chckbxFriedRice);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_Food.add(panel_5);
		
		textField_CFR = new JTextField();
		textField_CFR.setEnabled(false);
		textField_CFR.setHorizontalAlignment(SwingConstants.CENTER);
		textField_CFR.setColumns(10);
		textField_CFR.setBounds(10, 12, 86, 20);
		panel_5.add(textField_CFR);
		textField_CFR.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textField_CFR.getText());
				double total = i * 14;
				label_CFR.setText("RM "+ String.format( "%.2f",total));
			}
			});
		
		
		
		label_CFR.setHorizontalAlignment(SwingConstants.CENTER);
		label_CFR.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_CFR.setBounds(106, 11, 78, 19);
		panel_5.add(label_CFR);
		
		JLabel label_CB = new JLabel("");
		JCheckBox chckbxChickenBriyani = new JCheckBox("Chicken Briyani (RM20)");
		chckbxChickenBriyani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChickenBriyani.isSelected())
				{
					textField_CB.setEnabled(true);
				}
				else
				{
					textField_CB.setEnabled(false);
					textField_CB.setText(null);
					label_CB.setText("");
				}
			}
		});
		chckbxChickenBriyani.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxChickenBriyani.isSelected())
				{
					textField_CB.setEnabled(true);
				}
				else
				{
					textField_CB.setEnabled(false);
					textField_CB.setText(null);
					label_CB.setText("");
				}
			}
		});
		chckbxChickenBriyani.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Food.add(chckbxChickenBriyani);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_Food.add(panel_6);
		
		textField_CB = new JTextField();
		textField_CB.setEnabled(false);
		textField_CB.setHorizontalAlignment(SwingConstants.CENTER);
		textField_CB.setColumns(10);
		textField_CB.setBounds(10, 11, 86, 20);
		panel_6.add(textField_CB);
		textField_CB.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textField_CB.getText());
				double total = i * 20;
				label_CB.setText("RM "+ String.format( "%.2f",total));
			}
			});
		
		
		label_CB.setHorizontalAlignment(SwingConstants.CENTER);
		label_CB.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_CB.setBounds(106, 11, 78, 19);
		panel_6.add(label_CB);
		
		JPanel panel_Drink = new JPanel();
		panel_Drink.setBorder(new TitledBorder(null, "Drinks", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Drink.setBounds(172, 464, 441, 119);
		frame.getContentPane().add(panel_Drink);
		panel_Drink.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel label_MN = new JLabel("");
		JCheckBox chckbxMineralWater = new JCheckBox("Mineral Water (Free)");
		chckbxMineralWater.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxMineralWater.isSelected())
				{
					textField_MN.setEnabled(true);
				}
				else
				{
					textField_MN.setEnabled(false);
					textField_MN.setText(null);
					label_MN.setText("");
				}
			}
		});
		chckbxMineralWater.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Drink.add(chckbxMineralWater);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_Drink.add(panel_7);
		
		textField_MN = new JTextField();
		textField_MN.setEnabled(false);
		textField_MN.setHorizontalAlignment(SwingConstants.CENTER);
		textField_MN.setColumns(10);
		textField_MN.setBounds(10, 11, 86, 20);
		panel_7.add(textField_MN);
		textField_MN.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textField_MN.getText());
				//double total = i * 6;
				label_MN.setText("RM 0");
			}
			});
		
		JLabel label_6 = new JLabel("Quantity");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(10, -10, 86, 30);
		panel_7.add(label_6);
		
		JLabel label_7 = new JLabel("Total");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(138, -2, 46, 14);
		panel_7.add(label_7);
		
		
		label_MN.setHorizontalAlignment(SwingConstants.CENTER);
		label_MN.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_MN.setBounds(106, 10, 78, 19);
		panel_7.add(label_MN);
		
		JLabel label_OJ = new JLabel("");
		JCheckBox chckbxOrangeJuice = new JCheckBox("Orange Juice (RM6)");
		chckbxOrangeJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxOrangeJuice.isSelected())
				{
					textField_OJ.setEnabled(true);
				}
				else
				{
					textField_OJ.setEnabled(false);
					textField_OJ.setText(null);
					label_OJ.setText("");
				}
			}
		});
		chckbxOrangeJuice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxOrangeJuice.isSelected())
				{
					textField_OJ.setEnabled(true);
				}
				else
				{
					textField_OJ.setEnabled(false);
					textField_OJ.setText(null);
					label_OJ.setText("");
				}
			}
		});
		chckbxOrangeJuice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Drink.add(chckbxOrangeJuice);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_Drink.add(panel_8);
		
		textField_OJ = new JTextField();
		textField_OJ.setEnabled(false);
		textField_OJ.setHorizontalAlignment(SwingConstants.CENTER);
		textField_OJ.setColumns(10);
		textField_OJ.setBounds(10, 11, 86, 20);
		panel_8.add(textField_OJ);
		textField_OJ.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textField_OJ.getText());
				double total = i * 6;
				label_OJ.setText("RM "+ String.format( "%.2f",total));
			}
			});
		
		
		label_OJ.setHorizontalAlignment(SwingConstants.CENTER);
		label_OJ.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_OJ.setBounds(106, 12, 78, 19);
		panel_8.add(label_OJ);
		
		JLabel label_CC = new JLabel("");
		JCheckBox chckbxCocaCola = new JCheckBox("Coca Cola (RM6)");
		chckbxCocaCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCocaCola.isSelected())
				{
					textField_CC.setEnabled(true);
				}
				else
				{
					textField_CC.setEnabled(false);
					textField_CC.setText(null);
					label_CC.setText("");
				}
			}
		});
		chckbxCocaCola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chckbxCocaCola.isSelected())
				{
					textField_CC.setEnabled(true);
				}
				else
				{
					textField_CC.setEnabled(false);
					textField_CC.setText(null);
					label_CC.setText("");
				}
			}
		});
		chckbxCocaCola.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_Drink.add(chckbxCocaCola);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_Drink.add(panel_9);
		
		textField_CC = new JTextField();
		textField_CC.setEnabled(false);
		textField_CC.setHorizontalAlignment(SwingConstants.CENTER);
		textField_CC.setColumns(10);
		textField_CC.setBounds(10, 11, 86, 20);
		panel_9.add(textField_CC);
		textField_CC.getDocument().addDocumentListener(new DocumentListener () {

			@Override
			public void insertUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				process();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				process();
				
			}
			public void process() {
				int i = Integer.valueOf(textField_CC.getText());
				double total = i * 6;
				label_CC.setText("RM "+ String.format( "%.2f",total));
			}
			});
		
		
		label_CC.setHorizontalAlignment(SwingConstants.CENTER);
		label_CC.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_CC.setBounds(106, 12, 78, 19);
		panel_9.add(label_CC);
		
		JPanel panel_Ticket = new JPanel();
		panel_Ticket.setBorder(new TitledBorder(null, "Ticket Type", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Ticket.setBounds(10, 63, 156, 91);
		frame.getContentPane().add(panel_Ticket);
		panel_Ticket.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnOneWay = new JRadioButton("One Way Ticket");
		rdbtnOneWay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup_1.add(rdbtnOneWay);
		panel_Ticket.add(rdbtnOneWay);
		
		JPanel panel_Depart = new JPanel();
		panel_Depart.setBorder(new TitledBorder(null, "Departure", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Depart.setBounds(176, 63, 373, 46);
		frame.getContentPane().add(panel_Depart);
		panel_Depart.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_KL = new JLabel("Kuala Lumpur");
		lblNewLabel_KL.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel_Depart.add(lblNewLabel_KL);
		
		JPanel panel_Arrivals = new JPanel();
		panel_Arrivals.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Arrivals", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Arrivals.setBounds(176, 120, 373, 46);
		frame.getContentPane().add(panel_Arrivals);
		panel_Arrivals.setLayout(new GridLayout(0, 1, 0, 0));
		
		JComboBox comboBox_Arrivals = new JComboBox();
		comboBox_Arrivals.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_Arrivals.setModel(new DefaultComboBoxModel(new String[] {"Taipei (RM 150)", "Hong Kong (RM 178)", "Bangkok (RM 126)", "Tokyo (RM 300)", "London (RM 400)"}));
		comboBox_Arrivals.setSelectedIndex(0);
		panel_Arrivals.add(comboBox_Arrivals);
		
		JLabel lblTax = new JLabel("Tax 6% :");
		lblTax.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTax.setBounds(663, 478, 106, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblPrice.setBounds(663, 453, 106, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblTotalPrice = new JLabel("Total Price :");
		lblTotalPrice.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTotalPrice.setBounds(663, 503, 106, 14);
		frame.getContentPane().add(lblTotalPrice);
		
		JLabel labelPrice = new JLabel("");
		labelPrice.setFont(new Font("Dialog", Font.PLAIN, 15));
		labelPrice.setBounds(928, 453, 98, 14);
		frame.getContentPane().add(labelPrice);
		
		JLabel labelTotalPrice = new JLabel("");
		labelTotalPrice.setFont(new Font("Dialog", Font.BOLD, 15));
		labelTotalPrice.setBounds(928, 503, 98, 14);
		frame.getContentPane().add(labelTotalPrice);
		
		JDateChooser dateChooserDepart = new JDateChooser();
		dateChooserDepart.setDateFormatString("d, MMM , yyyy");
		dateChooserDepart.setBounds(701, 78, 128, 20);
		frame.getContentPane().add(dateChooserDepart);
		
		JLabel lblNewLabel_2 = new JLabel("Date Departure :");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(576, 84, 116, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(649, 177, 25, 394);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(652, 177, 426, 20);
		frame.getContentPane().add(separator_1);
		
		
		
		JLabel lblFlightType = new JLabel("Flight Type :");
		lblFlightType.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblFlightType.setBounds(663, 294, 192, 20);
		frame.getContentPane().add(lblFlightType);
		
		JLabel lblChild_1 = new JLabel("Number of Child (Free):");
		lblChild_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblChild_1.setBounds(663, 325, 156, 20);
		frame.getContentPane().add(lblChild_1);
		
		JLabel lblNumberOfAdult = new JLabel("Number of Adult (15% of ticket):");
		lblNumberOfAdult.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNumberOfAdult.setBounds(663, 356, 216, 29);
		frame.getContentPane().add(lblNumberOfAdult);
		
		JLabel lblTicketType = new JLabel("Ticket Type :");
		lblTicketType.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTicketType.setBounds(663, 260, 106, 20);
		frame.getContentPane().add(lblTicketType);
		
		JLabel label_Tax = new JLabel("");
		label_Tax.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_Tax.setBounds(928, 478, 98, 14);
		frame.getContentPane().add(label_Tax);
		
		JLabel lblFrom = new JLabel("From :");
		lblFrom.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblFrom.setBounds(663, 226, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To :");
		lblTo.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTo.setBounds(853, 226, 46, 14);
		frame.getContentPane().add(lblTo);
		
		JLabel label_Depart = new JLabel("");
		label_Depart.setFont(new Font("Dialog", Font.BOLD, 15));
		label_Depart.setBounds(719, 218, 124, 31);
		frame.getContentPane().add(label_Depart);
		
		JLabel label_Arrive = new JLabel("");
		label_Arrive.setFont(new Font("Dialog", Font.BOLD, 15));
		label_Arrive.setBounds(884, 218, 172, 31);
		frame.getContentPane().add(label_Arrive);
		
		JLabel lblTotalPriceFor = new JLabel("Total price for foods and drinks :");
		lblTotalPriceFor.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblTotalPriceFor.setBounds(663, 396, 227, 30);
		frame.getContentPane().add(lblTotalPriceFor);
		
		JLabel labelTT = new JLabel("");
		labelTT.setFont(new Font("Dialog", Font.PLAIN, 15));
		labelTT.setBounds(928, 258, 140, 24);
		frame.getContentPane().add(labelTT);
		
		JLabel labelFT = new JLabel("");
		labelFT.setFont(new Font("Dialog", Font.PLAIN, 15));
		labelFT.setBounds(928, 299, 98, 14);
		frame.getContentPane().add(labelFT);
		
		JLabel labelNC = new JLabel("");
		labelNC.setFont(new Font("Dialog", Font.PLAIN, 15));
		labelNC.setBounds(928, 330, 98, 14);
		frame.getContentPane().add(labelNC);
		
		JLabel labelNA = new JLabel("");
		labelNA.setFont(new Font("Dialog", Font.PLAIN, 15));
		labelNA.setBounds(928, 363, 98, 14);
		frame.getContentPane().add(labelNA);
		
		JLabel labelFoodDrink = new JLabel("");
		labelFoodDrink.setFont(new Font("Dialog", Font.PLAIN, 15));
		labelFoodDrink.setBounds(928, 406, 98, 14);
		frame.getContentPane().add(labelFoodDrink);
		
		JLabel labelDate = new JLabel("");
		labelDate.setFont(new Font("Dialog", Font.BOLD, 15));
		labelDate.setBounds(755, 191, 271, 24);
		frame.getContentPane().add(labelDate);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirm.addActionListener(new ActionListener() {
			/* (non-Javadoc)
			 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
			 */
			public void actionPerformed(ActionEvent e) {
				
				
				//double oneway = 
				double ticketPrice = 0;
				//double returnTicket = 0; 
				
				double childTotal = 0;
				//double adultTotal = 0;
				double adultTotal = 0;
				//double pass = 0;
				double std = 120;
				double eco = 200;
				double fs = 300;
				double food = 0;
				double total = 0;

				int dialogResult = JOptionPane.showConfirmDialog(null, "Confirm to purchase this ticket");
				if(dialogResult == JOptionPane.YES_OPTION)
				{

					label_Depart.setText("Kuala Lumpur");
					if(comboBox_Arrivals.getSelectedItem() == "Taipei (RM 150)")
					{
						ticketPrice = 150.0;
						label_Arrive.setText("Taipei (RM 150)");
					}
					else if(comboBox_Arrivals.getSelectedItem() == "Hong Kong (RM 178)")
					{
						ticketPrice = 178.0;
						label_Arrive.setText("Hong Kong (RM 178)");
					}
					else if(comboBox_Arrivals.getSelectedItem() == "Bangkok (RM 126)")
					{
						ticketPrice = 126.0;
						label_Arrive.setText("Bangkok (RM 126)");
					}
					else if(comboBox_Arrivals.getSelectedItem() == "Tokyo (RM 300)")
					{
						ticketPrice = 300.0;
						label_Arrive.setText("Tokyo (RM 300)");
					}
					else if(comboBox_Arrivals.getSelectedItem() == "London (RM 400)")
					{
						ticketPrice = 400.0;
						label_Arrive.setText("London (RM 400)");
					}
					
					
					// date
					if(dateChooserDepart.getDate() == null)
					{
						JOptionPane.showMessageDialog(null, "Please choose your date flight ", "Info Message", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					
					// flight type
					if(!rdbtnStandard.isSelected() && !rdbtnEconomy.isSelected() && !rdbtnFirstClass.isSelected() )
					{
						JOptionPane.showMessageDialog(null, "Please choose your flight type ", "Info Message", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					
					else if(rdbtnStandard.isSelected())
					{
						ticketPrice += std;
						lblFlightType.setText("Flight Type (Standard) :");
						labelFT.setText("RM 120.00");
					}
					
					else if(rdbtnEconomy.isSelected())
					{
						ticketPrice += eco;
						lblFlightType.setText("Flight Type (Economy) :");
						labelFT.setText("RM 200.00");
					}
					
					else
					{
						ticketPrice += fs;
						lblFlightType.setText("Flight Type (First Class) :");
						labelFT.setText("RM 300.00");
					}
					
					
					// ticket type
					if(!rdbtnOneWay.isSelected())
					{
						JOptionPane.showMessageDialog(null, "Please choose your ticket type ", "Info Message", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					else if(rdbtnOneWay.isSelected())
					{
						ticketPrice = ticketPrice * 1;
						//lblTicketType.setText("Ticket Type (One way ticket) :");
						labelTT.setText("One way ticket ");
					}
					
					else
					{
						ticketPrice = ticketPrice * 2;
						labelTT.setText("2 way ticket ");
					}
					
					//passengger
					if(textField.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please state your number of passenger", "Info Message", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					
					
					// food
					if(chckbxCookies.isSelected())
					{
						textFieldCookies.setEnabled(true);
						int i = Integer.valueOf(textFieldCookies.getText());
						food = food + 6 * i;
					}
					
					if(chckbxSpaghetti.isSelected())
					{
						textFieldSpa.setEnabled(true);
						int i = Integer.valueOf(textFieldSpa.getText());
						food = food + 12 * i;
						
					}
					
					if(chckbxPancake.isSelected())
					{
						textField_Pan.setEnabled(true);
						int i = Integer.valueOf(textField_Pan.getText());
						food = food + 9 * i;
						
					}
					
					if(chckbxNasiLemak.isSelected())
					{
						textField_NS.setEnabled(true);
						int i = Integer.valueOf(textField_NS.getText());
						food = food + 10 * i;
						
					}
					
					if(chckbxFriedRice.isSelected())
					{
						textField_CFR.setEnabled(true);
						int i = Integer.valueOf(textField_CFR.getText());
						food = food + 14 * i;
						
					}
					
					if(chckbxChickenBriyani.isSelected())
					{
						textField_CB.setEnabled(true);
						int i = Integer.valueOf(textField_CB.getText());
						food = food + 20 * i;
						
					}

					if(chckbxMineralWater.isSelected())
					{
						food += 0;
					}
					if(chckbxOrangeJuice.isSelected())
					{
						textField_OJ.setEnabled(true);
						int i = Integer.valueOf(textField_OJ.getText());
						food = food + 6 * i;
					}
					if(chckbxCocaCola.isSelected())
					{
						textField_CC.setEnabled(true);
						int i = Integer.valueOf(textField_CC.getText());
						food = food + 6 * i;
					}
					
					//childTotal = 0;
					adultTotal = 0.15 * ticketPrice;
					
					double totalpass = Integer.parseInt(textFieldChild.getText()) * childTotal;
					labelNC.setText(textFieldChild.getText()   + " (RM 0.0)");
					
					double totalpass2 = Integer.parseInt(textField_Adult.getText()) * adultTotal;
					labelNA.setText(textField_Adult.getText()  + " (RM "+ String.format( "%.2f",totalpass2) + ")");
					
					labelFoodDrink.setText("RM "+ String.format( "%.2f",food));
					
					
					
					total = ticketPrice + totalpass + totalpass2 + food;
					labelPrice.setText("RM "+ String.format( "%.2f",total));
					
					double tax = total * 0.06;
					label_Tax.setText("RM "+ String.format( "%.2f",tax) );
					//JOptionPane.showMessageDialog(null, ticketPrice, "Info Message", JOptionPane.INFORMATION_MESSAGE);
					
					double totalPrice = total + tax;
					labelTotalPrice.setText("RM "+ String.format( "%.2f",totalPrice) );
					
					Date date = dateChooserDepart.getDate();
					String strDate = DateFormat.getDateInstance().format(date);
					
					labelDate.setText("Date Flight: " + strDate);
				}
				
			}
		});
		btnConfirm.setBounds(718, 541, 116, 30);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				buttonGroup_1.clearSelection();
				buttonGroup.clearSelection();
				textFieldChild.setText("0");
				textField_Adult.setText("0");
				comboBox_Arrivals.setSelectedIndex(-0);
				
				chckbxCookies.setSelected(false);
				chckbxSpaghetti.setSelected(false);
				chckbxPancake.setSelected(false);
				chckbxNasiLemak.setSelected(false);
				chckbxFriedRice.setSelected(false);
				chckbxChickenBriyani.setSelected(false);
				
				chckbxMineralWater.setSelected(false);
				chckbxOrangeJuice.setSelected(false);
				chckbxCocaCola.setSelected(false);

				labelDate.setText(null);
				label_Depart.setText(null);
				label_Arrive.setText(null);
				labelTT.setText(null);
				labelFT.setText(null);
				labelNC.setText(null);
				labelNA.setText(null);
				labelFoodDrink.setText(null);
				labelPrice.setText(null);
				label_Tax.setText(null);
				labelTotalPrice.setText(null);
				
				dateChooserDepart.setDate(null);
				
			}
		});
		btnReset.setBounds(884, 541, 116, 30);
		frame.getContentPane().add(btnReset);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.PINK);
		menuBar.setFont(new Font("Dialog", Font.PLAIN, 15));
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Dialog", Font.PLAIN, 15));
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("Open New");
		mntmNew.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonGroup_1.clearSelection();
				buttonGroup.clearSelection();
				textFieldChild.setText("0");
				textField_Adult.setText("0");
				comboBox_Arrivals.setSelectedIndex(-0);
				
				chckbxCookies.setSelected(false);
				chckbxSpaghetti.setSelected(false);
				chckbxPancake.setSelected(false);
				chckbxNasiLemak.setSelected(false);
				chckbxFriedRice.setSelected(false);
				chckbxChickenBriyani.setSelected(false);
				
				chckbxMineralWater.setSelected(false);
				chckbxOrangeJuice.setSelected(false);
				chckbxCocaCola.setSelected(false);

				labelDate.setText(null);
				label_Depart.setText(null);
				label_Arrive.setText(null);
				labelTT.setText(null);
				labelFT.setText(null);
				labelNC.setText(null);
				labelNA.setText(null);
				labelFoodDrink.setText(null);
				labelPrice.setText(null);
				label_Tax.setText(null);
				labelTotalPrice.setText(null);
				
				dateChooserDepart.setDate(null);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.dispose();
				frame.setVisible(true);
			}
		});
		mnFile.add(mntmNew);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About us");
		mntmNewMenuItem.setFont(new Font("Dialog", Font.PLAIN, 15));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AboutUs frame = new AboutUs();
				frame.setDefaultCloseOperation(AboutUs.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
				frame.setTitle("Group Members");
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		
	}
}
