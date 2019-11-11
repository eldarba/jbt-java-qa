package a.flowControl.loops.whileDemos;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String systemPassword = "123";
		System.out.print("enter password: ");
		String input = sc.nextLine();
		
		while(!input.equals(systemPassword)) {
			System.out.print("wrong!!! enter password: ");
			input = sc.nextLine();
		}
		sc.close();
		
		System.out.println("Logged in");
	}
}
