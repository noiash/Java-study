package test;

public class Test03 {
	public static void main(String[] args) {
		String student_name = "田中";
		int japanese_score = 15;
		int mathematical_score = 10;
		
		double average_score = (japanese_score + mathematical_score) / 2.0;
		
		System.out.println(student_name + "さんの国語の点数は" + japanese_score + "点です。");
		
		System.out.println(student_name + "さんの数学の点数は" + mathematical_score + "点です。");
		
		System.out.println(student_name + "さんの平均点は" + average_score + "点です。");
		
		if (average_score >= 80) {
			System.out.println("高得点！おめでとう。");
		} else if (average_score >= 65) {
			System.out.println("もう少しで高得点。");
		} else if (average_score >= 35) {
			System.out.println("もう少し頑張りましょう。");
		} else {
			System.out.println("追試です。");
		}
	}
}
