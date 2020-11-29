package gui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReservationList {
	private BackgroundPanel backgroundPanel;
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	private String id;
	
	public ReservationList(BackgroundPanel backgroundPanel, String id) {
		// TODO Auto-generated constructor stub
		this.backgroundPanel = backgroundPanel;
		this.id = id;
	}

	void reservationListGUI() {
		ImagePanel reservationListPanel = backgroundPanel.background("¿¹¾à¸ñ·Ï");
		reservationListPanel.setVisible(true);
		
		whitePanel = new WhitePanel();
		JPanel reservationListWhitePanel = whitePanel.whiteBackGround(reservationListPanel);
		
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
		
		lowerButton = new LowerButton(backgroundPanel);
		lowerButton.buttons(reservationListPanel, id);
	}
}
