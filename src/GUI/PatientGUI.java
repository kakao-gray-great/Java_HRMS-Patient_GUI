package GUI;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.border.CompoundBorder;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class PatientGUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField hospitalSearchTextField;
	private JTable hospitalListTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientGUI window = new PatientGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PatientGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		ImagePanel reservationListPanel = backgroundPanel("¿¹¾à ¸ñ·Ï");
//		reservationListPanel.setVisible(true);
//		
//		JPanel reservationStatusPanel = whitePanel(reservationListPanel);
//		
//		lowerButton(reservationListPanel);
		//////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////¿¹¾à ¸ñ·Ï//////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		
		/*
		ImagePanel reservationReceiptPanel = backgroundPanel("¿¹¾à Á¢¼ö");
		reservationReceiptPanel.setVisible(false);
		
		
		JLabel hospitalNameLabel = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		hospitalNameLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		hospitalNameLabel.setBounds(25, 106, 143, 46);
		reservationReceiptPanel.add(hospitalNameLabel);
		
		JButton backListButton = new JButton("");
		backListButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\backListIcon.png"));
		backListButton.setBounds(391, 116, 115, 30);
		reservationReceiptPanel.add(backListButton);
		
		JPanel reservationPanel = whitePanel(reservationReceiptPanel);
		
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
		selectedMonthComboBox.setBounds(139, 70, 97, 41);
		selectedMonthComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedMonthComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		reservationPanel.add(selectedMonthComboBox);
		
		JComboBox selectedDayComboBox = new JComboBox();
		selectedDayComboBox.setBounds(265, 70, 97, 41);
		selectedDayComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedDayComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		reservationPanel.add(selectedDayComboBox);
		
		JLabel seletedTimeLabel = new JLabel("\uC2DC\uAC04\uC744 \uC120\uD0DD\uD558\uC138\uC694");
		seletedTimeLabel.setBounds(12, 141, 159, 36);
		seletedTimeLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(seletedTimeLabel);
		
		JComboBox selectedTimeComboBox = new JComboBox();
		selectedTimeComboBox.setBounds(12, 187, 205, 41);
		selectedTimeComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		selectedTimeComboBox.setModel(new DefaultComboBoxModel(new String[] {"10:00", "10:30", "11:00"}));
		reservationPanel.add(selectedTimeComboBox);
		
		JLabel selectedSubjectLabel = new JLabel("\uC9C4\uB8CC\uACFC\uBAA9\uC744 \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		selectedSubjectLabel.setBounds(12, 264, 224, 36);
		selectedSubjectLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(selectedSubjectLabel);
		
		JComboBox selectedSubjectComboBox = new JComboBox();
		selectedSubjectComboBox.setBounds(12, 310, 205, 41);
		selectedSubjectComboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB0B4\uACFC"}));
		selectedSubjectComboBox.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 19));
		reservationPanel.add(selectedSubjectComboBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(12, 432, 97, 41);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2020"}));
		comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(139, 432, 97, 41);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationPanel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(265, 432, 97, 41);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 19));
		reservationPanel.add(comboBox_2);
		
		JLabel label = new JLabel("\uC99D\uC0C1\uC774 \uC5B8\uC81C\uBD80\uD130 \uB098\uD0C0\uB0AC\uB098\uC694");
		label.setBounds(12, 390, 241, 36);
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
		reservationPanel.add(label);
		
		JButton reservationButton = new JButton("");
		reservationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		reservationButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\reservationIcon.png"));
		reservationButton.setBounds(12, 501, 481, 46);
		reservationPanel.add(reservationButton);
		
		lowerButton(reservationReceiptPanel);
		
		*/
		//////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////º´¿ø ¸®½ºÆ® º¸±â//////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		
		
		
		ImagePanel hospitalListPanel = backgroundPanel("º´¿ø ¸®½ºÆ®");
		hospitalListPanel.setVisible(true);
		
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
		locationIconLabel.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\locationIcon.png"));
		locationIconLabel.setBounds(12, 80, 39, 39);
		hospitalListPanel.add(locationIconLabel);
		
		hospitalSearchTextField = new JTextField();
		hospitalSearchTextField.setBounds(77, 118, 228, 39);
		hospitalListPanel.add(hospitalSearchTextField);
		hospitalSearchTextField.setColumns(10);
		
		JButton hospitalSearchButton = new JButton("");
		hospitalSearchButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\searchLocationIcon.png"));
		hospitalSearchButton.setBounds(22, 118, 57, 38);
		hospitalListPanel.add(hospitalSearchButton);
		
		JToggleButton salesToggleButton = new JToggleButton("");
		salesToggleButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\salesToggleButtonLabel.png"));
		salesToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JToggleButton)e.getSource()).isSelected()) {
					salesToggleButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\salesToggleButtonLabel_click.png"));
				} else {
					salesToggleButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\salesToggleButtonLabel.png"));
				}
			}
		});

		salesToggleButton.setBounds(489, 85, 28, 27);
		hospitalListPanel.add(salesToggleButton);
		
		JLabel salesToggleLabel = new JLabel("\uC601\uC5C5\uC911\uB9CC \uBCF4\uC774\uAE30");
		salesToggleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 13));
		salesToggleLabel.setBounds(383, 93, 101, 15);
		hospitalListPanel.add(salesToggleLabel);
		
		JPanel hospitalListTablePanel = whitePanel(hospitalListPanel);
		
		JPanel hospitalInfoPanel_1 = new JPanel();
		hospitalInfoPanel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_1.setBackground(Color.WHITE);
		hospitalInfoPanel_1.setBounds(12, 10, 480, 115);
		hospitalListTablePanel.add(hospitalInfoPanel_1);
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
		hospitalStatusLabel_1.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\openIcon.png"));
		hospitalStatusLabel_1.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_1.add(hospitalStatusLabel_1);
		
		JPanel hospitalInfoPanel_4 = new JPanel();
		hospitalInfoPanel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_4.setBackground(Color.WHITE);
		hospitalInfoPanel_4.setBounds(12, 385, 480, 115);
		hospitalListTablePanel.add(hospitalInfoPanel_4);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		btnNewButton.setBounds(136, 506, 45, 45);
		hospitalListTablePanel.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		button.setBounds(193, 506, 45, 45);
		hospitalListTablePanel.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		button_1.setBounds(250, 506, 45, 45);
		hospitalListTablePanel.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		button_2.setBounds(307, 506, 45, 45);
		hospitalListTablePanel.add(button_2);
		
		JPanel hospitalInfoPanel_2 = new JPanel();
		hospitalInfoPanel_2.setLayout(null);
		hospitalInfoPanel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_2.setBackground(Color.WHITE);
		hospitalInfoPanel_2.setBounds(12, 135, 480, 115);
		hospitalListTablePanel.add(hospitalInfoPanel_2);
		
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
		label_4.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\lunchIcon.png"));
		label_4.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_2.add(label_4);
		
		JPanel hospitalInfoPanel_3 = new JPanel();
		hospitalInfoPanel_3.setLayout(null);
		hospitalInfoPanel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_3.setBackground(Color.WHITE);
		hospitalInfoPanel_3.setBounds(12, 260, 480, 115);
		hospitalListTablePanel.add(hospitalInfoPanel_3);
		
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
		label_7.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\closeIcon.png"));
		label_7.setBounds(406, 0, 73, 114);
		hospitalInfoPanel_3.add(label_7);
		/*
		Icon openIcon = new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\openIcon.png");
		Icon lunchIcon = new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\lunchIcon.png");
		Icon closeIcon = new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\closeIcon.png");
		String[] headers = new String[] {"º´¿ø Á¤º¸", "¿µ¾÷ »óÅÂ"};
		Object[][] data = {{"¿ÀÀÌºñÀÎÈÄ°ú", openIcon}, {"ÁÖ³»°úÀÇ¿ø", lunchIcon}, {"¾ÆÁÖÇÁ¶óÀÓ¾È°ú", closeIcon}, {"¿¬¼¼³»°úÀÇ¿ø", openIcon}};
		DefaultTableModel model = new DefaultTableModel(data, headers) {
			@SuppressWarnings("unchecked")
			public Class getColumnClass(int column) {
				return getValueAt(0, column).getClass();
			}
		};
		
		hospitalListTablePanel.setLayout(null);
		hospitalListTable = new JTable(model);
		hospitalListTable.setEnabled(false);
		hospitalListTable.setTableHeader(null);
		hospitalListTable.setRowHeight(150);
		hospitalListTable.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		hospitalListTable.setAlignmentX(0);
		hospitalListTable.setSize(480, 500);
		hospitalListTable.setPreferredScrollableViewportSize(new Dimension(480, 500));
		JScrollPane scrollPane = new JScrollPane(hospitalListTable);
		scrollPane.setBounds(3, 5, 499, 502);
		hospitalListTablePanel.add(scrollPane);
		TableColumnModel hospitalListModels = hospitalListTable.getColumnModel();
		hospitalListModels.getColumn(0).setPreferredWidth(420);
		*/
		lowerButton(hospitalListPanel);
		
	
		
		//////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////·Î±×ÀÎ/////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////
