package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PatientInformation {
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	private String patientName = "";
	
	public PatientInformation(String patientName) {
		this.patientName = patientName;
	}
	
	public void patientInformationPanelGUI(BackgroundPanel backgroundPanel) {
		ImagePanel patientInformationPanel = backgroundPanel.background("∞≥¿Œ¡§∫∏");
		patientInformationPanel.setVisible(true);
		
		whitePanel = new WhitePanel();
		JPanel patientInformationWhitePanel = whitePanel.whiteBackGround(patientInformationPanel);
		
		JLabel patientIdLabel = new JLabel(patientName);
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
		informationNameLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 27));
		informationNameLabel.setBounds(22, 34, 63, 47);
		patientInfomationSmallPanel.add(informationNameLabel);
		
		JLabel informationPhoneNumberLabel = new JLabel("\uC804\uD654\uBC88\uD638");
		informationPhoneNumberLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 27));
		informationPhoneNumberLabel.setBounds(22, 140, 123, 47);
		patientInfomationSmallPanel.add(informationPhoneNumberLabel);
		
		JLabel informationNameInputLabel = new JLabel("\uCD5C\uC544\uB9B0");
		informationNameInputLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 21));
		informationNameInputLabel.setBounds(61, 91, 72, 39);
		patientInfomationSmallPanel.add(informationNameInputLabel);
		
		JLabel informationPhoneNumberInputLabel = new JLabel("010-1234-5678");
		informationPhoneNumberInputLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 21));
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
		btnNewButton.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 23));
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
		button.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 23));
		button.setBounds(12, 113, 261, 49);
		patientInformationUpdatePanel.add(button);
		
		lowerButton = new LowerButton();
		lowerButton.buttons(patientInformationPanel);
	}

}
