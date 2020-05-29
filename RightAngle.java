
public class RightAngle {

	public static void main(String[] args) {

		for (int j = 1; j <=7; j++) {
			for (int i = 1; i <= 7 - j; i++) {
				System.out.print(' ');
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("@");
			}
			for (int i = 1; i <= j-1; i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for (int j = 7; j >= 0; j--) {
			for (int i = 1; i <= 7 - j; i++) {
				System.out.print(' ');
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("@");
			}
			for (int i = 1; i <= j-1; i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		/*
		 for (int j = 7; j >= 0; j--) {
			for (int i = 1; i <= 7 - j; i++) {
				System.out.print(' ');
			}
			for (int i = 1; i <= j; i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		 */
	}

}
