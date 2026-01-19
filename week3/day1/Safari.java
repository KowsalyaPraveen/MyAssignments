package week3.day1;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("Reader Mode from Safari class");

	}

	public void fullScreenMode() {
		System.out.println("Full Screen Mode from Safari class");

	}

	public static void main(String[] args) {

		Safari safariObj = new Safari();
		System.out.println("BrowserName " + safariObj.browserName);
		System.out.println("BrowserVersion " + safariObj.browserVersion);

		// Calling superclass methods from base class
		safariObj.openURL();

		safariObj.readerMode();
		safariObj.fullScreenMode();

		// Calling superclass methods from base class
		safariObj.closeBrowser();

	}
}