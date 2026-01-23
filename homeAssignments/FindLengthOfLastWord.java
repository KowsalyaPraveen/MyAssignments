package assignments;

public class FindLengthOfLastWord {

	public static void main(String[] args) {
		String sentence1= "Hello World";
		String sentence2 = "fly me to the moon";
		String sentence3 = "luffy is still joyboy";
		System.out.println("Given sentence: "+ sentence3);

		String[] wordsArray = sentence3.split(" ");
		int length = wordsArray.length;
		System.out.println("The length of word is:" + length);

		for (int i = 0; i < wordsArray.length; i++) {
			if (i == length - 1) {
				int lastWordLength = wordsArray[i].length();
				System.out.println("Last word "+wordsArray[i] + " has " + lastWordLength +" characters");
			}

		}

	}

}
