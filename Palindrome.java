package com.Task_22_04_22;

import java.util.Scanner;

public class Palindrome {

	public void palindromeFinder() {
		int remainder, temporary;
		int sum = 0;

		Scanner scpalindrome = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scpalindrome.nextInt();

		temporary = number;

		while (number > 0) { // 20
			remainder = number % 10; // 0
			sum = (sum * 10) + remainder; // 0
			number = number / 10;
		}
		if (temporary == sum) {
			System.out.println("the entered number is palindrome");
		} else {
			System.out.println("the entered number is not a palindrome");
		}
	}
}
