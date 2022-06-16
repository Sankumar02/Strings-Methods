package com.Class.org;

public class StringMethods {

	public static void main(String[] args) {
		String string = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

		int lenghtOfString = 0;

		int lenghtOfLetter = 0;

		int spaceCount = 0;

		Integer numberDigits = 0;

		int others = 0;

		System.out.println("The given String is:" + string);

		for (int i = 0; i < string.length(); i++) {
			// charAt(index) is method which returns the specified index in a string.
			// Here i used a condition called not equal to , to not consider the space for
			// count.

			if (string.charAt(i) != ' ')// to identify the length of the string, if there is string present

				lenghtOfString++;

			if (Character.isLetter(string.charAt(i)))// to identify the letters in the string, if there is word present

				lenghtOfLetter++;

			if (Character.isSpaceChar(string.charAt(i)))// to identify the spaces in the string , if there is space
														// present

				spaceCount++;

			if (Character.isDigit(string.charAt(i)))// to identify the digit in the string , if there is digit present
				numberDigits++;

			if (!Character.isDigit(string.charAt(i)) && !Character.isLetter(string.charAt(i))
					&& !Character.isSpaceChar(string.charAt(i)))
				// to identify the special characters in a given string.

				others++;

		}

		System.out.println("\nLenght of the given String is :" + lenghtOfString);

		System.out.println("\nLength of the Letters count is :" + lenghtOfLetter);

		System.out.println("\nSpace count is :" + spaceCount);

		System.out.println("\nLength of the Digits count is :" + numberDigits);

		System.out.println("\nOthers count :" + others);

	}

}