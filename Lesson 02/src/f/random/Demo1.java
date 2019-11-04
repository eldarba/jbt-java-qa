package f.random;

public class Demo1 {

	public static void main(String[] args) {

		double r = Math.random();
		System.out.println(r);
		System.out.println(r * 11);
		System.out.println((int)(r * 11));
		System.out.println("===============");
		
		// a random number in the range 0 to 10 inclusive
		int x = (int) (Math.random()*11);
		System.out.println(x);
		
	}

}
