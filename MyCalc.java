package week1.day1.assignments;

public class MyCalc {

	public static void main(String[] args) {


		CalcOperators calcObj = new CalcOperators();
		int a = calcObj.add(1, 2, 3);
		System.out.println("Addition value is: " + a);
		int s = calcObj.sub(1, 2);
		System.out.println("Subtraction value is: " + s);
		double m = calcObj.multi(1.95, 2.5);
		System.out.println("Addition value is: " + m);
		float d = calcObj.div(1596, 75);
		System.out.println("Addition value is: " + d);

	}

}
