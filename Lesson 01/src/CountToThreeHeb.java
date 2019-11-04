
// There is one class
// the class contains many methods
// each method has lines of code
// the main method lines are executed one by one
public class CountToThreeHeb {

	// main method
	public static void main(String[] args) {
		System.out.println("אחת");
		System.out.println("שתיים");
		System.out.println("שלוש");

		int twoNumbersSum = sum(35, 22);
		System.out.println(twoNumbersSum);

	}

	// method
	// public - method can be used from outside of this class
	// static - method belong to class (not object)
	// int - the return type of this method
	// sum - method identifier (name)
	// (int a, int b) - method parameters
	/**
	 * this method returns the sum of 2 integers
	 * 
	 * @param a
	 *            the first integer
	 * @param b
	 *            the second integer
	 * @return the sum of a and b
	 * 
	 */
	public static int sum(int a, int b) {
		int x = a + b;
		return x;
	}
}
