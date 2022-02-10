package extend.phone;

public interface Phone {
	int MAX_NUMBER_DIGITS = 5;
	
	void call(String number);
	
	default void powerOff() {
		System.out.println("電源を切ります。");
	}
}
