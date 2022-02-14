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
	}
}
