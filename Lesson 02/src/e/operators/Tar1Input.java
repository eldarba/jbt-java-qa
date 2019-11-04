package e.operators;

import java.util.Scanner;

public class Tar1Input {
	
	public static void main(String[] args) {
		// create an object to get input from keyboard
		Scanner sc = new Scanner(System.in);
		
		// prompt user for input
		System.out.print("enter a number: ");
		
		// get the input from user and put in variable x
		int x = sc.nextInt();
		
		// print the user inputs
		System.out.println(x);
		
		// close the scanner
		sc.close();
	}

}
