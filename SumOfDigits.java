package week1.day1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 325689;
		int sum = 0;
		int rem = 0;
		int q = 0;
		while (num != 0) {

			rem = num % 10;
			q = num / 10;
			System.out.println(q + " is quotient.");
			System.out.println(rem + " is reminder.");
			System.out.println("************");
			sum = sum + rem;
			num = q;
		}
		System.out.println("************");
		System.out.println(sum + " is the Sum of Digits.");


	}

}
