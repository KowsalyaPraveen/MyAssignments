package week1.day3;

public class LearnNestedForLoop {

	public static void main(String[] args) {

	// nested for loop means : there will be two for loops
		// 1)outer for loop
		// 2)inner for loop
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}