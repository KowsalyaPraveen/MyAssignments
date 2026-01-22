package week1.day3Assignments;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber = 121, reversedNumber = 0, remainder = 0;

		for (int num = givenNumber; num > 0; num = num / 10) {
			remainder = num % 10;
			reversedNumber = reversedNumber * 10 + remainder;
		}
		if (reversedNumber == givenNumber) {
			System.out.println("Given number " + givenNumber + " is Palindrome");
		} else {
			System.out.println("Given number " + givenNumber + " is not Palindrome");
		}
	}

}
