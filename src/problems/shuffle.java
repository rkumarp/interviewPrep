package problems;


public class shuffle {

	public static void main(String[] args) {
		int[] a = {2, 4, 6, 7, 2, 9};
		for(int i = 0; i < a.length - 1; i++) {
			double rand = Math.random();
			System.out.println(rand);
			int j = (i + 1) + (int)(rand * (a.length - i - 1));
			System.out.println(j);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println(a);
	}
}
