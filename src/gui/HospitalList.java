package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

public class HospitalList {
	private static final ImageIcon openIcon = new ImageIcon(PatientApplication.PATH + "openIcon.png");
	private static final ImageIcon lunchIcon = new ImageIcon(PatientApplication.PATH + "lunchIcon.png");
	private static final ImageIcon closeIcon = new ImageIcon(PatientApplication.PATH + "closeIcon.png");
	
	private LowerButton lowerButton;
	private WhitePanel whitePanel;
	private String id;
	private ArrayList<JPanel> panelList = new ArrayList<JPanel>();
	private BackgroundPanel backgroundPanel;
	private ImagePanel hospitalListPanel;
	
	public HospitalList(BackgroundPanel backgroundPanel, String id) {
		this.backgroundPanel = backgroundPanel;
		this.id = id;
	}
	
	void hospitalListGUI() {
		hospitalListPanel = backgroundPanel.background("병원리스트");
		hospitalListPanel.setVisible(true);

		whitePanel = new WhitePanel();
		JPanel hospitalListWhitePanel = whitePanel.whiteBackGround(hospitalListPanel);
		
		JLabel areaLocationLabel = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C");
		areaLocationLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		areaLocationLabel.setBounds(44, 85, 156, 29);
		hospitalListPanel.add(areaLocationLabel);
		
		String[] subjects = {"진료과목 선택", "치과", "안과", "내과", "피부과", "신경과", "비뇨기과", "산부인과", "정형외과", "소아청소년과", "재활의학과"};
		JComboBox diagnosisComboBox = new JComboBox(subjects);
		diagnosisComboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC9C4\uB8CC\uACFC\uBAA9 \uC804\uCCB4", "\uCE58\uACFC", "\uC548\uACFC", "\uB0B4\uACFC", "\uD53C\uBD80\uACFC", "\uC2E0\uACBD\uACFC", "\uBE44\uB1E8\uAE30\uACFC", "\uC0B0\uBD80\uC778\uACFC", "\uC815\uD615\uC678\uACFC", "\uC18C\uC544\uCCAD\uC18C\uB144\uACFC", "\uC7AC\uD65C\uC758\uD559\uACFC"}));
		diagnosisComboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		diagnosisComboBox.setBounds(393, 126, 124, 23);
		hospitalListPanel.add(diagnosisComboBox);
		
		JLabel locationIconLabel = new JLabel("");
		locationIconLabel.setIcon(new ImageIcon(PatientApplication.PATH + "locationIcon.png"));
		locationIconLabel.setBounds(12, 80, 39, 39);
		hospitalListPanel.add(locationIconLabel);
		
		JTextField hospitalSearchTextField = new JTextField();
		hospitalSearchTextField.setBounds(77, 118, 228, 39);
		hospitalListPanel.add(hospitalSearchTextField);
		hospitalSearchTextField.setColumns(10);
		
		JButton hospitalSearchButton = new JButton("");
		hospitalSearchButton.setIcon(new ImageIcon(PatientApplication.PATH + "searchLocationIcon.png"));
		hospitalSearchButton.setBounds(22, 118, 57, 38);
		hospitalListPanel.add(hospitalSearchButton);
		
		JToggleButton salesToggleButton = new JToggleButton("");
		salesToggleButton.setIcon(new ImageIcon(PatientApplication.PATH + "salesToggleButtonLabel.png"));
		salesToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (((JToggleButton)e.getSource()).isSelected()) {
					salesToggleButton.setIcon(new ImageIcon(PatientApplication.PATH + "salesToggleButtonLabel_click.png"));
				} else {
					salesToggleButton.setIcon(new ImageIcon(PatientApplication.PATH + "salesToggleButtonLabel.png"));
				}
			}
		});

		salesToggleButton.setBounds(489, 85, 28, 27);
		hospitalListPanel.add(salesToggleButton);
		
		JLabel salesToggleLabel = new JLabel("\uC601\uC5C5\uC911\uB9CC \uBCF4\uC774\uAE30");
		salesToggleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		salesToggleLabel.setBounds(383, 93, 101, 15);
		hospitalListPanel.add(salesToggleLabel);
		
		JPanel hospitalInfoPanel_1 = new JPanel();
		hospitalInfoPanel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_1.setBackground(Color.WHITE);
		hospitalInfoPanel_1.setBounds(12, 10, 480, 115);
		hospitalListWhitePanel.add(hospitalInfoPanel_1);
		hospitalInfoPanel_1.setLayout(null);
		
		hospitalPanelContent(hospitalListPanel, hospitalInfoPanel_1, "수원병원", "경기도 수원시 장안구 연무동", "내과", lunchIcon);
		
		JPanel hospitalInfoPanel_2 = new JPanel();
		hospitalInfoPanel_2.setLayout(null);
		hospitalInfoPanel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_2.setBackground(Color.WHITE);
		hospitalInfoPanel_2.setBounds(12, 135, 480, 115);
		hospitalListWhitePanel.add(hospitalInfoPanel_2);
		
		hospitalPanelContent(hospitalListPanel, hospitalInfoPanel_2, "아주대병원", "경기도 수원시 영통구 정자동", "내과", openIcon);
		
		JPanel hospitalInfoPanel_3 = new JPanel();
		hospitalInfoPanel_3.setLayout(null);
		hospitalInfoPanel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_3.setBackground(Color.WHITE);
		hospitalInfoPanel_3.setBounds(12, 260, 480, 115);
		hospitalListWhitePanel.add(hospitalInfoPanel_3);
		
		hospitalPanelContent(hospitalListPanel, hospitalInfoPanel_3, "연세대병원", "경기도 수원시 영통구 광교동", "정형외과", closeIcon);
		
		JPanel hospitalInfoPanel_4 = new JPanel();
		hospitalInfoPanel_4.setLayout(null);
		hospitalInfoPanel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		hospitalInfoPanel_4.setBackground(Color.WHITE);
		hospitalInfoPanel_4.setBounds(12, 385, 480, 115);
		hospitalListWhitePanel.add(hospitalInfoPanel_4);
		
		hospitalPanelContent(hospitalListPanel, hospitalInfoPanel_4, "멋진병원", "경기도 수원시 장안구 연무동", "가정의학과", openIcon);
		
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
		
		lowerButton = new LowerButton(backgroundPanel);
		lowerButton.buttons(hospitalListPanel, id);
	}
	
	private void hospitalPanelContent(JPanel mainPanel, JPanel panel, String hospitalName, String hospitalAddress, String subject, ImageIcon statusIcon) {
		JLabel hospitalNameLabel = new JLabel(hospitalName);
		hospitalNameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		hospitalNameLabel.setBounds(12, 10, 230, 35);
		panel.add(hospitalNameLabel);
		
		JLabel hospitalLocationPanel = new JLabel(hospitalAddress);
		hospitalLocationPanel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		hospitalLocationPanel.setBounds(12, 41, 198, 26);
		panel.add(hospitalLocationPanel);
		
		JLabel hospitalSubjectLabel = new JLabel(subject);
		hospitalSubjectLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		hospitalSubjectLabel.setBounds(12, 77, 69, 28);
		panel.add(hospitalSubjectLabel);
		
		JLabel hospitalStatusLabel = new JLabel("");
		hospitalStatusLabel.setIcon(statusIcon);
		hospitalStatusLabel.setBounds(406, 0, 73, 114);
		panel.add(hospitalStatusLabel);
		
		selectedHospital(mainPanel, backgroundPanel);
	}
	
	private void selectedHospital(JPanel hospitalPanel, BackgroundPanel backgroundPanel) {
		hospitalPanel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				hospitalListPanel.setVisible(false);

				HospitalViewDetail hospitalViewDetail = new HospitalViewDetail(backgroundPanel, id);
				hospitalViewDetail.hospitalViewDetailGUI();
		    }
		});
	}
	
}
