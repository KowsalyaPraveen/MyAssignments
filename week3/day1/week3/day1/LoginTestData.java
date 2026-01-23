package week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUserName(String username) {
		System.out.println("Enter username from LoginTestData class " + username);
	}

	public void enterPassword(String password) {
		System.out.println("Enter Password from LoginTestData class "+ password);

	}

	public static void main(String[] args) {

		LoginTestData loginObj = new LoginTestData();
		loginObj.enterUserName("kowsalya");
		loginObj.enterPassword("123");
		loginObj.enterCredentials("kowsalya", "123");
	}

}