package problems;

public class ATOI {
	
	public static void main(String[] args) {
		atoi();
	}
	
	public static void atoi() {
		String temp = "12345";
		int value = 0;
		for(int i = 0; i < temp.length(); i++) {
			value *= 10;
			value += temp.charAt(i) - '0';
			System.out.println(value);
		}
	}
}
