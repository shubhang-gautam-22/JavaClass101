

public class aNs3 {

	public boolean checkIfOnlyDigits(String firstString) {

		boolean condition = true;
		for (int i = 0; i < firstString.length(); i++) {

			if (!Character.isDigit(firstString.charAt(i))) {
				condition = false;
				break;
			}
		}
		if (condition == true) {
			return true;
		} else {
			return false;

		}
	}
}