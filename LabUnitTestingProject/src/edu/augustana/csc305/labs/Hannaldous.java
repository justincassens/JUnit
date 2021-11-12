package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {

	/**
	 * Counts the number of invalid passwords from a list. A password is "invalid"
	 * if it is shorter than the wordLength or all characters are letters.
	 * 
	 * @param wordLength - minimum password length
	 * @param arr        - array of passwords being checked
	 * @return count - number of invalid passwords from the array
	 */
	public static int numBadPasswords(int wordLength, String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			// checks if password is too short or all letter characters
			if (arr[i].length() < wordLength || CheckCharacter(arr[i]).equals("y"))
				count++;
		}
		return count;
	}

	// checks if the password is all letter characters
	static String CheckCharacter(String password) {
		int i = -1;
		// checks all characters in the string
		while (i++ < password.length() - 1) {
			char ch = password.charAt(i);
			if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'))
				return "n";// at least one character in the string is not a letter
		}
		return "y";// all characters are letters
	}

	public static void main(String[] args) {

		System.out.println(CheckCharacter("bigmoose$"));
		System.out.println(CheckCharacter("emusareawesome"));
		System.out.println(CheckCharacter("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(numBadPasswords(8, passwords));
	}

}