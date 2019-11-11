package a.flowControl.loops.whileDemos;

public class Demo1 {

	/*
	 * print random numbers in the range 0 to 100 until an odd number comes up.
	 */

	public static void main(String[] args) {
		int x = (int) (Math.random() * 101);

		while (x % 2 == 0) {
			System.out.println("even: " + x);
			x = (int) (Math.random() * 101);
		}

		System.out.println("==========");
		System.out.println("odd: " + x);

	}
	
	/*
	 * print random numbers in the range 0 to 100 until a number that is a multiplication of 5 comes up.
	 */

}
