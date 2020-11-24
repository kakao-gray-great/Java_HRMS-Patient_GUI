package gui;

import java.awt.Color;

import javax.swing.JPanel;

public class WhitePanel {
	
	JPanel whiteBackGround (JPanel mainPanel) {
		JPanel whitePanel = new JPanel();
		whitePanel.setBackground(Color.WHITE);
		whitePanel.setForeground(Color.BLACK);
		whitePanel.setBounds(12, 221, 505, 557);
		mainPanel.add(whitePanel);
		whitePanel.setLayout(null);
		
		return whitePanel;
	}
}
