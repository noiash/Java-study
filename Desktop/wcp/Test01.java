package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Test01 {
	public static void main(String[] args) {
//		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> evens = new ArrayList<>();
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// TODO 自動生成されたメソッド・スタブ
		StringJoiner sj = new StringJoiner(",");
		Arrays.stream(num).forEach(i -> sj.add(String.valueOf(i)));
		System.out.println(sj.toString());
		
//		for (int i = 1; i <= num.length; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		for (int i = 1; i <= 10; i++) {
//			numbers.add(i);
			if (i % 2 == 0) {
				//偶数のみ表示
//				System.out.println(i);
				//偶数のみ配列に追加
				evens.add(i);
			}
		}
		
		int evenSum = 0; //変数宣言
		
		//evensを1つずつevenSumに加算してく
		for (int even: evens) {
			evenSum += even;
		}
		
//		System.out.println(numbers.size());
		System.out.println(evens.size()); //偶数の配列サイズ
		System.out.println(evens); //配列を横並び表示
		System.out.println(evenSum); //偶数の和
	}
}
