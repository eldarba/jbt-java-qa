package e.flowControl.whileLoop;

import java.util.Scanner;

public class Tar1 {

	public static void main(String[] args) {
		/* get 5 numbers from user and print the sum */

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int c = 0; // counter

		while (c < 5) {
			// get a number from user
			System.out.println("enter a number");
			int x = sc.nextInt();
			// add that number to the sum variable
			sum += x; // sum = sum + x;
			c++; // c = c + 1;
		}
		sc.close();

		// print the sum
		System.out.println("sum = " + sum);
	}

}
