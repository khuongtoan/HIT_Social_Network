package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mindrot.jbcrypt.BCrypt;

import common.ValidateContant;

public class Check {

	public static boolean checkValidEmail(String email) {
		String EMAIL_PATTERN = ValidateContant.EMAIL_PATTERN;
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean checkValidPhoneNumber(String phoneNumber) {
		String PHONE_NUMBER_PATTERN = ValidateContant.PHONE_NUMBER_PATTERN;
		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

	public static boolean checkPasswordRecovery(String enteredAnswer, String hashedAnswer) {
		return BCrypt.checkpw(enteredAnswer, hashedAnswer);
	}

	public static boolean checkPassword(String enteredPassword, String hashedPassword) {
		return BCrypt.checkpw(enteredPassword, hashedPassword);
	}

}
