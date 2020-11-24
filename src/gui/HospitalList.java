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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

public class HospitalList {
	private static String PATH = "D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\";
	private BackgroundPanel backgroundPanel;
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	
	void hospitalListGUI() {
		backgroundPanel = new BackgroundPanel();
		ImagePanel hospitalListPanel = backgroundPanel.background("º´¿ø¸®½ºÆ®");
		hospitalListPanel.setVisible(true);

		whitePanel = new WhitePanel();
		JPanel hospitalListWhitePanel = whitePanel.whiteBackGround(hospitalListPanel);
		
		JLabel areaLocationLabel = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C");
		areaLocationLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		areaLocationLabel.setBounds(44, 85, 156, 29);
		hospitalListPanel.add(areaLocationLabel);
		
		String[] subjects = {"Áø·á°ú¸ñ ¼±ÅÃ", "Ä¡°ú", "¾È°ú", "³»°ú", "ÇÇºÎ°ú", "½Å°æ°ú", "ºñ´¢±â°ú", "»êºÎÀÎ°ú", "Á¤Çü¿Ü°ú", "¼Ò¾ÆÃ»¼Ò³â°ú", "ÀçÈ°ÀÇÇÐ°ú"};
		JComboBox diagnosisComboBox = new JComboBox(subjects);
		diagnosisComboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC9C4\uB8CC\uACFC\uBAA9 \uC804\uCCB4", "\uCE58\uACFC", "\uC548\uACFC", "\uB0B4\uACFC", "\uD53C\uBD80\uACFC", "\uC2E0\uACBD\uACFC", "\uBE44\uB1E8\uAE30\uACFC", "\uC0B0\uBD80\uC778\uACFC", "\uC815\uD615\uC678\uACFC", "\uC18C\uC544\uCCAD\uC18C\uB144\uACFC", "\uC7AC\uD65C\uC758\uD559\uACFC"}));
		diagnosisComboBox.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		diagnosisComboBox.setBounds(393, 126, 124, 23);
		hospitalListPanel.add(diagnosisComboBox);
		
		JLabel locationIconLabel = new JLabel("");
		locationIconLabel.setIcon(new ImageIcon(PATH + "locationIcon.png"));
		locationIconLabel.setBounds(12, 80, 39, 39);
		hospitalListPanel.add(locationIconLabel);
		
		JTextField hospitalSearchTextField = new JTextField();
		hospitalSearchTextField.setBounds(77, 118, 228, 39);
		hospitalListPanel.add(hospitalSearchTextField);
		hospitalSearchTextField.setColumns(10);
		
		JButton hospitalSearchButton = new JButton("");
		hospitalSearchButton.setIcon(new ImageIcon(PATH + "searchLocationIcon.png"));
		hospitalSearchButton.setBounds(22, 118, 57, 38);
		hospitalListPanel.add(hospitalSearchButton);
		
		JToggleButton salesToggleButton = new JToggleButton("");
		salesToggleButton.setIcon(new ImageIcon(PATH + "salesToggleButtonLabel.png"));
		salesToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JToggleButton)e.getSource()).isSelected()) {
					salesToggleButton.setIcon(new ImageIcon(PATH + "salesToggleButtonLabel_click.png"));
				} else {
					salesToggleButton.setIcon(new ImageIcon(PATH + "salesToggleButtonLabel.png"));
				}
			}
		});

		salesToggleButton.setBounds(489, 85, 28, 27);
		hospitalListPanel.add(salesToggleButton);
		
		JLabel salesToggleLabel = new JLabel("\uC601\uC5C5\uC911\uB9CC \uBCF4\uC774\uAE30");
		salesToggleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 13));
		salesToggleLabel.setBounds(383, 93, 101, 15);
		hospitalListPanel.add(salesToggleLabel);
		
		JPanel hospitalInfoPanel_1 = new JPanel();
		hospitalInfoPanel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_1.setBackground(Color.WHITE);
		hospitalInfoPanel_1.setBounds(12, 10, 480, 115);
		hospitalListWhitePanel.add(hospitalInfoPanel_1);
		hospitalInfoPanel_1.setLayout(null);
		
		JLabel hospitalNameLabel_1 = new JLabel("\uC624\uC774\uBE48\uD6C4\uACFC\uC758\uC6D0");
		hospitalNameLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		hospitalNameLabel_1.setBounds(12, 10, 230, 35);
		hospitalInfoPanel_1.add(hospitalNameLabel_1);
		
		JLabel hospitalLocationPanel_1 = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC1A1\uC6D0\uB85C 81");
		hospitalLocationPanel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalLocationPanel_1.setBounds(12, 41, 198, 26);
		hospitalInfoPanel_1.add(hospitalLocationPanel_1);
		
		JLabel hospitalSubjectLabel_1 = new JLabel("\uC774\uBE44\uC778\uD6C4\uACFC");
		hospitalSubjectLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalSubjectLabel_1.setBounds(12, 77, 69, 28);
		hospitalInfoPanel_1.add(hospitalSubjectLabel_1);
		
		JLabel hospitalStatusLabel_1 = new JLabel("");
		hospitalStatusLabel_1.setIcon(new ImageIcon(PATH + "openIcon.png"));
		hospitalStatusLabel_1.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_1.add(hospitalStatusLabel_1);
		
		JPanel hospitalInfoPanel_4 = new JPanel();
		hospitalInfoPanel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_4.setBackground(Color.WHITE);
		hospitalInfoPanel_4.setBounds(12, 385, 480, 115);
		hospitalListWhitePanel.add(hospitalInfoPanel_4);
		
		JButton pagingButton_1 = new JButton("1");
		pagingButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		pagingButton_1.setBounds(136, 506, 45, 45);
		hospitalListWhitePanel.add(pagingButton_1);
		
		JButton pagingButton_2 = new JButton("2");
		pagingButton_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		pagingButton_2.setBounds(193, 506, 45, 45);
		hospitalListWhitePanel.add(pagingButton_2);
		
		JButton pagingButton_3 = new JButton("3");
		pagingButton_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		pagingButton_3.setBounds(250, 506, 45, 45);
		hospitalListWhitePanel.add(pagingButton_3);
		
		JButton pagingButton_4 = new JButton("4");
		pagingButton_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		pagingButton_4.setBounds(307, 506, 45, 45);
		hospitalListWhitePanel.add(pagingButton_4);
		
		JPanel hospitalInfoPanel_2 = new JPanel();
		hospitalInfoPanel_2.setLayout(null);
		hospitalInfoPanel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_2.setBackground(Color.WHITE);
		hospitalInfoPanel_2.setBounds(12, 135, 480, 115);
		hospitalListWhitePanel.add(hospitalInfoPanel_2);
		
		JLabel hospitalNameLabel_2 = new JLabel("\uC8FC\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		hospitalNameLabel_2.setBounds(12, 10, 230, 35);
		hospitalInfoPanel_2.add(hospitalNameLabel_2);
		
		JLabel hospitalLocationPanel_2 = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC11C\uBD80\uB85C 2112 \uC8FC\uBA54\uB514\uCE7C\uBE4C\uB529 2\uCE35");
		hospitalLocationPanel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalLocationPanel_2.setBounds(12, 41, 310, 26);
		hospitalInfoPanel_2.add(hospitalLocationPanel_2);
		
		JLabel hospitalSubjectLabel_2 = new JLabel("\uB0B4\uACFC");
		hospitalSubjectLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalSubjectLabel_2.setBounds(12, 77, 69, 28);
		hospitalInfoPanel_2.add(hospitalSubjectLabel_2);
		
		JLabel hospitalStatusLabel_2 = new JLabel("");
		hospitalStatusLabel_2.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_2.add(hospitalStatusLabel_2);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(PATH + "lunchIcon.png"));
		label_4.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_2.add(label_4);
		
		JPanel hospitalInfoPanel_3 = new JPanel();
		hospitalInfoPanel_3.setLayout(null);
		hospitalInfoPanel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_3.setBackground(Color.WHITE);
		hospitalInfoPanel_3.setBounds(12, 260, 480, 115);
		hospitalListWhitePanel.add(hospitalInfoPanel_3);
		
		JLabel hospitalNameLabel_3 = new JLabel("\uC8FC\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		hospitalNameLabel_3.setBounds(12, 10, 230, 35);
		hospitalInfoPanel_3.add(hospitalNameLabel_3);
		
		JLabel hospitalLocationPanel_3 = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC11C\uBD80\uB85C 2112 \uC8FC\uBA54\uB514\uCE7C\uBE4C\uB529 2\uCE35");
		hospitalLocationPanel_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalLocationPanel_3.setBounds(12, 41, 310, 26);
		hospitalInfoPanel_3.add(hospitalLocationPanel_3);
		
		JLabel hospitalSubjectLabel_3 = new JLabel("\uB0B4\uACFC");
		hospitalSubjectLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		hospitalSubjectLabel_3.setBounds(12, 77, 69, 28);
		hospitalInfoPanel_3.add(hospitalSubjectLabel_3);
		
		JLabel hospitalStatusLabel_3 = new JLabel("");
		hospitalStatusLabel_3.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_3.add(hospitalStatusLabel_3);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_3.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(PATH + "closeIcon.png"));
		label_7.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_3.add(label_7);
		
		
		lowerButton = new LowerButton();
		lowerButton.buttons(hospitalListPanel);
	}
	
	public static void main(String[] args) {
		HospitalList hospitalList = new HospitalList();
		hospitalList.hospitalListGUI();
	}
}
