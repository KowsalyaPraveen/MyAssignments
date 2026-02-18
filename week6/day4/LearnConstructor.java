package week6.day4;

public class LearnConstructor {
	int a;// declaration // global 
	void printStatement() {
		System.out.println("Normal Method in Java");

	}
	
	// Special Method
    LearnConstructor() {
		a=10;
		System.out.println("Default constructor in Java : fixed value assigned is "+a);
	}
    LearnConstructor(int a){
    	this();
    	//when a local variable has the same name as an instance variable, 
    	//the local variable hides the instance variable.
    	this.a=a; //a=111
    	// local variable = user value is passed as argument
    	System.out.println("Parameterized constructor in java : user defined value is "+ this.a);
    }

	public static void main(String[] args) {
//		int b;// declaration
//		System.out.println(b);//The local variable b may not have been initialized

//		LearnConstructor lc =new LearnConstructor();
//		System.out.println(lc.a);// 0 or null //10
//		System.out.println(new LearnConstructor().a);//2 //10
		new LearnConstructor(111);
		
	}

}