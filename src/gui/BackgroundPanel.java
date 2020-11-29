package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BackgroundPanel {
	private ImagePanel background;
	private JFrame frame = new JFrame();
	private String id;
	
	ImagePanel background(String title) {
		background = new ImagePanel(new ImageIcon(PatientApplication.PATH + "login_background.png").getImage());
		background.setBounds(0, 0, 540, 879);
		frame.setSize(background.getWidth() + 16, background.getHeight());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(background);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		background.setLayout(null);
		
		JLabel titleLabel = new JLabel(title);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 33));
		titleLabel.setBounds(157, 29, 224, 46);
		background.add(titleLabel);
		
		JLabel titleSmallLabel = new JLabel("\uAC70\uAE34\uC5B4\uB54C");
		titleSmallLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		titleSmallLabel.setBounds(12, 10, 57, 15);
		background.add(titleSmallLabel);
		
		JButton refreshButton = new JButton("");
		refreshButton.setIcon(new ImageIcon(PatientApplication.PATH + "refreshButton.png"));
		refreshButton.setBounds(426, 8, 47, 46);
		background.add(refreshButton);
		
		JButton backButton = new JButton("");
		backButton.setIcon(new ImageIcon(PatientApplication.PATH + "backButton.png"));
		backButton.setBounds(481, 8, 47, 46);
		background.add(backButton);
		
		return background;
	}
	
}
