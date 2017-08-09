package com.ftmao.logic;

import java.util.Random;

public class LottoHalfWin {

	static int beginvalue = 10;

	public static void caculateMoney(int[] peoples, boolean pos) {
		Random r = new Random();
		for (int k = 0; k < peoples.length - 1; k++) {

			if (pos && peoples[k] == 0) {
				continue;
			}

			if (Math.abs(r.nextInt() % 2) == 0) {
				peoples[k]--;
				peoples[peoples.length - 1]++;
			} else {
				peoples[k]++;
				peoples[peoples.length - 1]--;

			}

		}
	}
	
	public static void caculateMoneyRecharge(int[] peoples, boolean pos) {
		Random r = new Random();
		for (int k = 0; k < peoples.length - 1; k++) {

			if (pos && peoples[k] <=0) {
				peoples[k] =beginvalue;
			}
			
			if (peoples[k]>beginvalue*10) {
				peoples[k] =0;
			}

			if (Math.abs(r.nextInt() % 2) == 0) {
				peoples[k]--;
				peoples[peoples.length - 1]++;
			} else {
				peoples[k]++;
				peoples[peoples.length - 1]--;

			}

		}
	}


}
