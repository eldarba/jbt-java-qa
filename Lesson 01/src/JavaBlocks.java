/*
this is a multi line comment
line 2
line 3
line 4
*/
public class JavaBlocks {

	// main method
	public static void main(String[] args) {
		
		// g belongs to the entire scope of main method
		int g = 10;
		System.out.println(g);

		// block 1
		{
			// num1 belongs to the scope1 only
			int num1 = 5;
			System.out.println(num1);
			System.out.println(g);
		}

		// block 2
		{
			int num1 = 4;
			System.out.println(num1);
			System.out.println(g);

		}

	}

}
