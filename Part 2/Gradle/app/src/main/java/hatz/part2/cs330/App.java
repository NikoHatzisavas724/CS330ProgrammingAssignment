package hatz.part2.cs330;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class App{

	public static void main(String[] args) {
		Random rand = new Random();
		int[] trials = new int[150];
		for (int i = 0; i < 150; i++) {
			int count = 0;
			boolean found = false;
			ArrayList<Integer> test = new ArrayList<Integer>();
			while (!found) {
				test.add(rand.nextInt(10));
				count++;
				if (test.size() > 6) {
					String str = "";
					for (int i2 = test.size() - 6; i2 < test.size(); i2++) {
						str += test.get(i2);
					}
					if (str.equals("832001")) {
						found = true;
						trials[i] = count;
					}
				}
			}
		}
		BigInteger av = BigInteger.valueOf(0);
		int min = 999999999;
		int max = 0;
		for (int i = 0; i < trials.length; i++) {
//			System.out.println(trials[i]);
			av = av.add(BigInteger.valueOf(trials[i]));
			if (trials[i] > max) {
				max = trials[i];
			}
			if (trials[i] < min) {
				min = trials[i];
			}
		}
		BigInteger aver = av.divide(BigInteger.valueOf(trials.length));
		System.out.println("Average: " + aver.intValue() + "\nMin: " + min + "\nMax: " + max);
	}

}
