package week3.day1;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("Take Snap from Edge class");

	}

	public void clearCookies() {
		System.out.println("Clear Cookies from Edge class");

	}

	public static void main(String[] args) {

		Edge edgeObj = new Edge();
		System.out.println("BrowserName "+edgeObj.browserName);
		System.out.println("BrowserVersion "+edgeObj.browserVersion);

		// Calling superclass methods from base class
		edgeObj.openURL();
		
		edgeObj.takeSnap();
		edgeObj.clearCookies();
		
		// Calling superclass methods from base class
		edgeObj.closeBrowser();

	}

}