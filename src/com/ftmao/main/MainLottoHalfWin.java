package com.ftmao.main;

import com.ftmao.logic.LottoHalfWin;
import com.ftmao.ui.PaintPanel;
import com.ftmao.ui.ScreenFrame;

public class MainLottoHalfWin {

	public static void main(String[] args) {

		final int[] out = new int[100];

		for (int k = 0; k < out.length; k++) {

			out[k] = 10;
		}

		out[out.length - 1] = 2000;

		ScreenFrame f = new ScreenFrame();
		final PaintPanel p = new PaintPanel();
		// add some comment

		f.add(p);
		f.showOut();

		Thread s = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int l = 0; l < 1000000; l++) {
					LottoHalfWin.caculateMoneyRecharge(out, true);
					// java.util.Arrays.sort(out);
					System.out.println("i" + l + " Host:" + out[out.length - 1]);
//					if (true) {
//						continue;
//					}
					p.inputData(out);
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
