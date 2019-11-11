package c.flowControl.loops.doWhile;

import java.util.Scanner;

public class Demo2Pass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String systemPassword = "123"; // this is the secret password
		String userInput = "";

		do {
			System.out.print("enter password: ");
			userInput = sc.nextLine();
		} while (!userInput.equals(systemPassword));

		sc.close();

		System.out.println("Logged in");
	}

}
