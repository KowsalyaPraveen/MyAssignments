package week3.day3;

public  class LearnStaticKeyword {
	static int number=1;
	static String browserName="static browser initial - edge";
	
	
	static {
		System.out.println("static block");
		System.out.println(number);
		System.out.println(browserName);
	}
	{
		System.out.println("Non static block");
		int b = 2;
		String browserName2 = "static browser chrome";
		System.out.println(b);
		System.out.println(browserName2);
	}
	public void nonstaticMethod() {
		System.out.println("non static method");
	}
	 static void staticMethod() {
		System.out.println("static method");
		System.out.println(browserName);
	}
	
	public static void main(String[] args) {
		
		LearnStaticKeyword lskObj=new LearnStaticKeyword();
		lskObj.nonstaticMethod();	
		browserName="static browser name changed";
		staticMethod();
	}

}
