package e.operators;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println(5 / 2);
		System.out.println(5 / 2D);

		// modulu %
		// modulu is the remainder of division

		System.out.println(10 / 3);
		System.out.println(10 % 3);

		// use of modulu
		// 1. check if a number can be divided by
		System.out.println(10 % 3 == 0);
		System.out.println(10 % 2 == 0);

		// 2. find right digit of a number
		System.out.println(123 % 10);
	}

}
