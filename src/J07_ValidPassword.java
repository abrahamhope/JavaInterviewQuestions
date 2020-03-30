import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class J07_ValidPassword {

    /*
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
     */

    public static boolean isPasswordValid(String password) {
        // create Strings for the required characters
        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";

        // set boolean values to check if password has the required characters
        boolean HasLower = password.matches(lowercase),
                HasUppere = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;
        // check if password has more than 6 characters and doesn't contain space
        if (password.length() >= 6 && !password.contains(" ")) {
            // check if all required characters exist in password and make valid=true
            if (HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;
        }
        return Valid;

    }


}
