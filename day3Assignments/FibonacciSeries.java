package week1.day3Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print Fibonacci Series

		int inputRange = 8;
		int sum = 0;
		int number1 = 0;
		int number2 = 1;
		if (inputRange < 1) {
			System.out.println("Input Range is Invalid");
		}
		System.out.println("Fibonacci series for the input Range "+inputRange );
		for (int i = 1; i <= inputRange; i++) {
			System.out.println(number1);
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
		}

	}

}
