package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class ReservationReceipt {
	private BackgroundPanel backgroundPanel;
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	private String id;
	
	public ReservationReceipt(BackgroundPanel backgroundPanel, String id) {
		this.backgroundPanel = backgroundPanel;
		this.id = id;
	}

	void reservationReceiptGUI() {
		ImagePanel reservationReceiptPanel = backgroundPanel.background("¿¹¾à Á¢¼ö");
		reservationReceiptPanel.setVisible(true);
		
		JLabel hospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		hospitalNameLabel.setBounds(25, 106, 143, 46);
		reservationReceiptPanel.add(hospitalNameLabel);
		
		JButton backListButton = new JButton("");
		backListButton.setIcon(new ImageIcon(PatientApplication.PATH + "backListIcon.png"));
		backListButton.setBounds(391, 116, 115, 30);
		reservationReceiptPanel.add(backListButton);
		
		whitePanel = new WhitePanel();
		JPanel reservationPanel = whitePanel.whiteBackGround(reservationReceiptPanel);
		
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
		selectedMonthComboBox.setBounds(140, 70, 97, 41);
		selectedMonthComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedMonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		reservationPanel.add(selectedMonthComboBox);
		
		JComboBox selectedDayComboBox = new JComboBox();
		selectedDayComboBox.setBounds(269, 70, 97, 41);
		selectedDayComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		reservationPanel.add(selectedDayComboBox);
		
		JComboBox selectedTimeComboBox = new JComboBox();
		selectedTimeComboBox.setBounds(396, 70, 97, 41);
		selectedTimeComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedTimeComboBox.setModel(new DefaultComboBoxModel(new String[] {"10:00", "10:30", "11:00"}));
		reservationPanel.add(selectedTimeComboBox);
		
		JLabel selectedSubjectLabel = new JLabel("\uC9C4\uB8CC\uACFC\uBAA9\uC744 \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		selectedSubjectLabel.setBounds(12, 154, 224, 36);
		selectedSubjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(selectedSubjectLabel);
		
		JComboBox selectedSubjectComboBox = new JComboBox();
		selectedSubjectComboBox.setBounds(12, 200, 205, 41);
		selectedSubjectComboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB0B4\uACFC"}));
		selectedSubjectComboBox.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 19));
		reservationPanel.add(selectedSubjectComboBox);
		
		JLabel selectedSymptomLabel = new JLabel("\uC99D\uC0C1\uC744 \uCCB4\uD06C\uD574\uC8FC\uC138\uC694.");
		selectedSymptomLabel.setBounds(12, 288, 185, 36);
		selectedSymptomLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(selectedSymptomLabel);
		
		JToggleButton selectSymptomToggleButton_1 = new JToggleButton("");
		selectSymptomToggleButton_1.setBackground(new Color(102, 102, 102));
		selectSymptomToggleButton_1.setBounds(35, 332, 122, 52);
		reservationPanel.add(selectSymptomToggleButton_1);
		
		JToggleButton selectSymptomToggleButton_2 = new JToggleButton("");
		selectSymptomToggleButton_2.setBackground(new Color(102, 102, 102));
		selectSymptomToggleButton_2.setBounds(194, 332, 122, 52);
		reservationPanel.add(selectSymptomToggleButton_2);
		
		JToggleButton selectSymptomToggleButton_3 = new JToggleButton("");
		selectSymptomToggleButton_3.setBackground(new Color(102, 102, 102));
		selectSymptomToggleButton_3.setBounds(350, 332, 122, 52);
		reservationPanel.add(selectSymptomToggleButton_3);
		
		JToggleButton selectSymptomToggleButton_6 = new JToggleButton("");
		selectSymptomToggleButton_6.setBackground(new Color(102, 102, 102));
		selectSymptomToggleButton_6.setBounds(350, 412, 122, 52);
		reservationPanel.add(selectSymptomToggleButton_6);
		
		JToggleButton selectSymptomToggleButton_5 = new JToggleButton("");
		selectSymptomToggleButton_5.setBackground(new Color(102, 102, 102));
		selectSymptomToggleButton_5.setBounds(194, 412, 122, 52);
		reservationPanel.add(selectSymptomToggleButton_5);
		
		JToggleButton selectSymptomToggleButton_4 = new JToggleButton("");
		selectSymptomToggleButton_4.setBackground(new Color(102, 102, 102));
		selectSymptomToggleButton_4.setBounds(35, 412, 122, 52);
		reservationPanel.add(selectSymptomToggleButton_4);
		
		JButton reservationButton = new JButton("");
		reservationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**µ¥ÀÌÅÍ Àü¼Û**/
				reservationReceiptPanel.setVisible(false);
				ReservationInformation reservationInformation = new ReservationInformation(backgroundPanel, id);
				reservationInformation.reservationInformationGUI();
			}
		});
		reservationButton.setIcon(new ImageIcon(PatientApplication.PATH + "reservationIcon.png"));
		reservationButton.setBounds(12, 501, 481, 46);
		reservationPanel.add(reservationButton);
		
		
		lowerButton = new LowerButton(backgroundPanel);
		lowerButton.buttons(reservationReceiptPanel, id);
	}
}
