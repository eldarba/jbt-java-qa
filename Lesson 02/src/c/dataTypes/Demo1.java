package c.dataTypes;

public class Demo1 {
	
	// 5 - literal value of type int (default)
	// 5.5 - literal value of type double (default)
	// to change default type of literals use:
	// D - double
	// F - float
	// L - long

	public static void main(String[] args) {
		// Integer Numerals
		byte n1 = 127;
		short n2 = 2;
		int n3 = 3;
		long n4 = 9999999999L;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);

		// Decimal Numerals
		float f1 = 6.5F; // 32 bit
		double f2 = 6.5; // 64 bit
		System.out.println(f1);
		System.out.println(f2);
		
		double x = 5D;
		
	}
}
