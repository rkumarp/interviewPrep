package problems;

public class stockmarket {

	public static void main(String[] args) {
		int[] array = {5, 3, 10, 2, 6, 4, 8, 10};
		
		int low = array[0];
		int profit = 0;
		for(int i = 1; i < array.length; i++) {
			if(array[i] < low)
				low = array[i];
			
			if(array[i] - low > profit)
				profit = array[i] - low;
		}
		
		System.out.println(profit);
	}
}
