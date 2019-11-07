package b.casting;

public class Demo1 {

	public static void main(String[] args) {

		// cast from double to int
		System.out.println(4.3);
		System.out.println((int) 4.3);

		{
			// implicit cast from byte to int
			byte x = 5;
			int y = x;
		}

		{

			// explicit cast from byte to int
			int x = 5;
			byte y = (byte)x;
			System.out.println(y);
		}

	}

}
