package week1.day1.assignments;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int calculated = 0, reminder=0, original=num;

		while (num > 0) {
			reminder = num % 10;
			num = num / 10;

			calculated = calculated + (reminder * reminder * reminder);
		}
		if (calculated == original) {
			System.out.println(+original + " is Armstrong number");
		} else {
			System.out.println(+original + " is not Armstrong number");
		}

	}

}
