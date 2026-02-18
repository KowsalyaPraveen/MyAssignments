package week1.day4;

public class LearnStringClass {

	public static void main(String[] args) {
		// 1 ST WAY : Literal
		String name = "Testleaf";
		// 2 nd WAY : Instantiation
		String s = new String("TestLeaf");
		// name==s // it will check memory reference instead of value
		// .equals() --> it will check the value with the case sensitivity
		if (name.equalsIgnoreCase(s)) { // it will check value without case sensitivity
			System.out.println("Both the variable are same");
		} else {
			System.out.println("Both the variables holds different value");
		}
		// contains() --> it will check the partial values but in the sequential order
		// with the case sensitivity
		// partially check the "leaf" value from the variable
		if (s.contains("leaf")) {
			System.out.println("the match is avaiable");
		} else {
			System.out.println("the match is not avaiable");
		}

		char[] letter = name.toCharArray();
		for (int i = 0; i < letter.length; i++) {
			System.out.println(letter[i]);
			if (letter[i] == 's') {
				System.out.println("the character found the match here");
			}
		}
		// charAt() --> Returns the char value at thespecified index
		char charAt = name.charAt(4);
		System.out.println(charAt);
		//split() -->  Splits this string around matches of the given as delimiter
		String[] split = name.split("t");
		System.out.println(split[0]);
		System.out.println(split[1]);
		// replace() --> Returns a string resulting from replacing all occurrences of
		// oldChar in this string with newChar
		String replace = name.replace("es", "ES");
		System.out.println(replace);

		// SubString() -> Thesubstring begins with the character at the specified index
		// andextends to the end of this string
		String substring = name.substring(4);
		System.out.println(substring.toUpperCase());

	}

}