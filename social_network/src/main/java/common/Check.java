package common;

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

	public static boolean checkValidPassword(String password) {
        if (password.length() < 6) {
            return false; 
        }
        String PASSWORD_PATTERN = "^(?=.*[A-Za-z])(?=.*\\d).{6,}$";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

	public static boolean checkPasswordRecovery(String enteredAnswer, String hashedAnswer) {
		return BCrypt.checkpw(enteredAnswer, hashedAnswer);
	}

	public static boolean checkPassword(String enteredPassword, String hashedPassword) {
		return BCrypt.checkpw(enteredPassword, hashedPassword);
	}

	public static boolean checkValidDateOfBirth(int day, int month, int year) {

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month < 1 || month > 12)
			return false;

		if (year < 1900)
			return false;
		if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
			daysInMonth[1] = 29;

		return day >= 1 && day <= daysInMonth[month - 1];
	}

}
