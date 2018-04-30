package a1.assignment6.acadgild.com.assignment61;

import android.text.Editable;
import android.text.TextWatcher;

import java.util.regex.Pattern;

public class PasswordValidator implements TextWatcher {

    //[^0-9]*[12]?[0-9]{1,2}[^0-9]*
//    This is a variable for the pattern for Password so itll know whats allowed and not allowed
//    as a password.
//    Requirements can contain letters and numbers must be at least 1 character long
//    Minimum. Maximum of 12 characters Doesnt allow symbols
    public static final Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z1-9+]{1,12}");

    //  Boolean value of is valid to see if its a valid password that was entered used in a method
    private boolean isValid = false;

    //    Method to return the valid boolean variable.
    private boolean isValid(){
        return isValid;
    }

//    Have no use for it
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }
// Have no use for it but its here
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
//  Test the information entered
    @Override
    public void afterTextChanged(Editable s) {
        isValid =  isValidPassword(s);
    }
    //    Method to test if the string entered is correct or not returns boolean value
    public static boolean isValidPassword(CharSequence password){
        return  (password != null) && (PASSWORD_PATTERN.matcher(password).matches());
    }
}
