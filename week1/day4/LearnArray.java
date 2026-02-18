package week1.day4;

import java.util.Arrays;

public class LearnArray {
	// bubble sorting
	// if(arr[i]>arr[i+1]){
	// int temp=arr[i];
	// arr[i]=arr[i+1];
	// arr[i+1]=temp; }
	public static void main(String[] args) {

		// 1st way : Literal
		// syntax : datatype identifierName[] = {value1,value2,value3,value4};
		int empID[] = { 8764, 2314, 456, 5783 };
		System.out.println(empID.length);// 4
		System.out.println(empID[empID.length - 1]);// java.lang.ArrayIndexOutOfBoundsException // 5783
		// sorting the array in the ascending order
		Arrays.sort(empID);
		// print all the values inside the array
		System.out.println("print all the values inside the array");
		// i=0; 0<4(true); 0++
		for (int i = 0; i < empID.length; i++) {
			System.out.println(empID[i]);
		}
		// Requirement : Print the Largest value from the array[array.length-1]
		System.out.println("Print the Largest value from the array");
		System.out.println(empID[empID.length - 1]);
		// Requirement : Print the smallest value from the array [0]
		System.out.println("Print the smallest value from the array");
		System.out.println(empID[0]);

		// 2nd way : Instantiation way
		// Syntax : datatype identifierName[]= new datatype[size];

		int empNo[] = new int[4]; // fixed the size of the array
		empNo[0] = 234;
		empNo[1] = 555;
		empNo[2] = 987;
		empNo[3] = 234;

		for (int i = 0; i < empNo.length; i++) {
			for (int j = i + 1; j < empNo.length; j++) {
				// sorting using bubble algorithm
				if (empNo[i] > empNo[j]) {
					int temp = empNo[i];
					empNo[i] = empNo[j];
					empNo[j] = temp;
				}
			}
		}
		System.out.println(empNo[3]);
	}

}