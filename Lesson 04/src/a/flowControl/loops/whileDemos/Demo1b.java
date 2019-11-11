package a.flowControl.loops.whileDemos;

public class Demo1b {

	/*
	 * print random numbers in the range 0 to 100 until a number that is a
	 * multiplication of 5 comes up.
	 */

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);

		while (x % 5 != 0) { // is x not divided by 5
			System.out.println(x);
			x = (int) (Math.random() * 101);
		}

		System.out.println("==============");
		System.out.println(x);

	}

}
