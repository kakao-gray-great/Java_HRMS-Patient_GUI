package gui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReservationInformation {
	private BackgroundPanel backgroundPanel;
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	private String id;
	
	public ReservationInformation(BackgroundPanel backgroundPanel, String id) {
		this.backgroundPanel = backgroundPanel;
		this.id = id;
	}
	
	void reservationInformationGUI() {
		
		ImagePanel reservationInfomationPanel = backgroundPanel.background("øπæ‡¡§∫∏");
		reservationInfomationPanel.setVisible(true);
		
		whitePanel = new WhitePanel();
		JPanel reservationInfomationWhitePanel = whitePanel.whiteBackGround(reservationInfomationPanel);
		
		JLabel reservationHospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		reservationHospitalNameLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 23));
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
		contactTitleLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 27));
		contactTitleLabel.setBounds(24, 45, 93, 47);
		reservationInfomationWhitePanel.add(contactTitleLabel);
		
		JLabel addressTitleLabel = new JLabel("\uC8FC\uC18C");
		addressTitleLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 27));
		addressTitleLabel.setBounds(24, 135, 93, 47);
		reservationInfomationWhitePanel.add(addressTitleLabel);
		
		JLabel inputPhoneNumberLabel = new JLabel("010-7242-6652");
		inputPhoneNumberLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		inputPhoneNumberLabel.setBounds(121, 50, 197, 47);
		reservationInfomationWhitePanel.add(inputPhoneNumberLabel);
		
		JLabel inputAddressLabel = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC11C\uBD80\uB85C 2123");
		inputAddressLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 19));
		inputAddressLabel.setBounds(121, 139, 372, 47);
		reservationInfomationWhitePanel.add(inputAddressLabel);
		
		lowerButton = new LowerButton(backgroundPanel);
		lowerButton.buttons(reservationInfomationPanel, id);
	}
}
