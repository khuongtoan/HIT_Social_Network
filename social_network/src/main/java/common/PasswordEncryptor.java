
package common;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncryptor {

	public static String hashPassword(String value) {
		String salt = BCrypt.gensalt();
		String hashedValue = BCrypt.hashpw(value, salt);

		return hashedValue;
	}

}
