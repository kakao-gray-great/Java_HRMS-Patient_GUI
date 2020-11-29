package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class HospitalViewDetail {
	private static String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\";
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	private BackgroundPanel backgroundPanel;
	private String id;
	
	public HospitalViewDetail(BackgroundPanel backgroundPanel, String id) {
		this.backgroundPanel = backgroundPanel;
		this.id = id;
	}
	
	void hospitalViewDetailGUI() {
		ImagePanel hospitalViewDetailPanel = backgroundPanel.background("º´¿ø »ó¼¼º¸±â");
		hospitalViewDetailPanel.setVisible(true);

		whitePanel = new WhitePanel();
		JPanel hospitalViewDetailWhitePanel = whitePanel.whiteBackGround(hospitalViewDetailPanel);
		
		JLabel hospitalNameLabel = new JLabel("¿¬¼¼³»°úÀÇ¿ø");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		hospitalNameLabel.setBounds(55, 175, 232, 40);
		hospitalViewDetailPanel.add(hospitalNameLabel);
		
		JButton reservationButton = new JButton("");
		reservationButton.setBounds(363, 175, 119, 40);
		hospitalViewDetailPanel.add(reservationButton);
		reservationButton.setIcon(new ImageIcon(PATH + "reservationSmallIcon.png"));
		
		reservationButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				hospitalViewDetailPanel.setVisible(false);
				ReservationReceipt reservationReceipt = new ReservationReceipt(backgroundPanel, id);
				reservationReceipt.reservationReceiptGUI();
			}
		});
		
		JLabel lastVisitLabel = new JLabel("\uCD5C\uADFC \uBC29\uBB38");
		lastVisitLabel.setBounds(20,10,79,35);
		lastVisitLabel.setOpaque(true);
		lastVisitLabel.setBackground(Color.WHITE);
		lastVisitLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		hospitalViewDetailWhitePanel.add(lastVisitLabel);
		
		JLabel lastVisitDateLabel = new JLabel("2020-11-09");
		lastVisitDateLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		lastVisitDateLabel.setBounds(101, 12, 88, 35);
		hospitalViewDetailWhitePanel.add(lastVisitDateLabel);
		
		JLabel subjectLabel = new JLabel("³»°ú");
		subjectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subjectLabel.setBounds(20, 60, 65, 35);
		subjectLabel.setOpaque(true);
		subjectLabel.setBackground(SystemColor.menu);
		subjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		hospitalViewDetailWhitePanel.add(subjectLabel);
		
		JPanel hospitalTimePanel = new JPanel();
		hospitalTimePanel.setBounds(20, 105, 465, 424);
		hospitalTimePanel.setBorder(new LineBorder(Color.gray, 2));
		hospitalTimePanel.setOpaque(true);
		hospitalTimePanel.setBackground(Color.WHITE);
		hospitalViewDetailWhitePanel.add(hospitalTimePanel);
		hospitalTimePanel.setLayout(null);
		
		JLabel phoneNumberLabel = new JLabel("¿¬¶ôÃ³");
		phoneNumberLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		phoneNumberLabel.setBounds(10, 20, 94, 40);
		hospitalTimePanel.add(phoneNumberLabel);
		
		JLabel phoneNumberInputLabel = new JLabel("010-xxxx-xxxx");
		phoneNumberInputLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		phoneNumberInputLabel.setBounds(116, 20, 195, 40);
		hospitalTimePanel.add(phoneNumberInputLabel);
		
		JLabel addressLabel = new JLabel("ÁÖ¼Ò");
		addressLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		addressLabel.setBounds(10,83, 61, 40);
		hospitalTimePanel.add(addressLabel);
		
		JLabel addressInfo = new JLabel("°æ±âµµ ¼ö¿ø½Ã Àå¾Èµ¿ ¼­ºÎ·Î 2123");
		addressInfo.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		addressInfo.setBounds(116,83, 335, 40);
		hospitalTimePanel.add(addressInfo);
		
		JLabel time = new JLabel("Áø·á ½Ã°£");
		time.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		time.setBounds(10,150, 131, 40);
		hospitalTimePanel.add(time);
		
		JLabel timeInfo = new JLabel("¿ù¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo.setBounds(10, 195, 430, 25);
		hospitalTimePanel.add(timeInfo);
		
		JLabel timeInfo1 = new JLabel("È­¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo1.setBounds(10, 225, 430, 25);
		hospitalTimePanel.add(timeInfo1);
		
		JLabel timeInfo2 = new JLabel("¼ö¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo2.setBounds(10, 255, 430, 25);
		hospitalTimePanel.add(timeInfo2);
		
		JLabel timeInfo3 = new JLabel("¸ñ¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo3.setBounds(10, 285, 430, 25);
		hospitalTimePanel.add(timeInfo3);
		
		JLabel timeInfo4 = new JLabel("±Ý¿äÀÏ Áø·á½Ã°£ : 09:00~18:00\n");
		timeInfo4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo4.setBounds(10, 315, 430, 25);
		hospitalTimePanel.add(timeInfo4);
		
		JLabel timeInfo5 = new JLabel("Åä¿äÀÏ Áø·á½Ã°£ : 09:00~13:00\n");
		timeInfo5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo5.setBounds(10, 345, 430, 25);
		hospitalTimePanel.add(timeInfo5);
		
		JLabel timeInfo6 = new JLabel("ÀÏ¿äÀÏ Áø·á½Ã°£ : Áø·á¾ÈÇÔ\n");
		timeInfo6.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		timeInfo6.setBounds(10, 375, 430, 25);
		hospitalTimePanel.add(timeInfo6);
		
		
		lowerButton = new LowerButton(backgroundPanel);
		lowerButton.buttons(hospitalViewDetailPanel, id);
	}

}
