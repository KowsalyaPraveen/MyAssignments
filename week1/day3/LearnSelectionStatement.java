package week1.day3;

public class LearnSelectionStatement {

	public static void main(String[] args) {

		int a =18 ,b=80;
		// condition : whether a is greater or not , equal(a few conditions)
		
		// if(false)
		if (a>b) {
			System.out.println("A is greater than B");
		}else if (a==b) { //if(false)
			System.out.println("A is equals to B");
		}
		else {
			System.out.println("B is greater Than A");
		}
		
		boolean isPrimeSubscriptedAccount;
		// request --> DB --> response 
		isPrimeSubscriptedAccount =false;
		//if(false)
		if (isPrimeSubscriptedAccount) {
			System.out.println("Movie should start to play");
		}else {
			System.out.println("Prime Subscription window should open");
		}
		
		String browserType ="chrome";
		
		switch (browserType) {
		case "chrome":
			System.out.println("Testing environment is choosen as chrome");
			System.out.println("Chrome related configuration will starts to execute now");
			break;
		case "edge":
			System.out.println("Testing environment is choosen as edge");
			System.out.println("edge related configuration will starts to execute now");
			break;

		default:
			System.out.println("Please choose the right environment");
			break;
		}
	}

}