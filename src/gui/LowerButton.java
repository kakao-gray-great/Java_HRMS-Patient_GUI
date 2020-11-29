package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LowerButton {
	private String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\";
	private BackgroundPanel backgroundPanel;
	
	
	public LowerButton(BackgroundPanel backgroundPanel) {
		this.backgroundPanel = backgroundPanel;
	}


	void buttons(ImagePanel imagePanel, String id) {
		JButton hospitalLowerButton = new JButton("");
		hospitalLowerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		hospitalLowerButton.setIcon(new ImageIcon(PATH + "loginHospitalButton.png"));
		hospitalLowerButton.setBounds(0, 787, 176, 92);
		hospitalLowerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				imagePanel.setVisible(false);
				HospitalList hospitalList = new HospitalList(backgroundPanel, id);
				hospitalList.hospitalListGUI();
			}
		});
		imagePanel.add(hospitalLowerButton);

		JButton reservationLowerButton = new JButton("\"new Button\"");
		reservationLowerButton.setIcon(new ImageIcon(PATH + "loginReservationButton.png"));
		reservationLowerButton.setBounds(176, 787, 178, 92);
		reservationLowerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				imagePanel.setVisible(false);
				ReservationList reservationList = new ReservationList(backgroundPanel, id);
				reservationList.reservationListGUI();
			}
		});
		imagePanel.add(reservationLowerButton);

		JButton informationLowerButton = new JButton("\"new Button\"");
		informationLowerButton.setIcon(new ImageIcon(PATH + "loginInformationButton1.png"));
		informationLowerButton.setBounds(354, 787, 176, 92);
		informationLowerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				imagePanel.setVisible(false);
				PatientInformation patienInformation = new PatientInformation(backgroundPanel, id);
				patienInformation.patientInformationPanelGUI();
			}
		});
		imagePanel.add(informationLowerButton);
	}
}
