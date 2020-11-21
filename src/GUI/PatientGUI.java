package GUI;

import java.awt.Dimension;
import java.awt.EventQueue;

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
import javax.swing.table.TableColumnModel;

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
		
		ImagePanel hospitalListPanel = backgroundPanel();
		hospitalListPanel.setVisible(true);
		
		JLabel hospitalListLabel = new JLabel("\uBCD1\uC6D0\uB9AC\uC2A4\uD2B8");
		hospitalListLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 43));
		hospitalListLabel.setBounds(161, 29, 215, 46);
		hospitalListPanel.add(hospitalListLabel);
		
		JLabel smallNameLabel_2 = new JLabel("\uAC70\uAE34\uC5B4\uB54C");
		smallNameLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		smallNameLabel_2.setBounds(12, 10, 57, 15);
		hospitalListPanel.add(smallNameLabel_2);
		
		JLabel areaLocationLabel = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C");
		areaLocationLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		areaLocationLabel.setBounds(44, 85, 156, 29);
		hospitalListPanel.add(areaLocationLabel);
		
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
		
		JPanel hospitalListTablePanel = new JPanel();
		hospitalListTablePanel.setBackground(Color.WHITE);
		hospitalListTablePanel.setForeground(Color.WHITE);
		hospitalListTablePanel.setBounds(12, 221, 505, 550);
		hospitalListPanel.add(hospitalListTablePanel);
		
		
		String[] headers = new String[] {"º´¿ø Á¤º¸", "¿µ¾÷ »óÅÂ"};
		String[][] data = new String[][] {{"¿ÀÀÌºñÀÎÈÄ°ú", "¿µ¾÷Áß"}, {"ÁÖ³»°úÀÇ¿ø", "Á¡½É"}, {"¾ÆÁÖÇÁ¶óÀÓ¾È°ú", "ÈÞ¹«"}, {"¿¬¼¼³»°úÀÇ¿ø", "¿µ¾÷Áß"}};
		hospitalListTablePanel.setLayout(null);
		hospitalListTable = new JTable(data, headers);
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
		
		lowerButton(hospitalListPanel);
		
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
	
	ImagePanel backgroundPanel() {
		ImagePanel backgroundPanel = new ImagePanel(new ImageIcon("D:/Computer/eclipse-workspace/Java_HRMS-Patient_GUI/image/login_background.png").getImage());
		backgroundPanel.setBounds(0, 0, 540, 879);
		frame.setSize(backgroundPanel.getWidth() + 16, backgroundPanel.getHeight());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(backgroundPanel);
		frame.setLocationRelativeTo(null);
		backgroundPanel.setLayout(null);
		
		return backgroundPanel;
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
