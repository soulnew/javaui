package com.ftmao.main;

import com.ftmao.logic.HundradsPeopleMoneny;
import com.ftmao.ui.PaintPanel;
import com.ftmao.ui.ScreenFrame;

public class MainUI {

	public static void main(String[] args) {

		final int[] out = new int[50];

		for (int k = 0; k < out.length; k++) {

			out[k] = 100;
		}

		ScreenFrame f = new ScreenFrame();
		final PaintPanel p = new PaintPanel();
		// add some comment

		f.add(p);
		f.showOut();

		String[] lb = new String[out.length];
		for (int i = 0; i < lb.length; i++) {
			lb[i] = Integer.toString(i);
		}

		Thread s = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int l = 0; l < 10000; l++) {
					HundradsPeopleMoneny.caculateMoney(out, true);
					java.util.Arrays.sort(out);
					p.inputData(out, lb);
					p.repaint();

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		});

		s.start();

	}

}
