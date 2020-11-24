package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class SelfDiagnosis {
	private BackgroundPanel backgroundPanel;
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	
	void selfDiagnosisGUI() {
		backgroundPanel = new BackgroundPanel();
		ImagePanel selfDiagnosisPanel = backgroundPanel.background("ÀÚ°¡Áø´Ü");
		selfDiagnosisPanel.setVisible(true);
		
		whitePanel = new WhitePanel();
		JPanel selfDiagnosisWhitePanel = whitePanel.whiteBackGround(selfDiagnosisPanel);
		
		JLabel hospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		hospitalNameLabel.setBounds(25, 106, 143, 46);
		selfDiagnosisPanel.add(hospitalNameLabel);
		
		JLabel subjectLabel = new JLabel("\uB0B4\uACFC");
		subjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		subjectLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subjectLabel.setBounds(176, 175, 178, 38);
		selfDiagnosisPanel.add(subjectLabel);
		
		JToggleButton selfCheckPartOneButton_1 = new JToggleButton("");
		selfCheckPartOneButton_1.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_1.setBounds(34, 69, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_1);
		
		JToggleButton selfCheckPartOneButton_2 = new JToggleButton("");
		selfCheckPartOneButton_2.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_2.setBounds(193, 69, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_2);
		
		JToggleButton selfCheckPartOneButton_3 = new JToggleButton("");
		selfCheckPartOneButton_3.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_3.setBounds(349, 69, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_3);
		
		JToggleButton selfCheckPartOneButton_5 = new JToggleButton("");
		selfCheckPartOneButton_5.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_5.setBounds(193, 145, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_5);
		
		JToggleButton selfCheckPartOneButton_4 = new JToggleButton("");
		selfCheckPartOneButton_4.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_4.setBounds(34, 145, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_4);
		
		JToggleButton selfCheckPartOneButton_6 = new JToggleButton("");
		selfCheckPartOneButton_6.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_6.setBounds(349, 145, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_6);
		
		JToggleButton selfCheckPartOneButton_8 = new JToggleButton("");
		selfCheckPartOneButton_8.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_8.setBounds(193, 223, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_8);
		
		JToggleButton selfCheckPartOneButton_7 = new JToggleButton("");
		selfCheckPartOneButton_7.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_7.setBounds(34, 223, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_7);
		
		JToggleButton selfCheckPartOneButton_9 = new JToggleButton("");
		selfCheckPartOneButton_9.setBackground(new Color(102, 102, 102));
		selfCheckPartOneButton_9.setBounds(349, 223, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartOneButton_9);
		
		JToggleButton selfCheckPartTwoButton_2 = new JToggleButton("");
		selfCheckPartTwoButton_2.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_2.setBounds(193, 346, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_2);
		
		JToggleButton selfCheckPartTwoButton_1 = new JToggleButton("");
		selfCheckPartTwoButton_1.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_1.setBounds(34, 346, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_1);
		
		JToggleButton selfCheckPartTwoButton_3 = new JToggleButton("");
		selfCheckPartTwoButton_3.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_3.setBounds(349, 346, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_3);
		
		JToggleButton selfCheckPartTwoButton_5 = new JToggleButton("");
		selfCheckPartTwoButton_5.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_5.setBounds(193, 426, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_5);
		
		JToggleButton selfCheckPartTwoButton_4 = new JToggleButton("");
		selfCheckPartTwoButton_4.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_4.setBounds(34, 426, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_4);
		
		JToggleButton selfCheckPartTwoButton_6 = new JToggleButton("");
		selfCheckPartTwoButton_6.setBackground(new Color(102, 102, 102));
		selfCheckPartTwoButton_6.setBounds(349, 426, 122, 52);
		selfDiagnosisWhitePanel.add(selfCheckPartTwoButton_6);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\submitButton.png"));
		btnNewButton_1.setBounds(34, 506, 437, 41);
		selfDiagnosisWhitePanel.add(btnNewButton_1);
		
		JLabel selfCategoryLabel_1 = new JLabel("\uC18C\uD654\uAE30");
		selfCategoryLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		selfCategoryLabel_1.setBounds(34, 27, 70, 32);
		selfDiagnosisWhitePanel.add(selfCategoryLabel_1);
		
		JLabel selfCategoryLabel_2 = new JLabel("\uC18C\uD654\uAE30");
		selfCategoryLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		selfCategoryLabel_2.setBounds(34, 304, 70, 32);
		selfDiagnosisWhitePanel.add(selfCategoryLabel_2);
		
		lowerButton = new LowerButton();

		lowerButton.buttons(selfDiagnosisPanel);
	}
	public static void main(String[] args) {
		SelfDiagnosis selfDiagnosis = new SelfDiagnosis();
		selfDiagnosis.selfDiagnosisGUI();
	}
}
