package entities;

public class Palindrome {
	public static String word;
	
	public static boolean isPalidrome() {

		for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}	
		}
		return true;
	}
	
	public String toString() {
		if(isPalidrome() == true) {
			return word.toUpperCase() + ": IS PALINDROME";
		}else {
			return word.toUpperCase() + ": IS NOT PALINDROME";
		}
	}
	
	
}
