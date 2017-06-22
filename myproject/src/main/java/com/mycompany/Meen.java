package com.mycompany;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Meen {

	public static void main(String args[]) {

		ArrayList<Integer> pk = new ArrayList<Integer>();
		boolean w = true;
		double level = 2;
		Random rnd = new Random();
		int rr = 0;

		System.out.println((int)(level) + "以上の素数を入力してください。");

		while (w == true) {
			rr = rnd.nextInt(10);
			rr = rr + 5;

			Scanner scan = new Scanner(System.in);
			int sosu = scan.nextInt();
			System.out.println(sosu + "が入力されました。");

			if (sosu < level) {
				System.out.println((int)(level) + "未満なので終了します。");
				System.out.println("記録は" + pk.size() + "個でした");
				break;
			}

			Sosu r = new Sosu();
			if (r.checksosu(sosu)) {
				System.out.println(sosu + "は素数です");

				for (int i = 1; i < pk.size() + 1; i++) {
					if (pk.get(i - 1) == sosu) {
						System.out.println("しかし" + i + "番目に入力した素数と重複しました。終了します");
						System.out.println("記録は" + pk.size() + "個でした。");
						w = false;
						break;

					}
				}

				if (w == true) {
					pk.add(sosu);
				}

			} else {
				System.out.println("素数ではなかったようです。");
				System.out.println("記録は" + pk.size() + "個でした。");
				w = false;
				break;

			}
			if (w == true) {
				level = (int)(level * 1.2);
				level = level + rr;
				System.out.println((int)(level) + "以上の素数を入力してください。\nただし同じ素数は使えません");
			}
		}
	}

}
