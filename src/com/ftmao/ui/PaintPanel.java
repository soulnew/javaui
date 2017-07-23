package com.ftmao.ui;

import java.awt.Dimension;
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
	}
;
	int[] datas;
	
	int lineMax=600;
	
	public void inputData(int[] datas) {
		
		this.datas=datas;

	}
	
	
	public void paint(Graphics g) {
		
		super.paint(g);
       
        
        if(datas==null) {
        	super.paint(g);
        	return;
        }
        
        Graphics2D g2 = (Graphics2D) g;
        
        for(int i=0;i<datas.length;i++) {
        	Line2D lin = new Line2D.Float(5*i,600 , 5*i,600-datas[i]);
//        	System.out.println(3*i+","+600+","+ 3*i+","+datas[i]);
            g2.draw(lin);
        }
        
    }
	

}
