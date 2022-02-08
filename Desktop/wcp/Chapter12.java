package practice;

public class Chapter12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CapsuleMan human1 = new CapsuleMan("小林", 32);
		System.out.println("名前は" + human1.getName() + "です。");
		System.out.println("年齢は" + human1.getAge() + "です。");
		human1.setAge(33);
		System.out.println("誕生日を迎えたので、年齢が" + human1.getAge() + "になりました。");
	}

}
