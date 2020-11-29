package gui;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.border.CompoundBorder;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;

public class PatientGUI {
	private static String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\";
	private JFrame frame;
	private JTextField idTextField;
	private JPasswordField passwdTextField;
	private JTextField hospitalSearchTextField;
	private JTable hospitalListTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientGUI window = new PatientGUI();
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
	public PatientGUI() {
		initialize();
	}

	// ·Î±×ÀÎ
	void loginGUI() {
		ImagePanel loginPanel = backgroundPanel("È¯¿µÇÕ´Ï´Ù");
		loginPanel.setVisible(true);
		
		JLabel loginLabel = new JLabel("   LOG IN");
		loginLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		loginLabel.setBounds(155, 253, 201, 95);
		loginPanel.add(loginLabel);
		
		idTextField = new JTextField();
		idTextField.setBounds(126, 396, 357, 68);
		loginPanel.add(idTextField);
		idTextField.setColumns(10);
		
		JLabel idIconLabel = new JLabel("");
		idIconLabel.setIcon(new ImageIcon(PATH + "login_ID.png"));
		idIconLabel.setBounds(40, 395, 74, 68);
		loginPanel.add(idIconLabel);
		
		JLabel passwdIconLabel = new JLabel("");
		passwdIconLabel.setIcon(new ImageIcon(PATH + "login_passwd.png"));
		passwdIconLabel.setBounds(40, 497, 74, 68);
		loginPanel.add(passwdIconLabel);
		
		JButton loginButton = new JButton("");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.setIcon(new ImageIcon(PATH + "loginButton2.png"));
		loginButton.setBounds(343, 589, 140, 60);
		loginButton.setPressedIcon(new ImageIcon(PATH + "loginButton_click.png"));
		loginPanel.add(loginButton);
		
		passwdTextField = new JPasswordField();
		passwdTextField.setBounds(126, 497, 357, 68);
		loginPanel.add(passwdTextField);
		
		JLabel signupInLoginLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		signupInLoginLabel.setForeground(Color.BLUE);
		signupInLoginLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		signupInLoginLabel.setBounds(283, 634, 48, 15);
		loginPanel.add(signupInLoginLabel);
		
		lowerButton(loginPanel);
	}
	
	
	// È¸¿ø°¡ÀÔ
	void signUpGUI() {
		ImagePanel signupPanel = backgroundPanel("È¸¿ø°¡ÀÔ");
		signupPanel.setVisible(true);
		
		JPanel backGround = new JPanel();
		backGround.setBounds(12, 240, 505, 535);
		signupPanel.add(backGround);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		backGround.setOpaque(true);
		backGround.setBackground(Color.white);
		backGround.setLayout(null);
		
		JLabel signupUp = new JLabel("Sign UP");
		signupUp.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
		signupUp.setBounds(192, 183, 148, 40);
		signupPanel.add(signupUp);
		
		JLabel ID = new JLabel("¾ÆÀÌµð");
		ID.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		ID.setBounds(40, 20, 92, 35);
		backGround.add(ID);
		
		JLabel IDplus = new JLabel(" (4~10±ÛÀÚÀÇ ¿µ¹®ÀÚ¿Í ¼ýÀÚ Á¶ÇÕ)");
		IDplus.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		IDplus.setForeground(Color.gray);
		IDplus.setBounds(120, 27, 235, 35);
		backGround.add(IDplus);
		
		JTextField IDField = new JTextField("¾ÆÀÌµð¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		IDField.setForeground(Color.LIGHT_GRAY);
		IDField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		IDField.setBounds(40, 55, 400, 35);
		backGround.add(IDField);
		
		JLabel password = new JLabel("ºñ¹Ð¹øÈ£");
		password.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		password.setBounds(40, 113, 122, 35);
		backGround.add(password);
		
		JLabel passwordplus = new JLabel(" (8~16±ÛÀÚÀÇ ¿µ¹®ÀÚ¿Í ¼ýÀÚ Á¶ÇÕ)");
		passwordplus.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		passwordplus.setForeground(Color.gray);
		passwordplus.setBounds(147, 120, 193, 35);
		backGround.add(passwordplus);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		passwordField.setBounds(40, 148, 400, 35);
		backGround.add(passwordField);
		
		JLabel password2 = new JLabel("ºñ¹Ð¹øÈ£ È®ÀÎ");
		password2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		password2.setBounds(40, 210, 212, 30);
		backGround.add(password2);
		
		JPasswordField passwordField2 = new JPasswordField();
		passwordField2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		passwordField2.setBounds(40, 243, 400, 35);
		backGround.add(passwordField2);
		
		JLabel name = new JLabel("ÀÌ¸§");
		name.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		name.setBounds(40, 301, 57, 30);
		backGround.add(name);
		
		JTextField nameField = new JTextField("");
		nameField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		nameField.setBounds(40, 334, 400, 35);
		backGround.add(nameField);
		
		JLabel phoneNumber= new JLabel("ÀüÈ­¹øÈ£");
		phoneNumber.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		phoneNumber.setBounds(40, 395, 122, 30);
		backGround.add(phoneNumber);
		
		JLabel phoneNumberplus = new JLabel("(010-****-****)");
		phoneNumberplus.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN ,15));
		phoneNumberplus.setForeground(Color.gray);
		phoneNumberplus.setBounds(151, 397, 101, 35);
		backGround.add(phoneNumberplus);
		
