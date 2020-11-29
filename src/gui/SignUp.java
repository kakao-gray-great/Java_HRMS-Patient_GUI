package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp {
	private LowerButton lowerButton;
	
	void signUpGUI(BackgroundPanel backgroundPanel) {
		ImagePanel signupPanel = backgroundPanel.background("È¸¿ø°¡ÀÔ");
		signupPanel.setVisible(true);
		
		JPanel backGround = new JPanel();
		backGround.setBounds(12, 240, 505, 535);
		signupPanel.add(backGround);
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
		cancel.setIcon(new ImageIcon(PatientApplication.PATH + "cancelIcon.png"));
		cancel.setForeground(Color.BLACK);
		cancel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		cancel.setBounds(40, 485, 162, 42);
		backGround.add(cancel);
		
		JButton signin = new JButton("");
		signin.setIcon(new ImageIcon(PatientApplication.PATH + "signupIcon.png"));
		signin.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		signin.setBounds(278, 485, 162, 42);
		backGround.add(signin);
		
		backGround.add(ID);
		
		lowerButton = new LowerButton(backgroundPanel);
		lowerButton.buttons(signupPanel, "");
	}
	
}
