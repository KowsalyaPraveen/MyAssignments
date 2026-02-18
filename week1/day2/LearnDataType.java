package week1.day2;

public class LearnDataType {
	/*
	 * how to create to variable ?
	 * Syntax : 
	 * 			datatype identifierName;  --> Declaration
	 *        	identifierName = value; --> Initialization
	 *        
	 * Syntax : Declaration & Initialization in a sigle statement
	 * 		    datatype identifierName = value;
	 *        
	 * whenever we need to assign a value in java we have to use
	 * "=" assignment operator
	 */

	public static void main(String[] args) {
	// Value(employee details) in the company portal
	// Age of the employee--> age 18-60, human age range 0-120
	byte ageOfEmployee;    // datatype identifierName;
	ageOfEmployee = 35;    //identifierName = value;
	System.out.println(ageOfEmployee);
	// pay role Of Employement
	boolean  roleOfEmployement = false; // datatype identifierName = value;
	// salary per month for the intern
	short salaryOfIntern = 20000;
	// salary per month for the permanent employee
	int  salaryOfPermanentStaff= 80000;
	// contact no of the employee without country code 
	// 10 digits --> 9909089883
	long phoneNumber =9909089883l;
	// Initial  
	char InitialOfEmployee ='M';
	// Employee Experience 
	float  totalExperienceOfEmployee = 10.14f;
	// Decimal number 
	double  num = 676.88989897978;
	// name of the employee
	String name ="Bhuvanesh";
	System.out.println(roleOfEmployement+"\n"+salaryOfIntern+"\n"+
	salaryOfPermanentStaff+"\n"+phoneNumber+"\n"+InitialOfEmployee+"\n"+name+"\n"+totalExperienceOfEmployee+"\n"+num);

	}
}