		JTextField phoneNumberField = new JTextField("");
		phoneNumberField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		phoneNumberField.setBounds(40, 427, 400, 35);
		backGround.add(phoneNumberField);
		
		JButton cancel = new JButton("");
		cancel.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\cancelIcon.png"));
		cancel.setForeground(Color.BLACK);
		cancel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		cancel.setBounds(40, 485, 162, 42);
		backGround.add(cancel);
		
		JButton signin = new JButton("");
		signin.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\signupIcon.png"));
		signin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		signin.setBounds(278, 485, 162, 42);
		backGround.add(signin);
		
		backGround.add(ID);
		
		lowerButton(signupPanel);
	}
	
	// È¯ÀÚ °³ÀÎ Á¤º¸ 
	void patientInformationGUI() {
		ImagePanel patientInformationPanel = backgroundPanel("°³ÀÎÁ¤º¸");
		patientInformationPanel.setVisible(true);
		
		JPanel patientInformationWhitePanel = whitePanel(patientInformationPanel);
		
		JLabel patientIdLabel = new JLabel("arinlove");
		patientIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		patientIdLabel.setFont(new Font("Dialog", Font.BOLD, 33));
		patientIdLabel.setBounds(133, 168, 255, 48);
		patientInformationPanel.add(patientIdLabel);
		
		JPanel patientInfomationSmallPanel = new JPanel();
		patientInfomationSmallPanel.setBackground(Color.WHITE);
		patientInfomationSmallPanel.setForeground(Color.BLACK);
		patientInfomationSmallPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		patientInfomationSmallPanel.setBounds(12, 25, 481, 264);
		patientInformationWhitePanel.add(patientInfomationSmallPanel);
		patientInfomationSmallPanel.setLayout(null);
		
		JLabel informationNameLabel = new JLabel("\uC774\uB984");
		informationNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 27));
		informationNameLabel.setBounds(22, 34, 63, 47);
		patientInfomationSmallPanel.add(informationNameLabel);
		
		JLabel informationPhoneNumberLabel = new JLabel("\uC804\uD654\uBC88\uD638");
		informationPhoneNumberLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 27));
		informationPhoneNumberLabel.setBounds(22, 140, 123, 47);
		patientInfomationSmallPanel.add(informationPhoneNumberLabel);
		
		JLabel informationNameInputLabel = new JLabel("\uCD5C\uC544\uB9B0");
		informationNameInputLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 21));
		informationNameInputLabel.setBounds(61, 91, 72, 39);
		patientInfomationSmallPanel.add(informationNameInputLabel);
		
		JLabel informationPhoneNumberInputLabel = new JLabel("010-1234-5678");
		informationPhoneNumberInputLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 21));
		informationPhoneNumberInputLabel.setBounds(61, 197, 165, 39);
		patientInfomationSmallPanel.add(informationPhoneNumberInputLabel);
		
		JPanel patientInformationUpdatePanel = new JPanel();
		patientInformationUpdatePanel.setForeground(Color.BLACK);
		patientInformationUpdatePanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		patientInformationUpdatePanel.setBackground(Color.WHITE);
		patientInformationUpdatePanel.setBounds(12, 332, 481, 191);
		patientInformationWhitePanel.add(patientInformationUpdatePanel);
		patientInformationUpdatePanel.setLayout(null);
		
		JButton btnNewButton = new JButton("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(12, 29, 261, 49);
		patientInformationUpdatePanel.add(btnNewButton);
		
		JButton button = new JButton("\uD68C\uC6D0 \uD0C8\uD1F4");
		button.setForeground(Color.BLACK);
		button.setBackground(Color.WHITE);
		button.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		button.setBounds(12, 113, 261, 49);
		patientInformationUpdatePanel.add(button);
		
		lowerButton(patientInformationPanel);
	}
	
	
	// ºñ¹Ð¹øÈ£ º¯°æ
	void passwordChangeGUI() {
		ImagePanel passwordChangePanel = backgroundPanel("ºñ¹Ð¹øÈ£º¯°æ");
		passwordChangePanel.setVisible(true);
		
		JPanel passwordChangeWhitePanel = whitePanel(passwordChangePanel);
		
		
		JLabel passwordCh = new JLabel("ÇöÀç ºñ¹Ð¹øÈ£");
		passwordCh.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		passwordCh.setBounds(40, 30, 162, 35);
		passwordChangeWhitePanel.add(passwordCh);
		
		JPasswordField passwordFieldCh= new JPasswordField();
		passwordFieldCh.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		passwordFieldCh.setBounds(40, 74, 400, 35);
		passwordChangeWhitePanel.add(passwordFieldCh);
		
		JLabel password2Ch = new JLabel("º¯°æÇÒ ºñ¹Ð¹øÈ£ ");
		password2Ch.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		password2Ch.setBounds(40, 147, 200, 35);
		passwordChangeWhitePanel.add(password2Ch);
		
		JPasswordField passwordField2Ch = new JPasswordField();
		passwordField2Ch.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		passwordField2Ch.setBounds(40, 192, 400, 35);
		passwordChangeWhitePanel.add(passwordField2Ch);
		
		JLabel password3Ch = new JLabel("ºñ¹Ð¹øÈ£ ÀçÀÔ·Â");
		password3Ch.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		password3Ch.setBounds(40, 262, 200, 35);
		passwordChangeWhitePanel.add(password3Ch);
		
		JPasswordField passwordField3Ch = new JPasswordField();
		passwordField3Ch.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 25));
		passwordField3Ch.setBounds(40, 307, 400, 35);
		passwordChangeWhitePanel.add(passwordField3Ch);
		
		JButton cancelBt = new JButton("\uCDE8  \uC18C");
		cancelBt.setBackground(new Color(211, 211, 211));
		cancelBt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		cancelBt.setBounds(40, 400, 162, 42);
		passwordChangeWhitePanel.add(cancelBt);
		
		JButton changeBt = new JButton("º¯°æÇÏ±â");
		changeBt.setBackground(new Color(211, 211, 211));
		changeBt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		changeBt.setBounds(278, 400, 162, 42);
		passwordChangeWhitePanel.add(changeBt);
		
		lowerButton(passwordChangePanel);
	}
	
	
	//º´¿ø ¸®½ºÆ®
	void hospitalListGUI() {
		ImagePanel hospitalListPanel = backgroundPanel("º´¿ø ¸®½ºÆ®");
		hospitalListPanel.setVisible(true);
		
		JLabel areaLocationLabel = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C");
		areaLocationLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		areaLocationLabel.setBounds(44, 85, 156, 29);
		hospitalListPanel.add(areaLocationLabel);
		
		String[] subjects = {"Áø·á°ú¸ñ ¼±ÅÃ", "Ä¡°ú", "¾È°ú", "³»°ú", "ÇÇºÎ°ú", "½Å°æ°ú", "ºñ´¢±â°ú", "»êºÎÀÎ°ú", "Á¤Çü¿Ü°ú", "¼Ò¾ÆÃ»¼Ò³â°ú", "ÀçÈ°ÀÇÇÐ°ú"};
		JComboBox diagnosisComboBox = new JComboBox(subjects);
		diagnosisComboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC9C4\uB8CC\uACFC\uBAA9 \uC804\uCCB4", "\uCE58\uACFC", "\uC548\uACFC", "\uB0B4\uACFC", "\uD53C\uBD80\uACFC", "\uC2E0\uACBD\uACFC", "\uBE44\uB1E8\uAE30\uACFC", "\uC0B0\uBD80\uC778\uACFC", "\uC815\uD615\uC678\uACFC", "\uC18C\uC544\uCCAD\uC18C\uB144\uACFC", "\uC7AC\uD65C\uC758\uD559\uACFC"}));
		diagnosisComboBox.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		diagnosisComboBox.setBounds(393, 126, 124, 23);
		hospitalListPanel.add(diagnosisComboBox);
		
		JLabel locationIconLabel = new JLabel("");
		locationIconLabel.setIcon(new ImageIcon(PATH + "locationIcon.png"));
		locationIconLabel.setBounds(12, 80, 39, 39);
		hospitalListPanel.add(locationIconLabel);
		
		hospitalSearchTextField = new JTextField();
		hospitalSearchTextField.setBounds(77, 118, 228, 39);
		hospitalListPanel.add(hospitalSearchTextField);
		hospitalSearchTextField.setColumns(10);
		
		JButton hospitalSearchButton = new JButton("");
		hospitalSearchButton.setIcon(new ImageIcon(PATH + "searchLocationIcon.png"));
		hospitalSearchButton.setBounds(22, 118, 57, 38);
		hospitalListPanel.add(hospitalSearchButton);
		
		JToggleButton salesToggleButton = new JToggleButton("");
		salesToggleButton.setIcon(new ImageIcon(PATH + "salesToggleButtonLabel.png"));
		salesToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JToggleButton)e.getSource()).isSelected()) {
					salesToggleButton.setIcon(new ImageIcon(PATH + "salesToggleButtonLabel_click.png"));
				} else {
					salesToggleButton.setIcon(new ImageIcon(PATH + "salesToggleButtonLabel.png"));
				}
			}
		});

		salesToggleButton.setBounds(489, 85, 28, 27);
		hospitalListPanel.add(salesToggleButton);
		
		JLabel salesToggleLabel = new JLabel("\uC601\uC5C5\uC911\uB9CC \uBCF4\uC774\uAE30");
		salesToggleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 13));
		salesToggleLabel.setBounds(383, 93, 101, 15);
		hospitalListPanel.add(salesToggleLabel);
		
		JPanel hospitalListTablePanel = whitePanel(hospitalListPanel);
		
		JPanel hospitalInfoPanel_1 = new JPanel();
		hospitalInfoPanel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_1.setBackground(Color.WHITE);
		hospitalInfoPanel_1.setBounds(12, 10, 480, 115);
		hospitalListTablePanel.add(hospitalInfoPanel_1);
		hospitalInfoPanel_1.setLayout(null);
		
		JLabel hospitalNameLabel_1 = new JLabel("\uC624\uC774\uBE48\uD6C4\uACFC\uC758\uC6D0");
		hospitalNameLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		hospitalNameLabel_1.setBounds(12, 10, 230, 35);
		hospitalInfoPanel_1.add(hospitalNameLabel_1);
		
		JLabel hospitalLocationPanel_1 = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC1A1\uC6D0\uB85C 81");
		hospitalLocationPanel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalLocationPanel_1.setBounds(12, 41, 198, 26);
		hospitalInfoPanel_1.add(hospitalLocationPanel_1);
		
		JLabel hospitalSubjectLabel_1 = new JLabel("\uC774\uBE44\uC778\uD6C4\uACFC");
		hospitalSubjectLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalSubjectLabel_1.setBounds(12, 77, 69, 28);
		hospitalInfoPanel_1.add(hospitalSubjectLabel_1);
		
		JLabel hospitalStatusLabel_1 = new JLabel("");
		hospitalStatusLabel_1.setIcon(new ImageIcon(PATH + "openIcon.png"));
		hospitalStatusLabel_1.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_1.add(hospitalStatusLabel_1);
		
		JPanel hospitalInfoPanel_4 = new JPanel();
		hospitalInfoPanel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_4.setBackground(Color.WHITE);
		hospitalInfoPanel_4.setBounds(12, 385, 480, 115);
		hospitalListTablePanel.add(hospitalInfoPanel_4);
		

		
		JButton pagingButton_1 = new JButton("1");
		pagingButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		pagingButton_1.setBounds(136, 506, 45, 45);
		hospitalListTablePanel.add(pagingButton_1);
		
		JButton pagingButton_2 = new JButton("2");
		pagingButton_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		pagingButton_2.setBounds(193, 506, 45, 45);
		hospitalListTablePanel.add(pagingButton_2);
		
		JButton pagingButton_3 = new JButton("3");
		pagingButton_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		pagingButton_3.setBounds(250, 506, 45, 45);
		hospitalListTablePanel.add(pagingButton_3);
		
		JButton pagingButton_4 = new JButton("4");
		pagingButton_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		pagingButton_4.setBounds(307, 506, 45, 45);
		hospitalListTablePanel.add(pagingButton_4);
		
		JPanel hospitalInfoPanel_2 = new JPanel();
		hospitalInfoPanel_2.setLayout(null);
		hospitalInfoPanel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_2.setBackground(Color.WHITE);
		hospitalInfoPanel_2.setBounds(12, 135, 480, 115);
		hospitalListTablePanel.add(hospitalInfoPanel_2);
		
		JLabel hospitalNameLabel_2 = new JLabel("\uC8FC\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		hospitalNameLabel_2.setBounds(12, 10, 230, 35);
		hospitalInfoPanel_2.add(hospitalNameLabel_2);
		
		JLabel hospitalLocationPanel_2 = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC11C\uBD80\uB85C 2112 \uC8FC\uBA54\uB514\uCE7C\uBE4C\uB529 2\uCE35");
		hospitalLocationPanel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalLocationPanel_2.setBounds(12, 41, 310, 26);
		hospitalInfoPanel_2.add(hospitalLocationPanel_2);
		
		JLabel hospitalSubjectLabel_2 = new JLabel("\uB0B4\uACFC");
		hospitalSubjectLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalSubjectLabel_2.setBounds(12, 77, 69, 28);
		hospitalInfoPanel_2.add(hospitalSubjectLabel_2);
		
		JLabel hospitalStatusLabel_2 = new JLabel("");
		hospitalStatusLabel_2.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_2.add(hospitalStatusLabel_2);
		hospitalInfoPanel_4.setLayout(null);
		
		JLabel hospitalLocationPanel_4 = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC11C\uBD80\uB85C 2112 \uC8FC\uBA54\uB514\uCE7C\uBE4C\uB529 2\uCE35");
		hospitalLocationPanel_4.setBounds(12, 39, 285, 17);
		hospitalLocationPanel_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalInfoPanel_4.add(hospitalLocationPanel_4);
		
		JLabel hospitalNameLabel_4 = new JLabel("\uC8FC\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel_4.setBounds(12, 12, 110, 30);
		hospitalNameLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		hospitalInfoPanel_4.add(hospitalNameLabel_4);
		
		JLabel hospitalSubjectLabel_4 = new JLabel("\uB0B4\uACFC");
		hospitalSubjectLabel_4.setBounds(22, 62, 24, 17);
		hospitalSubjectLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalInfoPanel_4.add(hospitalSubjectLabel_4);
		
		JLabel hospitalStatusLabel_4 = new JLabel("");
		hospitalStatusLabel_4.setBounds(457, 21, 0, 0);
		hospitalInfoPanel_4.add(hospitalStatusLabel_4);
		
		JPanel hospitalInfoPanel_3 = new JPanel();
		hospitalInfoPanel_3.setLayout(null);
		hospitalInfoPanel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_3.setBackground(Color.WHITE);
		hospitalInfoPanel_3.setBounds(12, 260, 480, 115);
		hospitalListTablePanel.add(hospitalInfoPanel_3);
		
		JLabel hospitalNameLabel_3 = new JLabel("\uC8FC\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		hospitalNameLabel_3.setBounds(12, 10, 230, 35);
		hospitalInfoPanel_3.add(hospitalNameLabel_3);
		
		JLabel hospitalLocationPanel_3 = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC11C\uBD80\uB85C 2112 \uC8FC\uBA54\uB514\uCE7C\uBE4C\uB529 2\uCE35");
		hospitalLocationPanel_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalLocationPanel_3.setBounds(12, 41, 310, 26);
		hospitalInfoPanel_3.add(hospitalLocationPanel_3);
		
		JLabel hospitalSubjectLabel_3 = new JLabel("\uB0B4\uACFC");
		hospitalSubjectLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalSubjectLabel_3.setBounds(12, 77, 69, 28);
		hospitalInfoPanel_3.add(hospitalSubjectLabel_3);
		
		JLabel hospitalStatusLabel_3 = new JLabel("");
		hospitalStatusLabel_3.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_3.add(hospitalStatusLabel_3);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_3.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(PATH + "closeIcon.png"));
		label_7.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_3.add(label_7);
		
		lowerButton(hospitalListPanel);
	}
	
	// º´¿ø »ó¼¼º¸±â
	void hospitalViewDetailGUI() {
		ImagePanel hospitalinfoPanel = backgroundPanel("º´¿ø »ó¼¼º¸±â");
	
		JPanel hospitalinfoWhitePanel = whitePanel(hospitalinfoPanel);
			
		JLabel hospitalNameLabel = new JLabel("¿¬¼¼³»°úÀÇ¿ø");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		hospitalNameLabel.setBounds(55, 175, 232, 40);
		hospitalinfoPanel.add(hospitalNameLabel);
		
		JButton reservationButton = new JButton("");
		reservationButton.setBounds(363, 175, 119, 40);
		hospitalinfoPanel.add(reservationButton);
		reservationButton.setIcon(new ImageIcon(PATH + "reservationSmallIcon.png"));
		
		JLabel lastVisitLabel = new JLabel("\uCD5C\uADFC \uBC29\uBB38");
		lastVisitLabel.setBounds(20,10,79,35);
		lastVisitLabel.setOpaque(true);
		lastVisitLabel.setBackground(Color.WHITE);
		lastVisitLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		hospitalinfoWhitePanel.add(lastVisitLabel);
		
		JLabel lastVisitDateLabel = new JLabel("2020-11-09");
		lastVisitDateLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		lastVisitDateLabel.setBounds(101, 12, 88, 35);
		hospitalinfoWhitePanel.add(lastVisitDateLabel);
		
		JLabel subjectLabel = new JLabel("³»°ú");
		subjectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subjectLabel.setBounds(20, 60, 65, 35);
		subjectLabel.setOpaque(true);
		subjectLabel.setBackground(SystemColor.menu);
		subjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		hospitalinfoWhitePanel.add(subjectLabel);
		
		JPanel hospitalTimePanel = new JPanel();
		hospitalTimePanel.setBounds(20, 105, 465, 424);
		hospitalTimePanel.setBorder(new LineBorder(Color.gray, 2));
		hospitalTimePanel.setOpaque(true);
		hospitalTimePanel.setBackground(Color.WHITE);
		hospitalinfoWhitePanel.add(hospitalTimePanel);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		hospitalTimePanel.setLayout(null);
		
		JLabel phoneNumberLabel = new JLabel("¿¬¶ôÃ³");
		phoneNumberLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		phoneNumberLabel.setBounds(10, 20, 94, 40);
		hospitalTimePanel.add(phoneNumberLabel);
		
		JLabel phoneNumberInputLabel = new JLabel("010-xxxx-xxxx");
		phoneNumberInputLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		phoneNumberInputLabel.setBounds(116, 20, 195, 40);
		hospitalTimePanel.add(phoneNumberInputLabel);
		
		JLabel addressLabel = new JLabel("ÁÖ¼Ò");
		addressLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		addressLabel.setBounds(10,83, 61, 40);
		hospitalTimePanel.add(addressLabel);
		
		JLabel addressInfo = new JLabel("°æ±âµµ ¼ö¿ø½Ã Àå¾Èµ¿ ¼­ºÎ·Î 2123");
		addressInfo.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		addressInfo.setBounds(116,83, 335, 40);
		hospitalTimePanel.add(addressInfo);
		
		JLabel time = new JLabel("Áø·á ½Ã°£");
		time.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		time.setBounds(10,150, 131, 40);
		hospitalTimePanel.add(time);
		
		JLabel timeInfo = new JLabel("¿ù¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo.setBounds(10, 195, 430, 25);
		hospitalTimePanel.add(timeInfo);
		
		JLabel timeInfo1 = new JLabel("È­¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo1.setBounds(10, 225, 430, 25);
		hospitalTimePanel.add(timeInfo1);
		
		JLabel timeInfo2 = new JLabel("¼ö¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo2.setBounds(10, 255, 430, 25);
		hospitalTimePanel.add(timeInfo2);
		
		JLabel timeInfo3 = new JLabel("¸ñ¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo3.setBounds(10, 285, 430, 25);
		hospitalTimePanel.add(timeInfo3);
		
		JLabel timeInfo4 = new JLabel("±Ý¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo4.setBounds(10, 315, 430, 25);
		hospitalTimePanel.add(timeInfo4);
		
		JLabel timeInfo5 = new JLabel("Åä¿äÀÏ Áø·á½Ã°£ : 09:00~13:00\n");
		timeInfo5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo5.setBounds(10, 345, 430, 25);
		hospitalTimePanel.add(timeInfo5);
		
		JLabel timeInfo6 = new JLabel("ÀÏ¿äÀÏ Áø·á½Ã°£ : Áø·á¾ÈÇÔ\n");
		timeInfo6.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo6.setBounds(10, 375, 430, 25);
		hospitalTimePanel.add(timeInfo6);
		
		lowerButton(hospitalinfoPanel);
	}
	
	// ¿¹¾à Á¢¼ö
	void reservationReceiptGUI() {
		ImagePanel reservationReceiptPanel = backgroundPanel("¿¹¾à Á¢¼ö");
		reservationReceiptPanel.setVisible(true);
		
		
		JLabel hospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		hospitalNameLabel.setBounds(25, 106, 143, 46);
		reservationReceiptPanel.add(hospitalNameLabel);
		
		JButton backListButton = new JButton("");
		backListButton.setIcon(new ImageIcon(PATH + "backListIcon.png"));
		backListButton.setBounds(391, 116, 115, 30);
		reservationReceiptPanel.add(backListButton);
		
		JPanel reservationPanel = whitePanel(reservationReceiptPanel);
		
		JLabel seletedDateLabel = new JLabel("\uB0A0\uC9DC\uB97C \uC120\uD0DD\uD558\uC138\uC694");
		seletedDateLabel.setBounds(12, 24, 159, 36);
		seletedDateLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(seletedDateLabel);
		
		JComboBox selectedYearComboBox = new JComboBox();
		selectedYearComboBox.setBounds(12, 70, 97, 41);
		selectedYearComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedYearComboBox.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021"}));
		reservationPanel.add(selectedYearComboBox);
		
		JComboBox selectedMonthComboBox = new JComboBox();
		selectedMonthComboBox.setBounds(139, 70, 97, 41);
		selectedMonthComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedMonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		reservationPanel.add(selectedMonthComboBox);
		
		JComboBox selectedDayComboBox = new JComboBox();
		selectedDayComboBox.setBounds(265, 70, 97, 41);
		selectedDayComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		reservationPanel.add(selectedDayComboBox);
		
		JLabel seletedTimeLabel = new JLabel("\uC2DC\uAC04\uC744 \uC120\uD0DD\uD558\uC138\uC694");
		seletedTimeLabel.setBounds(12, 141, 159, 36);
		seletedTimeLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(seletedTimeLabel);
		
		JComboBox selectedTimeComboBox = new JComboBox();
		selectedTimeComboBox.setBounds(12, 187, 205, 41);
		selectedTimeComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedTimeComboBox.setModel(new DefaultComboBoxModel(new String[] {"10:00", "10:30", "11:00"}));
		reservationPanel.add(selectedTimeComboBox);
		
		JLabel selectedSubjectLabel = new JLabel("\uC9C4\uB8CC\uACFC\uBAA9\uC744 \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		selectedSubjectLabel.setBounds(12, 264, 224, 36);
		selectedSubjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(selectedSubjectLabel);
		
		JComboBox selectedSubjectComboBox = new JComboBox();
		selectedSubjectComboBox.setBounds(12, 310, 205, 41);
		selectedSubjectComboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB0B4\uACFC"}));
		selectedSubjectComboBox.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 19));
		reservationPanel.add(selectedSubjectComboBox);
		
		JComboBox selectedYearSymptomComboBox = new JComboBox();
		selectedYearSymptomComboBox.setBounds(12, 432, 97, 41);
		selectedYearSymptomComboBox.setModel(new DefaultComboBoxModel(new String[] {"2020"}));
		selectedYearSymptomComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationPanel.add(selectedYearSymptomComboBox);
		
		JComboBox selectedMonthSymptomComboBox = new JComboBox();
		selectedMonthSymptomComboBox.setBounds(139, 432, 97, 41);
		selectedMonthSymptomComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		selectedMonthSymptomComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationPanel.add(selectedMonthSymptomComboBox);
		
		JComboBox selectedDaySymptomComboBox = new JComboBox();
		selectedDaySymptomComboBox.setBounds(265, 432, 97, 41);
		selectedDaySymptomComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		selectedDaySymptomComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationPanel.add(selectedDaySymptomComboBox);
		
		JLabel selectedSymptomLabel = new JLabel("\uC99D\uC0C1\uC774 \uC5B8\uC81C\uBD80\uD130 \uB098\uD0C0\uB0AC\uB098\uC694");
		selectedSymptomLabel.setBounds(12, 390, 241, 36);
		selectedSymptomLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(selectedSymptomLabel);
		
		JButton reservationButton = new JButton("");
		reservationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reservationButton.setIcon(new ImageIcon(PATH + "reservationIcon.png"));
		reservationButton.setBounds(12, 501, 481, 46);
		reservationPanel.add(reservationButton);
		
		lowerButton(reservationReceiptPanel);
	}
	
	//ÀÚ°¡Áø´Ü
	void selfDiagnosisGUI() {
		ImagePanel selfDiagnosisPanel = backgroundPanel("ÀÚ°¡ Áø´Ü");
		selfDiagnosisPanel.setVisible(true);
		
		JPanel selfDiagnosisWhitePanel = whitePanel(selfDiagnosisPanel);
		
		JLabel hospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		hospitalNameLabel.setBounds(25, 106, 143, 46);
		selfDiagnosisPanel.add(hospitalNameLabel);
		
		JLabel subjectLabel = new JLabel("\uB0B4\uACFC");
		subjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		subjectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subjectLabel.setBounds(176, 175, 178, 38);
		selfDiagnosisPanel.add(subjectLabel);
		
		JToggleButton selfCheckPartOneButton_1 = new JToggleButton("");
		selfCheckPartOneButton_1.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_1.setBounds(34, 69, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_1);
		
		JToggleButton selfCheckPartOneButton_2 = new JToggleButton("");
		selfCheckPartOneButton_2.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_2.setBounds(193, 69, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_2);
		
		JToggleButton selfCheckPartOneButton_3 = new JToggleButton("");
		selfCheckPartOneButton_3.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_3.setBounds(349, 69, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_3);
		
		JToggleButton selfCheckPartOneButton_5 = new JToggleButton("");
		selfCheckPartOneButton_5.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_5.setBounds(193, 145, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_5);
		
		JToggleButton selfCheckPartOneButton_4 = new JToggleButton("");
		selfCheckPartOneButton_4.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_4.setBounds(34, 145, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_4);
		
		JToggleButton selfCheckPartOneButton_6 = new JToggleButton("");
		selfCheckPartOneButton_6.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_6.setBounds(349, 145, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_6);
		
		JToggleButton selfCheckPartOneButton_8 = new JToggleButton("");
		selfCheckPartOneButton_8.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_8.setBounds(193, 223, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_8);
		
		JToggleButton selfCheckPartOneButton_7 = new JToggleButton("");
		selfCheckPartOneButton_7.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_7.setBounds(34, 223, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_7);
		
		JToggleButton selfCheckPartOneButton_9 = new JToggleButton("");
		selfCheckPartOneButton_9.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_9.setBounds(349, 223, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_9);
		
		JToggleButton selfCheckPartTwoButton_2 = new JToggleButton("");
		selfCheckPartTwoButton_2.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_2.setBounds(193, 346, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_2);
		
		JToggleButton selfCheckPartTwoButton_1 = new JToggleButton("");
		selfCheckPartTwoButton_1.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_1.setBounds(34, 346, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_1);
		
		JToggleButton selfCheckPartTwoButton_3 = new JToggleButton("");
		selfCheckPartTwoButton_3.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_3.setBounds(349, 346, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_3);
		
		JToggleButton selfCheckPartTwoButton_5 = new JToggleButton("");
		selfCheckPartTwoButton_5.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_5.setBounds(193, 426, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_5);
		
		JToggleButton selfCheckPartTwoButton_4 = new JToggleButton("");
		selfCheckPartTwoButton_4.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_4.setBounds(34, 426, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_4);
		
		JToggleButton selfCheckPartTwoButton_6 = new JToggleButton("");
		selfCheckPartTwoButton_6.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_6.setBounds(349, 426, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_6);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\submitButton.png"));
		btnNewButton_1.setBounds(34, 506, 437, 41);
		selfDiagnosisWhitePanel.add(btnNewButton_1);
		
		JLabel selfCategoryLabel_1 = new JLabel("\uC18C\uD654\uAE30");
		selfCategoryLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		selfCategoryLabel_1.setBounds(34, 27, 70, 32);
		selfDiagnosisWhitePanel.add(selfCategoryLabel_1);
		
		JLabel selfCategoryLabel_2 = new JLabel("\uC18C\uD654\uAE30");
		selfCategoryLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		selfCategoryLabel_2.setBounds(34, 304, 70, 32);
		selfDiagnosisWhitePanel.add(selfCategoryLabel_2);
		lowerButton(selfDiagnosisPanel);
	}
	
	// ¿¹¾à ¸ñ·Ï
	void reservationListGUI() {
		ImagePanel reservationListPanel = backgroundPanel("¿¹¾à ¸ñ·Ï");
		reservationListPanel.setVisible(true);
		
		JPanel reservationListWhitePanel = whitePanel(reservationListPanel);
		
		JLabel reservationList = new JLabel("\uC608\uC57D \uD604\uD669");
		reservationList.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		reservationList.setBounds(23, 27, 96, 40);
		reservationListWhitePanel.add(reservationList);
		
		JLabel patientIdLabel = new JLabel("arinlove");
		patientIdLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		patientIdLabel.setBounds(24, 108, 142, 46);
		reservationListPanel.add(patientIdLabel);
		
		JLabel patientIdDesLabel = new JLabel("\uB2D8\uC758 \uC608\uC57D \uBAA9\uB85D\uC785\uB2C8\uB2E4");
		patientIdDesLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		patientIdDesLabel.setBounds(169, 108, 301, 46);
		reservationListPanel.add(patientIdDesLabel);
		
		JPanel reservationStatusPanel_1 = new JPanel();
		reservationStatusPanel_1.setBounds(23, 69, 457, 109);
		reservationListWhitePanel.add(reservationStatusPanel_1);
		reservationStatusPanel_1.setLayout(null);
		
		JLabel hospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 19));
		hospitalNameLabel.setBounds(12, 10, 142, 35);
		reservationStatusPanel_1.add(hospitalNameLabel);
		
		JLabel hospitalLocationLabel = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC1A1\uC6D0\uB85C 81");
		hospitalLocationLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 11));
		hospitalLocationLabel.setBounds(12, 45, 196, 26);
		reservationStatusPanel_1.add(hospitalLocationLabel);
		
		JLabel hospistalSubjectLabel = new JLabel("\uB0B4\uACFC");
		hospistalSubjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 11));
		hospistalSubjectLabel.setBounds(12, 81, 87, 18);
		reservationStatusPanel_1.add(hospistalSubjectLabel);
		
		JLabel reservationDateLabel = new JLabel("2020-11-16");
		reservationDateLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		reservationDateLabel.setBounds(335, 73, 70, 26);
		reservationStatusPanel_1.add(reservationDateLabel);
		
		JLabel reservationTimeLabel = new JLabel("11:00");
		reservationTimeLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		reservationTimeLabel.setBounds(404, 73, 41, 26);
		reservationStatusPanel_1.add(reservationTimeLabel);
		lowerButton(reservationListPanel);
	}
	
	// ¿¹¾à Á¤º¸
	void reservationInformationGUI() {
		ImagePanel reservationInfomationPanel = backgroundPanel("¿¹¾à Á¤º¸");
		reservationInfomationPanel.setVisible(true);
		
		JPanel reservationInfomationWhitePanel = whitePanel(reservationInfomationPanel);
		
		JLabel reservationHospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		reservationHospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		reservationHospitalNameLabel.setBounds(68, 112, 189, 46);
		reservationInfomationPanel.add(reservationHospitalNameLabel);
		
		JLabel reservationDateLabel = new JLabel("2020-11-16");
		reservationDateLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		reservationDateLabel.setBounds(287, 112, 106, 46);
		reservationInfomationPanel.add(reservationDateLabel);
		
		JLabel reservationTimeLabel = new JLabel("11:00");
		reservationTimeLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		reservationTimeLabel.setBounds(394, 112, 63, 46);
		reservationInfomationPanel.add(reservationTimeLabel);
		
		JLabel contactTitleLabel = new JLabel("\uC5F0\uB77D\uCC98");
		contactTitleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 27));
		contactTitleLabel.setBounds(24, 45, 93, 47);
		reservationInfomationWhitePanel.add(contactTitleLabel);
		
		JLabel addressTitleLabel = new JLabel("\uC8FC\uC18C");
		addressTitleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 27));
		addressTitleLabel.setBounds(24, 135, 93, 47);
		reservationInfomationWhitePanel.add(addressTitleLabel);
		
		JLabel inputPhoneNumberLabel = new JLabel("010-7242-6652");
		inputPhoneNumberLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		inputPhoneNumberLabel.setBounds(121, 50, 197, 47);
		reservationInfomationWhitePanel.add(inputPhoneNumberLabel);
		
		JLabel inputAddressLabel = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC11C\uBD80\uB85C 2123");
		inputAddressLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 19));
		inputAddressLabel.setBounds(121, 139, 372, 47);
		reservationInfomationWhitePanel.add(inputAddressLabel);
		lowerButton(reservationInfomationPanel);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		loginGUI();
