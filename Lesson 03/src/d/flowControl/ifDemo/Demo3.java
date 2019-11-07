package d.flowControl.ifDemo;

public class Demo3 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 11);
		System.out.println("grade is " + grade);

		if (grade <= 5) { // 0,1,2,3,4,5
			System.out.println("Fail");
		} else if (grade == 6) { // 6
			System.out.println("Maspik");
		} else if (grade <= 8) { // 7,8
			System.out.println("Good");
		} else { // 9,10
			System.out.println("Excelent");
		}

		System.out.println("\n-END-");
		System.out.println("aaa\nbbb");

	}

}
