package week3.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// create a new set collection'
		// A collection that contains no duplicate elements
		Set<String> mentorsSet;
		// HashSet Will always retrieve the value from the collection in random order
		mentorsSet= new HashSet<String>();
		mentorsSet.add("Vineeth");//0
		mentorsSet.add("Seenivasan");//1
		mentorsSet.add("Anburaj");//2
		mentorsSet.add("Harrish");//3
		mentorsSet.add("Vineeth");// 4
		mentorsSet.add("Bhuvanesh");// 5
		mentorsSet.add("    ");//6
		// segment no 1 --> local variable :  mentorsName
		//     segment no 2 --> Collection Name : mentorsSet
		for (String mentorsName : mentorsSet) {
			System.out.println(mentorsName);
		}
		System.out.println(mentorsSet.size());
		System.out.println("**********LinkedHashSet*************");
		// Requirement is to mimic the source arrangement order - LinkedHashSet
		Set<String> insertionOrder = new LinkedHashSet<String>();
		insertionOrder.add("Vineeth");//0
		insertionOrder.add("Seenivasan");//1
		insertionOrder.add("anburaj");//2
		insertionOrder.add("Harrish");//3
		insertionOrder.add("Vineeth");// 4
		insertionOrder.add("Bhuvanesh");// 5
		insertionOrder.add("    ");//6
		for (String sourceOrder : insertionOrder) {
			System.out.println(sourceOrder);
		}
		System.out.println("**********TreeSet*************");
		// Requirement is to values in sorted order - TreeSet
		Set<String> sortedOrder = new TreeSet<String>(insertionOrder);
		for (String asciiOrder : sortedOrder) {
			System.out.println(asciiOrder);
		}
		
		
		

		
		
	}

}