package com.ftmao.ui;

import javax.swing.JFrame;

public class ScreenFrame extends JFrame{
	
	public ScreenFrame() {
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public void showOut() {
		this.pack();
		this.setVisible(true);
	}

}
