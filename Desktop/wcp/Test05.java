package test;

public class Test05 {
	public static void main(String[] args) {
		String user_name = "admin";
		String passeord = "javaru";
		
		if (user_name.equals("admin") && passeord.equals("Javaru")) {
			System.out.println("ログイン");
		} else {
			System.out.println("ユーザー名かパスワードが間違っています");
		}
		
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
