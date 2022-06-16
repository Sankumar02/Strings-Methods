package com.Task_22_04_22;
//Write an efficient Java program that takes two strings as arguments and removes the characters 

public class RemoveCharacter {

	public void removeString(String firstSentence, String secondCharacter) {
		String result = new String(firstSentence);

		for (int index = 0; index < secondCharacter.length(); ++index)

		{

			String temp = Character.toString(secondCharacter.charAt(index));
			result = result.replaceAll(temp, "");

		}

		System.out.println(" Given firstSentence : " + firstSentence);
		System.out.println(" Given secondCharacter : " + secondCharacter);

		System.out.println("Sentence after removing the character " + result);
	}

}