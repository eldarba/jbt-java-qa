package e.operators;

import java.util.Scanner;

public class Tar1Input2 {
	
	public static void main(String[] args) {
		
		// create a scanner
		Scanner sc = new Scanner(System.in);
		
		// get 2 numbers from user
		int a, b, sum;
		System.out.println("enter 1st number");
		a = sc.nextInt();
		System.out.println("enter 2nd number");
		b = sc.nextInt();
		
		// calculate the sum
		sum = a + b;
		
		// print the sum
		System.out.println(sum);
		
		// close the scanner
		sc.close();
		
		
		
	}

}
