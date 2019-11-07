package c.random;

public class Targil {

	/*
	 * צרו חמישה מספרים אקראיים בתחום אפס ל מאה,
	 * 
	 * הדפיסו אותם,
	 * 
	 * את סכומם
	 * 
	 * ואת הממוצע
	 */

	public static void main(String[] args) {

		// declare 5 int variables
		int a, b, c, d, e;

		// initialize each of the variables with a random value
		a = (int) (Math.random() * 101);
		b = (int) (Math.random() * 101);
		c = (int) (Math.random() * 101);
		d = (int) (Math.random() * 101);
		e = (int) (Math.random() * 101);

		// print the variables
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);

		// calculate and print sum
		int sum = a + b + c + d + e;
		System.out.println("Sum = " + sum);
		
		// calculate and print average
		double avg = sum / 5D;
		System.out.println("Average = " + avg);

	}

}
