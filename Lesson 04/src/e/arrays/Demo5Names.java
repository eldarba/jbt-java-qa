package e.arrays;

public class Demo5Names {

	public static void main(String[] args) {

		// create an array of 3 String elements
		String[] names = new String[3];
		// populate with names
		names[0] = "Avi";
		names[1] = "Lea";
		names[2] = "Dan";

		// go over the array elements and print them
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
