package deliverableTwo;

import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String string1 = "";
		String string2 = "";

		System.out.println("Please enter the first string");
		string1 = scnr.nextLine();

		/*
		 * nextLine() is used instead of next in case either string is a multi-word
		 * string because the assignment did not specify. It said convert to the unicode
		 * character for each letter in each word, but did not state whether or not this
		 * means each word in each string, or each of only two words, one for the first
		 * string and one for the second.
		 */

		System.out.println("Pleae enter the second string");
		string2 = scnr.nextLine();

		scnr.close();

		int totalString1 = 0;
		int totalString2 = 0;

		for (int i = 0; i < string1.length(); i++) {

			System.out.println(string1.charAt(i) + ": " + (int) string1.charAt(i));
			totalString1 += (int) string1.charAt(i);
		}

		for (int i = 0; i < string2.length(); i++) {

			System.out.println(string2.charAt(i) + ": " + (int) string2.charAt(i));
			totalString2 += (int) string2.charAt(i);
		}

		System.out.println(Math.abs(totalString1 - totalString2));
	}

}
