package d.flowControl.ifDemo;

public class Tar1Weather2 {

	public static void main(String[] args) {
		int temp = (int) (Math.random() * 101) - 50;
		System.out.println("temperature: " + temp);

		if (temp >= 0 && temp < 10) {
			System.out.println("קר");
		} else if (temp >= 10 && temp <= 20) {
			System.out.println("קריר");
		} else if (temp >= 21 && temp <= 26) {
			System.out.println("נעים");
		} else if (temp >= 27 && temp <= 30) {
			System.out.println("חם");
		} else if (temp >= 31 && temp <= 40) {
			System.out.println("חמסין");
		} else {
			System.out.println(temp + " out of range");
		}

	}

}
