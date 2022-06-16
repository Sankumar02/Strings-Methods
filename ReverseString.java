package com.Task_22_04_22;

//Write a program to reverse a String in Java programming language. For example, 
//if a given input is "abcd," then your function should return "dcba"(Use Recursive method).

public class ReverseString {

	void reverseString(String string) {
		if ((string == null) || (string.length() <= 1))
			System.out.println("String is empty");
		else {
			System.out.print(string.charAt(string.length() - 1));
			reverseString(string.substring(0, string.length() - 1));
		}
	}
}