/*
		ImagePanel loginPanel = backgroundPanel();
		loginPanel.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("    \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 43));
		lblNewLabel.setBounds(100, 37, 321, 75);
		loginPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uAC70\uAE34\uC5B4\uB54C");
		lblNewLabel_1.setBounds(12, 10, 74, 26);
		loginPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("   LOG IN");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_2.setBounds(155, 253, 201, 95);
		loginPanel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(126, 396, 357, 68);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\login_ID.png"));
		lblNewLabel_3.setBounds(40, 395, 74, 68);
		loginPanel.add(lblNewLabel_3);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\login_passwd.png"));
		label.setBounds(40, 497, 74, 68);
		loginPanel.add(label);
		
		JButton loginButton = new JButton("");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\loginButton2.png"));
		loginButton.setBounds(343, 589, 140, 60);
		loginButton.setPressedIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\loginButton_click.png"));
		loginPanel.add(loginButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(126, 497, 357, 68);
		loginPanel.add(passwordField);
		
		lowerButton(loginPanel);
		*/
	}
	
	////////////////method//////////////////////
	void lowerButton(JPanel jPanel) {
		JButton loginHospital = new JButton("");
		loginHospital.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginHospital.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\loginHospitalButton.png"));
		loginHospital.setBounds(0, 787, 176, 92);
		jPanel.add(loginHospital);
		
		JButton reservationLowerButton = new JButton("\"new Button\"");
		reservationLowerButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\loginReservationButton.png"));
		reservationLowerButton.setBounds(176, 787, 178, 92);
		jPanel.add(reservationLowerButton);
		
		JButton informationLowerButton = new JButton("\"new Button\"");
		informationLowerButton.setIcon(new ImageIcon("D:\\Computer\\eclipse-workspace\\Java_HRMS-Patient_GUI\\image\\loginInformationButton1.png"));
		informationLowerButton.setBounds(354, 787, 176, 92);
		jPanel.add(informationLowerButton);
	}
	
	ImagePanel backgroundPanel(String title) {
		ImagePanel backgroundPanel = new ImagePanel(new ImageIcon("D:/Computer/eclipse-workspace/Java_HRMS-Patient_GUI/image/login_background.png").getImage());
		backgroundPanel.setBounds(0, 0, 540, 879);
		frame.setSize(backgroundPanel.getWidth() + 16, backgroundPanel.getHeight());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(backgroundPanel);
		frame.setLocationRelativeTo(null);
		backgroundPanel.setLayout(null);
		
		JLabel titleLabel = new JLabel("  " + title);
		titleLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 33));
		titleLabel.setBounds(161, 29, 215, 46);
		backgroundPanel.add(titleLabel);
		
		JLabel titleSmallLabel = new JLabel("\uAC70\uAE34\uC5B4\uB54C");
		titleSmallLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		titleSmallLabel.setBounds(12, 10, 57, 15);
		backgroundPanel.add(titleSmallLabel);
		
		return backgroundPanel;
	}
	
	JPanel whitePanel (JPanel mainPanel) {
		JPanel whitePanel = new JPanel();
		whitePanel.setBackground(Color.WHITE);
		whitePanel.setForeground(Color.BLACK);
		whitePanel.setBounds(12, 221, 505, 557);
		mainPanel.add(whitePanel);
		whitePanel.setLayout(null);
		
		
		
		/////////////////////////////////////
		return whitePanel;
	}
}

class ImagePanel extends JPanel {
	private Image img;
	
	public ImagePanel (Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	
	public int getHeight() {
		return img.getHeight(null);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}
