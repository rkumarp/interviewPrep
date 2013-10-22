package problems;

public class Reversewords {
	
	public static void main(String[] args) {
		reversewords();
	}
	
	public static void reversewords() {
		StringBuffer str = new StringBuffer("I will do it");
		str = reverseString(str);
		int start = 0;
		int end = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				end = i;
				StringBuffer newStr = reverseString(new StringBuffer(str.substring(start, end)));
				if(start == 0){
					str = newStr.append(str.substring(end));
				}
				else {
					str = (new StringBuffer(str.substring(0, start))).append(newStr).append(new StringBuffer(str.substring(end)));
				}
				start = end + 1;
			}
		}
		System.out.println(str);
	}
	
	public static StringBuffer reverseString(StringBuffer str) {
		char temp;
		int size = str.length();
		for(int i = 0; i < size/2; i++) {
			temp = str.charAt(i);
			str.setCharAt(i, str.charAt(size - i - 1));
			str.setCharAt(size - i - 1, temp);
		}
		return str;
	}
}
