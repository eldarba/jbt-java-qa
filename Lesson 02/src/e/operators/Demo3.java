package e.operators;

public class Demo3 {
	
	public static void main(String[] args) {
		
		System.out.println(5 < 5);
		System.out.println(5 > 5);
		System.out.println(5 == 5);
		System.out.println(5 != 5);
		
		int age = 11;
		boolean legalAge = age >=18 && age <= 95 ;
		System.out.print("age: ");
		System.out.print(age);
		System.out.print(" legal? : ");
		System.out.println(legalAge);
		
		boolean illegalAge = age < 18 || age > 95;
		System.out.print("Ilegal? : ");
		System.out.println(illegalAge);
	}

}
