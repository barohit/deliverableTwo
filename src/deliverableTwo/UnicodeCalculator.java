package deliverableTwo;

import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String string1 = "";
		String string2 = "";

		System.out.println("Please enter the first string");
		string1 = scnr.next();

		System.out.println("Pleae enter the second string");
		string2 = scnr.next();

		scnr.close();

		int total1 = 0;
		int total2 = 0;

		for (int i = 0; i < string1.length(); i++) {

			total1 += (int) string1.charAt(i);
		}

		for (int i = 0; i < string2.length(); i++) {

			total2 += (int) string2.charAt(i);
		}

		System.out.println(total1); // delete later
		System.out.println(total2); // delete later

		System.out.println(Math.abs(total1 - total2));
	}

}
