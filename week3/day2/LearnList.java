package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		// syntax :  Interface<GenericType> nameOfList;
		//  nameOfList = new ImplementationClass<GenericType>(); 
		List<String> mentorsList;
		mentorsList = new ArrayList<String>();
		// Requirement to add the mentors name to the list 
		// {"Harrish","Seenivasan","Vineeth","Anburaj"}
		// add()
		mentorsList.add("Vineeth");//0
		mentorsList.add("Seenivasan");//1
		mentorsList.add("Anburaj");//2
		mentorsList.add("Harrish");//3
		mentorsList.add("Vineeth");// 4
		mentorsList.add("Bhuvanesh");// 5
		// size() - Returns the number of elements in this list.
		// remove() - Removes the first occurrence of the specified element 
		//            from this list,if it is present 
		mentorsList.remove("Vineeth");
		int size = mentorsList.size();
		System.out.println(size);//5
		// get() - Returns the element at the specified position in this list.
		System.out.println(mentorsList.get(0));
		// verification and validation
		// contains() - Returns true if this list contains the specified element
		boolean contains = mentorsList.contains("Bhuvanesh");
		System.out.println("Validate the main mentor name in the list : "+contains);
		// clear() - The list will be empty after this call 
		//mentorsList.clear();
		// sort the list 
		Collections.sort(mentorsList);
		System.out.println("printing all values after the sorting operation");
		// forEach() -  given action for each element of the Iterable until all elements have been processed 
		mentorsList.forEach(System.out::println);
		int updatedSize = mentorsList.size();
		System.out.println(updatedSize);//0
		System.out.println("printing all the values inside the list");
		List<String> asList = Arrays.asList("Harrish","Seenivasan","Vineeth","Anburaj");
		for (int i = 0; i < asList.size(); i++) {
			System.out.println(asList.get(i));
		}
		List<String> newMentorList = new ArrayList<String>();
		// addAll() - Appends all of the elements in the specified collection 
		//            to the end ofthis list
		newMentorList.addAll(asList);
	}
}