import java.util.Random;

public class PrintTest {

	public static void main(String[] args) {
		
		String something = "something";
		System.out.println(something.getBytes());
		//String something = new String("something")
		
		String mySentence = "this is my new Sentence";
		
		CountNoOfWords cw = new CountNoOfWords();
		int check1 = cw.countWords(mySentence);
		System.out.println(check1);
		
				
				
				
				
				
				
				
		String stringReturn ="test";
		String newString = stringReturn.toUpperCase();
		System.out.println(newString);
		
		String myString = "Roshan";
		StringReverse sr = new StringReverse();
		sr.stringRevrs(myString);
		String checkString = sr.stringRevrs(myString);
		System.out.println(checkString);
		
		
		RemoveSpfchar rs = new RemoveSpfchar();
		//rs.removeChr();
		
		String string = "2423434343";		
		aNs3 checkdigits = new aNs3();
		boolean check = checkdigits.checkIfOnlyDigits(string);
		if(check == true)
			System.out.println("All Digits");
		else
			System.out.println("it has characters");
		
		
		
		
		Person person1 = new Person();

		Person person2 = new Person("roshan", 20000, "rosa@gmail", "dep", "0009");
		Person person3 = new Person();

		person1.setName("roshan");
		person2.setName("shubang");
		System.out.println(person1.getName());

		System.out.println(person2.getSalary());
		System.out.println(person3.getSalary());
		
		//createAFlag(44);
		//createAFlag(5);
		// call that method

		System.out.println(givepievalue() * 5 * 5);
		int mynum = 0;

		System.out.println(mynum);

		mynum = giveMeNumber();
		System.out.println(mynum);

		mynum = returnNewValue(10);

		System.out.println(mynum);

		// printFlag();
		// System.out.println(printFlag());

		/*
		 * int num =0;
		 * 
		 * for (int i = 1; i <= 100; i= i+2) { System.out.println(i); } for (int i = 0;
		 * i < 3; i=i+2) { for (int j = 0; j <5 ; j++) { System.out.print(num); }
		 * System.out.println(); num++; }
		 */
		// call that method

	}

	public static String createAFlag(int num) {
		String flag = "";
		for (int a = 0; a < 3; a++) {
			for (int i = 0; i < 4; i++) {
				flag = flag + "* * * * * * ==================================\n";
				flag = flag + " * * * * *  ==================================\n";
			}
			for (int i = 0; i < 6; i++) {
				flag = flag + "==============================================\n";
			}
		}
		return flag;
	}

	public static int giveMeNumber() {
		System.out.println("shubang");
		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		return rand_int1;
	}

	public static double givepievalue() {
		return 3.146567786696;
	}

	public static int returnNewValue(int num) {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(num);
		return rand_int1;
	}

}
