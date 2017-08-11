package com.ftmao.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	public PaintPanel() {
		double width = Toolkit.getDefaultToolkit().getScreenSize().width;
		double height = Toolkit.getDefaultToolkit().getScreenSize().height;

		this.setPreferredSize(new Dimension((int) width / 2, (int) height / 2));

		panelHight = (int) height - 100;
		pannelwidth = (int) width - 100;
		
		v=new String[(int)height/10];
		for(int i=0;i<v.length;i++){
			v[i]=Integer.toString(i*10);
		}
	}

	int panelHight;
	int pannelwidth;
	String defaultLabel="No.";

	int[] datas;
	String[] v = null;
	String[] h = null;

	int space = 20;
	int spaceUnit = 10;

	int lineMax = 600;

	public void inputData(int[] datas) {

		this.datas = datas;

	}
	
	public void inputData(int[] datas,String[] des) {

		this.datas = datas;
		this.h=des;

	}

	public void paint(Graphics g) {

		super.paint(g);

		if (datas == null) {
			super.paint(g);
			return;
		}

		Graphics2D g2 = (Graphics2D) g;
		Font f=g2.getFont();
		f.deriveFont(30);
		g2.setFont(f);

		// draw x-y line
		g.setColor(Color.red);
		g2.draw(new Line2D.Float(space, panelHight, pannelwidth - space, panelHight));// draw x
		g2.draw(new Line2D.Float(space, panelHight, space, space));// draw y

		g.setColor(Color.BLACK);

		for (int i = 0; i < datas.length; i++) {
			Line2D lin = new Line2D.Float(space * (i+1) + space, panelHight, space * (i+1) + space, panelHight - datas[i]);
			g2.draw(lin);
			
			if (h != null) {
				if(h.length==datas.length) {
					g2.drawChars(h[i].toCharArray(), 0, h[i].length(), space * (i+1) + space, panelHight+space);
				}
				
			}else {
				String lb=defaultLabel+i;
				g2.drawChars(lb.toCharArray(), 0, lb.length(), space * i + space, panelHight+space);
			}
			
		}
//		g2.getFont().deriveFont(5);
//		g2.setFont(new Font());

		// draw x-y label

		if (v != null) {
			for (int i = 0; i < v.length; i++) {
				g2.drawChars(v[i].toCharArray(), 0, v[i].length(), space, panelHight-10*i);
			}

		}

		// g2.drawChars(arg0, arg1, arg2, arg3, arg4);

		

	}

}
