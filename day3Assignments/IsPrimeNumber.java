package week1.day3Assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenNumber = 29;
		boolean isPrime = true;
		for (int i = 2; i < givenNumber; i++) {
			if (givenNumber % i == 0) {
				System.out.println("Given number " + givenNumber + " is not prime number");
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("Given number " + givenNumber + " is  prime number");

		}

	}

}
