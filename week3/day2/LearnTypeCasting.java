package week3.day2;

public class LearnTypeCasting {

	public static void main(String[] args) {
		String price ="$24,499"; // typecast to integer
		String formattedPrice = price.replaceAll("\\D", "");
		// Parses the string argument as a signed decimal integer.
		int numPrice = Integer.parseInt(formattedPrice);
		System.out.println(numPrice);
	}
}