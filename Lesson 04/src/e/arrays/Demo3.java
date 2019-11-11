package e.arrays;

public class Demo3 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		for (int i = 0; i < 3; i++) {
			arr[i] = (i + 1) * 100;
			System.out.println(arr[i]);
		}

		System.out.println("number of elements: " + arr.length);

	}

}
