package com.Task_22_04_22;

public class CharacterRemover {

	public static void main(String[] args) {
		RemoveCharacter task = new RemoveCharacter();
		String firstSentence = "India is great";
		String secondCharacter = "an";
		firstSentence = firstSentence.toLowerCase();
		secondCharacter = secondCharacter.toLowerCase();
		task.removeString(firstSentence, secondCharacter);
	}

}