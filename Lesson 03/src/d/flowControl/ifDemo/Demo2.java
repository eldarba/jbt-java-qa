package d.flowControl.ifDemo;

public class Demo2 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 11);
		System.out.println(x);

		if (x > 5) {
			System.out.println("Big");
		} else {
			System.out.println("Small");
		}

	}
}
