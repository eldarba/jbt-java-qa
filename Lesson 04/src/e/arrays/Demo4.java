package e.arrays;

public class Demo4 {

	public static void main(String[] args) {
		/*
		 * create an array of 100 int elements in the range 0 - 100
		 * 
		 * print each element
		 * 
		 * print the sum
		 * 
		 * print the average
		 */

		// create an array of 50 int elements
		int[] numbers = new int[50];
		int sum = 0;

		// populate array with random values
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 101);
			sum += numbers[i];
			System.out.println(numbers[i]);
		}

		System.out.println("===========");
		System.out.println("sum: " + sum);
		System.out.println("avg: " + (double) sum / numbers.length);
	}

}
