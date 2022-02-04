
public class Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		
		int array[] = { 1, 2, 3, 4 }; 
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int num : array) {
			if (num % 2 == 0) {
				continue;
			}
			System.out.println(num);
		}
	}

}
