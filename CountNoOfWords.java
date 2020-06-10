

public class CountNoOfWords {

	public int countWords(String str) {

		int count = wordCount(str);
		return count;

	}

	public static int wordCount(String str) {
		int count = 0;
		if (str.charAt(0) != ' ')
			;
		{ // this statement counts empty spaces
			count++; // it increments space count.
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;

			}
		}
		return count;

	}

}
