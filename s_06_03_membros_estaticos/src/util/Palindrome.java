package util;

public class Palindrome {

	public static boolean isPalindorme(String word) {
		for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
