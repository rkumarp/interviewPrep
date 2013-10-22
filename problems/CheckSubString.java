package problems;

public class CheckSubString {

	public static void main(String[] args) {
		String substring = "bat";
		String string = "abate";
		
		System.out.println(subStringCheck(string, substring));
	}
	
	public static String subStringCheck(String str, String sub) {
		String result = "Yes";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			count = 0;
			if(str.charAt(i) == sub.charAt(0) && (str.length() - i + 1 >= sub.length())) {
				count++;
				for(int j = 1; j < sub.length(); j++) {
					if(str.charAt(i + j) == sub.charAt(j)) {
						count++;
						if(count == sub.length())
							return "yes";
					}
					else
						break;
				}
			}
		}
		return result;
	}
}
