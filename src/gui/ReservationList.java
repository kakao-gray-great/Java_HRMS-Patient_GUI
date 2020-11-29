package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ReservationList {
	private static final ImageIcon bookingIcon = new ImageIcon(PatientApplication.PATH + "booking.png");
	private static final ImageIcon cancelIcon = new ImageIcon(PatientApplication.PATH + "cancel.png");
	private static final ImageIcon completeIcon = new ImageIcon(PatientApplication.PATH + "complete.png");
	private BackgroundPanel backgroundPanel;
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	private String id;
	private ImagePanel reservationListPanel;
	public ReservationList(BackgroundPanel backgroundPanel, String id) {
		// TODO Auto-generated constructor stub
		this.backgroundPanel = backgroundPanel;
		this.id = id;
	}

	void reservationListGUI() {
		reservationListPanel = backgroundPanel.background("¿¹¾à ¸ñ·Ï");
		reservationListPanel.setVisible(true);
		
		whitePanel = new WhitePanel();
		JPanel reservationListWhitePanel = whitePanel.whiteBackGround(reservationListPanel);
		
		JLabel patientIdLabel = new JLabel("arinlove");
		patientIdLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 27));
		patientIdLabel.setBounds(24, 108, 142, 46);
		reservationListPanel.add(patientIdLabel);
		
		JLabel patientIdDesLabel = new JLabel("\uB2D8\uC758 \uC608\uC57D \uBAA9\uB85D\uC785\uB2C8\uB2E4");
		patientIdDesLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		patientIdDesLabel.setBounds(169, 108, 301, 46);
		reservationListPanel.add(patientIdDesLabel);
		
		JPanel reservationInfomationLabel_1 = new JPanel();
		reservationInfomationLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		reservationInfomationLabel_1.setBackground(Color.WHITE);
		reservationInfomationLabel_1.setBounds(12, 10, 480, 115);
		reservationListWhitePanel.add(reservationInfomationLabel_1);
		reservationInfomationLabel_1.setLayout(null);
		
		reservationPanelContent(reservationListPanel, reservationInfomationLabel_1, "¼ö¿øº´¿ø", "°æ±âµµ ¼ö¿ø½Ã Àå¾È±¸ ¿¬¹«µ¿", "³»°ú", completeIcon);
		
		lowerButton = new LowerButton(backgroundPanel);
		lowerButton.buttons(reservationListPanel, id);
	}
	
	private void reservationPanelContent(JPanel mainPanel, JPanel panel, String hospitalName, String hospitalAddress, String subject, ImageIcon statusIcon) {
		JLabel hospitalNameLabel = new JLabel(hospitalName);
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		hospitalNameLabel.setBounds(12, 10, 230, 35);
		panel.add(hospitalNameLabel);
		
		JLabel hospitalLocationPanel = new JLabel(hospitalAddress);
		hospitalLocationPanel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalLocationPanel.setBounds(12, 41, 198, 26);
		panel.add(hospitalLocationPanel);
		
		JLabel hospitalSubjectLabel = new JLabel(subject);
		hospitalSubjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalSubjectLabel.setBounds(12, 77, 69, 28);
		panel.add(hospitalSubjectLabel);
		
		JLabel hospitalStatusLabel = new JLabel("");
		hospitalStatusLabel.setIcon(statusIcon);
		hospitalStatusLabel.setBounds(406, 0, 73, 114);
		panel.add(hospitalStatusLabel);
		
		selectedHospital(mainPanel, backgroundPanel);
	}
	
	private void selectedHospital(JPanel reservationPanel, BackgroundPanel backgroundPanel) {
		reservationPanel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				reservationListPanel.setVisible(false);

				HospitalViewDetail hospitalViewDetail = new HospitalViewDetail(backgroundPanel, id);
				hospitalViewDetail.hospitalViewDetailGUI();
		    }
		});
	}
}
