package week3.day3;

public class HelperClassStatic extends LearnStaticKeyword {

	// this instance method cannot override the static method from
	// LearnStaticKeyword
	// static method cannot be overridde, so created new method
	public void helperMethod() {
		System.out.println("helper method");
		System.out.println(browserName);
	}

	public static void main(String[] args) {

		HelperClassStatic helperObj = new HelperClassStatic();
		helperObj.nonstaticMethod();
		browserName = "browser name changed- helper";
		staticMethod();
		helperObj.helperMethod();

	}

}
