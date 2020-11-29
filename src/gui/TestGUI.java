package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class TestGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
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
	public TestGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		JPanel popUpPanel = new JPanel();
		popUpPanel.setBackground(new Color(0, 204, 255));
		popUpPanel.setForeground(new Color(51, 204, 255));
		popUpPanel.setBounds(0, 0, 321, 335);
		frame.getContentPane().add(popUpPanel);
		popUpPanel.setLayout(null);
		
		JLabel reservationInformationLabel = new JLabel("\uC608\uC57D \uC815\uBCF4");
		reservationInformationLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 26));
		reservationInformationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		reservationInformationLabel.setBounds(0, 10, 321, 32);
		popUpPanel.add(reservationInformationLabel);
		
		JPanel informationPanel = new JPanel();
		informationPanel.setBackground(Color.WHITE);
		informationPanel.setBounds(12, 65, 297, 172);
		popUpPanel.add(informationPanel);
		informationPanel.setLayout(null);
		
		JLabel phoneNumberLabel = new JLabel("\uC5F0\uB77D\uCC98");
		phoneNumberLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 17));
		phoneNumberLabel.setBounds(12, 93, 52, 29);
		informationPanel.add(phoneNumberLabel);
		
		JLabel hospitalName = new JLabel("\uC5F0\uC138\uB0B4\uACFC\uC758\uC6D0");
		hospitalName.setBounds(12, 22, 158, 40);
		informationPanel.add(hospitalName);
		hospitalName.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 24));
		
		JLabel reservationDateLabel = new JLabel("2020-11-29");
		reservationDateLabel.setBounds(173, 42, 74, 15);
		informationPanel.add(reservationDateLabel);
		reservationDateLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel reservationTimeLabel = new JLabel("11:00");
		reservationTimeLabel.setBounds(243, 42, 40, 15);
		informationPanel.add(reservationTimeLabel);
		reservationTimeLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		
		JLabel inputPhoneNumberLabel = new JLabel("010-3333-4444");
		inputPhoneNumberLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		inputPhoneNumberLabel.setBounds(76, 96, 123, 25);
		informationPanel.add(inputPhoneNumberLabel);
		
		JLabel addressLabel = new JLabel("\uC8FC\uC18C");
		addressLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 17));
		addressLabel.setBounds(12, 133, 35, 29);
		informationPanel.add(addressLabel);
		
		JLabel inputAddressLabel = new JLabel("\uACBD\uAE30\uB3C4 \uC218\uC6D0\uC2DC \uC7A5\uC548\uAD6C \uC5F0\uBB34\uB3D9");
		inputAddressLabel.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 12));
		inputAddressLabel.setBounds(59, 133, 238, 25);
		informationPanel.add(inputAddressLabel);
		
		JPanel symptomPanel = new JPanel();
		symptomPanel.setBackground(Color.WHITE);
		symptomPanel.setBounds(12, 236, 297, 89);
		popUpPanel.add(symptomPanel);
		symptomPanel.setLayout(new GridLayout(0, 3, 5, 20));
		
		JLabel symptomLabel_1 = new JLabel("∫π≈Î");
		symptomLabel_1.setBackground(Color.WHITE);
		symptomLabel_1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		symptomLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel symptomLabel_2 = new JLabel("º≥ªÁ");
		symptomLabel_2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		symptomLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel symptomLabel_3 = new JLabel("∫Ø∫Ò");
		symptomLabel_3.setForeground(Color.BLACK);
		symptomLabel_3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		symptomLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel symptomLabel_4 = new JLabel("∫“∏È¡ı");
		symptomLabel_4.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		symptomLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel symptomLabel_5 = new JLabel("±‚ƒß");
		symptomLabel_5.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		symptomLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel symptomLabel_6 = new JLabel("ƒ‡π∞");
		symptomLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		symptomLabel_6.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
		
		symptomPanel.add(symptomLabel_1);
		symptomPanel.add(symptomLabel_2);
		symptomPanel.add(symptomLabel_3);
		symptomPanel.add(symptomLabel_4);
		symptomPanel.add(symptomLabel_5);
		symptomPanel.add(symptomLabel_6);
		
	}
}
