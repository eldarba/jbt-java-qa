package d.flowControl.breakDemo;

import java.util.Scanner;

public class Demo2Pass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String systemPassword = "123"; // this is the secret password
		String userInput = "";
		int c = 0;
		boolean success = true;

		do {
			if (c > 2) {
				success = false;
				break;
			}
			System.out.print("enter password: ");
			userInput = sc.nextLine();
			c++;
		} while (!userInput.equals(systemPassword));

		sc.close();

		if (success) {
			System.out.println("Logged in");
		} else {
			System.out.println("Logged in failed");
		}
	}

}
