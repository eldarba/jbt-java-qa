package a.flowControl.loops.whileDemos;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String systemPassword = "123"; // this is the secret password
		System.out.print("enter password: ");
		String userInput = sc.nextLine(); // this is the user entered password

		while (!userInput.equals(systemPassword)) {
			System.out.print("wrong!!! enter password: ");
			userInput = sc.nextLine();
		}
		sc.close();

		System.out.println("Logged in");
	}
}
