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
		 * nextLine() is used instead of next in case the string is a multi-word string
		 * since the assignment did not specify
		 */

		System.out.println("Pleae enter the second string");
		string2 = scnr.nextLine();

		scnr.close();

		int totalString1 = 0;
		int totalString2 = 0;

		for (int i = 0; i < string1.length(); i++) {

			totalString1 += (int) string1.charAt(i);
		}

		for (int i = 0; i < string2.length(); i++) {

			totalString2 += (int) string2.charAt(i);
		}

		System.out.println(Math.abs(totalString1 - totalString2));
	}

}
