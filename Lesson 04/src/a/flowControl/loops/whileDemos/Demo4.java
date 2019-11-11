package a.flowControl.loops.whileDemos;

public class Demo4 {

	/*
	 * print the numbers 1 to 10
	 */

	public static void main(String[] args) {
		// create a counter and initialize to 1
		int c = 1;
		// define a while loop that prints the counter and increment it by 1
		while (c <= 10) {
			System.out.println(c++);
		}
	}

}
