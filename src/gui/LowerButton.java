package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LowerButton {
	String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\";
	
	void buttons(ImagePanel imagePanel) {
		JButton hospitalLowerButton = new JButton("");
		hospitalLowerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		hospitalLowerButton.setIcon(new ImageIcon(PATH + "loginHospitalButton.png"));
		hospitalLowerButton.setBounds(0, 787, 176, 92);
		imagePanel.add(hospitalLowerButton);
		
		JButton reservationLowerButton = new JButton("\"new Button\"");
		reservationLowerButton.setIcon(new ImageIcon(PATH + "loginReservationButton.png"));
		reservationLowerButton.setBounds(176, 787, 178, 92);
		imagePanel.add(reservationLowerButton);
		
		JButton informationLowerButton = new JButton("\"new Button\"");
		informationLowerButton.setIcon(new ImageIcon(PATH + "loginInformationButton1.png"));
		informationLowerButton.setBounds(354, 787, 176, 92);
		imagePanel.add(informationLowerButton);
	}
}

