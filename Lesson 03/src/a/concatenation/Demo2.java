package a.concatenation;

public class Demo2 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);

		System.out.println(a);
		System.out.println(b);
		
		
		String msg1 = a + " + " + b + " = " + (a + b);
		System.out.println(msg1);
		
		String msg2 = a + " plus " + b + " equals " + (a + b);
		System.out.println(msg2);

		String msg3 = a + " * " + b + " = " + (a * b);
		System.out.println(msg3);
	}

}