//		signUpGUI();
//		patientInformationGUI();
//		passwordChangeGUI();
//		hospitalListGUI();
		hospitalViewDetailGUI();
//		selfDiagnosisGUI();
//		reservationReceiptGUI();
//		reservationInformationGUI();
//		reservationListGUI();

	}
	
	////////////////method//////////////////////
	void lowerButton(JPanel jPanel) {
		JButton hospitalLowerButton = new JButton("");
		hospitalLowerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		hospitalLowerButton.setIcon(new ImageIcon(PATH + "loginHospitalButton.png"));
		hospitalLowerButton.setBounds(0, 787, 176, 92);
		jPanel.add(hospitalLowerButton);
		
		JButton reservationLowerButton = new JButton("\"new Button\"");
		reservationLowerButton.setIcon(new ImageIcon(PATH + "loginReservationButton.png"));
		reservationLowerButton.setBounds(176, 787, 178, 92);
		jPanel.add(reservationLowerButton);
		
		JButton informationLowerButton = new JButton("\"new Button\"");
		informationLowerButton.setIcon(new ImageIcon(PATH + "loginInformationButton1.png"));
		informationLowerButton.setBounds(354, 787, 176, 92);
		jPanel.add(informationLowerButton);
	}
	
	ImagePanel backgroundPanel(String title) {
		ImagePanel backgroundPanel = new ImagePanel(new ImageIcon(PATH + "login_background.png").getImage());
		backgroundPanel.setBounds(0, 0, 540, 879);
		frame.setSize(backgroundPanel.getWidth() + 16, backgroundPanel.getHeight());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(backgroundPanel);
		frame.setLocationRelativeTo(null);
		backgroundPanel.setLayout(null);
		
		JLabel titleLabel = new JLabel(title);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 33));
		titleLabel.setBounds(157, 29, 224, 46);
		backgroundPanel.add(titleLabel);
		
		JLabel titleSmallLabel = new JLabel("\uAC70\uAE34\uC5B4\uB54C");
		titleSmallLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		titleSmallLabel.setBounds(12, 10, 57, 15);
		backgroundPanel.add(titleSmallLabel);

		return backgroundPanel;
	}
	
	JPanel whitePanel (JPanel mainPanel) {
		JPanel whitePanel = new JPanel();
		whitePanel.setBackground(Color.WHITE);
		whitePanel.setForeground(Color.BLACK);
		whitePanel.setBounds(12, 221, 505, 557);
		mainPanel.add(whitePanel);
		whitePanel.setLayout(null);
		
		return whitePanel;
	}
}

class ImagePanel extends JPanel {
	private Image img;
	
	public ImagePanel (Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	
	public int getHeight() {
		return img.getHeight(null);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
