package week1.day3;

public class LearnForLoop {

	public static void main(String[] args) {
		
	// Requirement is to print the number 1 to 10
		// Repetitive process
		// Segment no 1 : Initialization
		// Segment no 2 : Condition (true/false)
		// Segment no 3 : Iteration (call value 1st --> 1)
		// loop 11 : i =11; 11<=10(false)
		//  Initialization     Condition (true/false)  Iteration
		for (int i= 1 ;            i <=10      ;               i++) {
			System.out.println(i);
		}
		
	// Print only the even numbers between 1 to 10
		System.out.println("Print only the even numbers between 1 to 10");
		for (int i= 1 ;            i <=10      ;               i++) {
		//condition : even --> expression 
		//  remainder : %	--> 0
			if (i%2==0) {
				System.out.println(i);
			}
		}
	
		
		
		
		
	}

}