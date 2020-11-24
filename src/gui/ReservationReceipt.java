package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReservationReceipt {
	private static String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\";
	private BackgroundPanel backgroundPanel;
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	
	void reservationReceiptGUI() {
		backgroundPanel = new BackgroundPanel();
		ImagePanel reservationReceiptPanel = backgroundPanel.background("¿¹¾à Á¢¼ö");
		reservationReceiptPanel.setVisible(true);
		
		JLabel hospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		hospitalNameLabel.setBounds(25, 106, 143, 46);
		reservationReceiptPanel.add(hospitalNameLabel);
		
		JButton backListButton = new JButton("");
		backListButton.setIcon(new ImageIcon(PATH + "backListIcon.png"));
		backListButton.setBounds(391, 116, 115, 30);
		reservationReceiptPanel.add(backListButton);
		
		whitePanel = new WhitePanel();
		JPanel reservationReceiptWhitePanel = whitePanel.whiteBackGround(reservationReceiptPanel);
		
		JLabel seletedDateLabel = new JLabel("\uB0A0\uC9DC\uB97C \uC120\uD0DD\uD558\uC138\uC694");
		seletedDateLabel.setBounds(12, 24, 159, 36);
		seletedDateLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationReceiptWhitePanel.add(seletedDateLabel);
		
		JComboBox selectedYearComboBox = new JComboBox();
		selectedYearComboBox.setBounds(12, 70, 97, 41);
		selectedYearComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedYearComboBox.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021"}));
		reservationReceiptWhitePanel.add(selectedYearComboBox);
		
		JComboBox selectedMonthComboBox = new JComboBox();
		selectedMonthComboBox.setBounds(139, 70, 97, 41);
		selectedMonthComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedMonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		reservationReceiptWhitePanel.add(selectedMonthComboBox);
		
		JComboBox selectedDayComboBox = new JComboBox();
		selectedDayComboBox.setBounds(265, 70, 97, 41);
		selectedDayComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		reservationReceiptWhitePanel.add(selectedDayComboBox);
		
		JLabel seletedTimeLabel = new JLabel("\uC2DC\uAC04\uC744 \uC120\uD0DD\uD558\uC138\uC694");
		seletedTimeLabel.setBounds(12, 141, 159, 36);
		seletedTimeLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationReceiptWhitePanel.add(seletedTimeLabel);
		
		JComboBox selectedTimeComboBox = new JComboBox();
		selectedTimeComboBox.setBounds(12, 187, 205, 41);
		selectedTimeComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedTimeComboBox.setModel(new DefaultComboBoxModel(new String[] {"10:00", "10:30", "11:00"}));
		reservationReceiptWhitePanel.add(selectedTimeComboBox);
		
		JLabel selectedSubjectLabel = new JLabel("\uC9C4\uB8CC\uACFC\uBAA9\uC744 \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		selectedSubjectLabel.setBounds(12, 264, 224, 36);
		selectedSubjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationReceiptWhitePanel.add(selectedSubjectLabel);
		
		JComboBox selectedSubjectComboBox = new JComboBox();
		selectedSubjectComboBox.setBounds(12, 310, 205, 41);
		selectedSubjectComboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB0B4\uACFC"}));
		selectedSubjectComboBox.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 19));
		reservationReceiptWhitePanel.add(selectedSubjectComboBox);
		
		JComboBox selectedYearSymptomComboBox = new JComboBox();
		selectedYearSymptomComboBox.setBounds(12, 432, 97, 41);
		selectedYearSymptomComboBox.setModel(new DefaultComboBoxModel(new String[] {"2020"}));
		selectedYearSymptomComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationReceiptWhitePanel.add(selectedYearSymptomComboBox);
		
		JComboBox selectedMonthSymptomComboBox = new JComboBox();
		selectedMonthSymptomComboBox.setBounds(139, 432, 97, 41);
		selectedMonthSymptomComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		selectedMonthSymptomComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationReceiptWhitePanel.add(selectedMonthSymptomComboBox);
		
		JComboBox selectedDaySymptomComboBox = new JComboBox();
		selectedDaySymptomComboBox.setBounds(265, 432, 97, 41);
		selectedDaySymptomComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		selectedDaySymptomComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationReceiptWhitePanel.add(selectedDaySymptomComboBox);
		
		JLabel selectedSymptomLabel = new JLabel("\uC99D\uC0C1\uC774 \uC5B8\uC81C\uBD80\uD130 \uB098\uD0C0\uB0AC\uB098\uC694");
		selectedSymptomLabel.setBounds(12, 390, 241, 36);
		selectedSymptomLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationReceiptWhitePanel.add(selectedSymptomLabel);
		
		JButton reservationButton = new JButton("");
		reservationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reservationButton.setIcon(new ImageIcon(PATH + "reservationIcon.png"));
		reservationButton.setBounds(12, 501, 481, 46);
		
		reservationReceiptWhitePanel.add(reservationButton);
		
		lowerButton = new LowerButton();
		lowerButton.buttons(reservationReceiptPanel);
	}
	
	public static void main(String[] args) {
		ReservationReceipt reservationReceipt = new ReservationReceipt();
		reservationReceipt.reservationReceiptGUI();
	}
}
