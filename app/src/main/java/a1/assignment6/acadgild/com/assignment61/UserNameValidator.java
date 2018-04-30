package a1.assignment6.acadgild.com.assignment61;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import java.util.regex.Pattern;

public class UserNameValidator implements TextWatcher{

//    This is a variable for the pattern for username so itll know whats allowed and not allowed
//    as a username.
    // Requirements must be only letters cant have numbers or symbols must be at least 1 character long
    //Minimum. Maximum of 9 characters
    public static final Pattern USERNAME_PATTERN  = Pattern.compile("[a-zA-Z+]{1,9}");
    //  Boolean value of is valid to see if its a valid username that was entered used in a method
    private boolean isValid = false;

//    Method to return the valid boolean variable.
    private boolean isValid(){
        return isValid;
    }
//    Required but i have no use for it
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }
//    Required but i have no use for it
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
//    Test the information entered
    @Override
    public void afterTextChanged(Editable s) {
        isValid =  isValidUsername(s);
    }

//    Method to test if the string entered is correct or not returns boolean value
    public static boolean isValidUsername(CharSequence name){
        return  (name != null) && (USERNAME_PATTERN.matcher(name).matches());
    }
}