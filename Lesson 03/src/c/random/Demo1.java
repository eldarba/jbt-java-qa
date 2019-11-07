package c.random;

public class Demo1 {

	public static void main(String[] args) {

		// 0 to 100
		int r1 = (int) (Math.random() * 101);
		System.out.println(r1);

		// 10 to 20
		int r2 = (int) (Math.random() * 11) + 10;
		System.out.println(r2);

		// -10 to 10
		int r3 = (int) (Math.random() * 21) - 10;
		System.out.println(r3);

		// we can use it in a formula a to b when a is smaller
		int a, b;
		a = 3;
		b = 5;
		int r = (int) (Math.random() * (b - a + 1)) + a;
		System.out.println(r);
	}

}