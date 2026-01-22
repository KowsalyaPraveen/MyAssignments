package week1.day4;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenNumbers[] = { 2, 5, 7, 7, 5, 9, 2, 3 };
		Arrays.sort(givenNumbers);
		System.out.println("Given numbers are");
		for (int i = 0; i < givenNumbers.length; i++) {
			System.out.println(givenNumbers[i]);
		}
		System.out.println("Duplicates numbers are");
		for (int i = 0; i < givenNumbers.length; ++i) {	
			for (int j = i+1; j < givenNumbers.length; j++) {
				if (givenNumbers[i] == givenNumbers[j]) {		
					System.out.println(givenNumbers[i]);
				}
			}	
		}
	}

}
