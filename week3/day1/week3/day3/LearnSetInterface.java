package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSetInterface {

	public static void main(String[] args) {

		String companyName = "google";

		// Converting string to char for iteration		
		char[] CompanyArr = companyName.toCharArray();
		
		// Initialize LinkedHash set to save only unique value
		Set<Character> companySet = new LinkedHashSet<Character>();

		for (Character companyChar : CompanyArr) {
			companySet.add(companyChar);
		}
		System.out.println("Company Name");
		System.out.println(companySet);
		
	}

}
