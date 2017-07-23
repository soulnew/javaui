package com.ftmao.logic;

import java.util.Random;

public class HundradsPeopleMoneny {

	static int beginvalue = 100;

	public static int[] caculateMoney(int peopleAmount, int times) {

		return caculateMoneyPostive(peopleAmount, times, true);
	}

	
	public static void caculateMoney(int[] peoples,boolean pos) {
		Random r = new Random();
		for (int k = 0; k < peoples.length; k++) {

			if (pos && peoples[k] == 0) {
				continue;
			}
			peoples[k]--;
			peoples[Math.abs(r.nextInt() % peoples.length)]++;

		}
	}
	
	
	public static int[] caculateMoneyPostive(int peopleAmount, int times, boolean pos) {

		if (times <= 1 || peopleAmount <= 1) {
			return null;
		}

		int[] peoples = new int[peopleAmount];

		for (int k = 0; k < peopleAmount; k++) {

			peoples[k] = beginvalue;
		}

		Random r = new Random();

		for (int i = 0; i < times; i++) {

			for (int k = 0; k < peopleAmount; k++) {

				if (pos && peoples[k] == 0) {
					continue;
				}
				peoples[k]--;
				peoples[Math.abs(r.nextInt() % peopleAmount)]++;

			}

		}

		return peoples;
	}
	
	
}
