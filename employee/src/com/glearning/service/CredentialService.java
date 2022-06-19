/**
 * 
 */
package com.glearning.service;

import java.util.Random;

/**
 * @author Aravind Samy
 *
 */
public class CredentialService {

	final String comp = ".abc.com";

	public String generatePassword() {

		String upperCaseLetters;
		String lowerCaseLetters;
		String symbolsandNumbers;
		String combinedChar;

		upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		symbolsandNumbers = "!@$&*()?/^+=-_.<>,1234567890";

		combinedChar = upperCaseLetters + lowerCaseLetters + symbolsandNumbers;

		Random random = new Random();
		StringBuilder password = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			int randomInt = random.nextInt(combinedChar.length());
			password.append(combinedChar.charAt(randomInt));

		}
		return password.toString();
	}

	public String generateEmailId(String fullName, String dept) {
		return fullName.toLowerCase() + "@" + dept + comp;
	}

	public void showCredentials(String name, String dept) {

		String email = generateEmailId(name, dept);
		String password = generatePassword();

		System.out.println("\n ------------------------------------------------------------------------------------------------ \n");
		System.out.println("\n Please find the employee credentials below : ");
		System.out.println("\n Employee Email ID : " + email);
		System.out.println(" Employee Password : " + password);
		System.out.println("\n ------------------------------------------------------------------------------------------------ \n");

	}
}
