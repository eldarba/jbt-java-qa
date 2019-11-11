package a.flowControl.loops.whileDemos;

public class Demo5 {

	/*
	 * print the even numbers 16 to 28
	 */

	public static void main(String[] args) {
		// create a counter and initialize to 16
		int myCounter = 16;
		// define a while loop that prints the counter and increment it by 2
		while (myCounter <= 28) {
			System.out.println(myCounter);
			myCounter += 2; // myCounter = myCounter + 2;
		}

		int c = 5;
		c = c + 1; // add 1
		c += 1; // add 1
		c++; // add 1

		c = c - 1; // minus 1
		c -= 1; // minus 1
		c--; // minus 1
	}

}
