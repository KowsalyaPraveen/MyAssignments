package week3.day3;

//the type HelperClassFinal cannot subclass the final class LearnFinalKeyword
//so changed  removed final from parent class 
public class HelperClassFinal extends LearnFinalKeyword {

	public void helperMethodOne() {
		// final field LearnFinalKeyword.browserName cannot be assigned
		// browserName="";
		System.out.println("Helper method 1 from helper class");

	}

//Cannot override the final method from LearnFinalKeyword
	// so changed to
	public final void helperMethodThree() {

		System.out.println("Helper method 3");
	}

	public static void main(String[] args) {
		// Need obj ref to access variable
		// browserName="";
		HelperClassFinal lfkObj = new HelperClassFinal();
		lfkObj.helperMethodOne();
		lfkObj.helperMethodTwo();
		lfkObj.helperMethodThree();

	}

}
