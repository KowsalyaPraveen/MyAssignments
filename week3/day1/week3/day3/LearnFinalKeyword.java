package week3.day3;

public  class LearnFinalKeyword {
	// initializatioin req for final
	final String browserName = "browser";

	public void helperMethodOne() {
		// final field LearnFinalKeyword.browserName cannot be assigned
		// browserName="";
		System.out.println("Helper method 1");

	}

	public final void helperMethodTwo() {

		System.out.println("Helper method 2");
	}

	

	public static void main(String[] args) {
		// Need obj ref to access variable
		// browserName="";
		LearnFinalKeyword lfkObj = new LearnFinalKeyword();
		lfkObj.helperMethodOne();
		lfkObj.helperMethodTwo();

	}

}
