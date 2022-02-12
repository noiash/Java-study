package test;

import java.util.ArrayList;
public class Test02 {
	public static void main(String[] args) {
		int num[] = new int[19];  //配列の変数宣言
		ArrayList<Integer> odds = new ArrayList<>(); //奇数
		ArrayList<Integer> evens = new ArrayList<>(); //偶数
		
		for (int i = 0; i <= num.length - 1; i++) {
			if (i == 0) {
				num[i] = 0;
				continue;
			}
			
			num[i] = num[i - 1] + 5;
			
			if (i <= 10) {
				if (num[i] % 2 != 0) {
					odds.add(num[i]);
				}
			} else {
				if (num[i] % 2 == 0) {
					evens.add(num[i]);
				}
			}
//			System.out.println(num[i - 1]);

		}
//		StringJoiner all = new StringJoiner(" ").merge(odds).merge(evens);
//		System.out.println(all.toString());
		
		System.out.println(odds);
		System.out.println(evens);
	}
}
