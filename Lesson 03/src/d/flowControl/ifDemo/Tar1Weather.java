package d.flowControl.ifDemo;

public class Tar1Weather {

	public static void main(String[] args) {

		int temp = (int) (Math.random() * 41);
		System.out.println("temperature: " + temp);

		if (temp < 10) {
			System.out.println("קר");
		} else if (temp <= 20) {
			System.out.println("קריר");
		} else if (temp <= 26) {
			System.out.println("נעים");
		} else if (temp <= 30) {
			System.out.println("חם");
		} else {
			System.out.println("חמסין");
		}

	}

}
