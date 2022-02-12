package test;

import java.util.Arrays;
import java.util.StringJoiner;
public class Test02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int sum = 0;
		StringJoiner sj = new StringJoiner(",");
		Arrays.stream(num).forEach(i -> sj.add(String.valueOf(i)));
		System.out.println(sj.toString());
//		System.out.println(num[0]);
		for (int i = 0; i < 20; ++i) {
//			System.out.println(num[i]);
			sum = num[i] + 0 + 1 + 2 + 3 + 4 + 5;
			if (sum % 2 != 0) {
				System.out.println(sum);
			} 
		}
	}
}
