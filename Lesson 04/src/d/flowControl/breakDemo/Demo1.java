package d.flowControl.breakDemo;

public class Demo1 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i == 17) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("end");
	}

}
