package b.flowControl.loops.forDemos;

public class Demo6Kefel {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}

		System.out.println("and he said \"good night\" and left");
	}
}

/*
 * The character '\t' is an escape character for a tab
 * 
 * The character '\"' is an escape character for "
 * 
 * The character '\n' is an escape character for new line
 */
