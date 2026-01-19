package week3.day1;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("Open incognito from chrome class");
	}

	public void clearCache() {
		System.out.println("Clear Cache from chrome class");

	}

	public static void main(String[] args) {

		Chrome chromeObj = new Chrome();
		System.out.println("BrowserName " + chromeObj.browserName);
		System.out.println("BrowserVersion " + chromeObj.browserVersion);

		// Calling superclass methods from base class
		chromeObj.openURL();

		chromeObj.openIncognito();
		chromeObj.clearCache();

		// Calling superclass methods from base class
		chromeObj.closeBrowser();

	}

}
