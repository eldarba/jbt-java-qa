package d.flowControl.ifDemo;

import java.util.Scanner;

public class Tar2EvenOdd2 {
	/*
	 * get a number from user (input)
	 * 
	 * print if the number is even or odd
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int x = sc.nextInt();
		sc.close();

		// check if even or odd

		if (x % 2 == 0) {
			System.out.println("Even");
			System.out.println("Even");
			System.out.println("Even");
		} else {
			System.out.println("Odd");
			System.out.println("Odd");
			System.out.println("Odd");
		}
	}

}
