package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class PasswordChange {
	private BackgroundPanel backgroundPanel;
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	private String id;
	
	public PasswordChange(BackgroundPanel backgroundPanel, String id) {
		this.backgroundPanel = backgroundPanel;
		this.id = id;
	}

	void passwordChangeGUI() {
		ImagePanel passwordChangePanel = backgroundPanel.background("ºñ¹Ð¹øÈ£º¯°æ");
		passwordChangePanel.setVisible(true);

		whitePanel = new WhitePanel();
		JPanel passwordChangeWhitePanel = whitePanel.whiteBackGround(passwordChangePanel);
		
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
		
		lowerButton = new LowerButton(backgroundPanel);
		lowerButton.buttons(passwordChangePanel, id);
	}
}
