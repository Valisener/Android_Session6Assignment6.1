package a1.assignment6.acadgild.com.assignment61;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PasswordValidationTest {
    @Test
    public void passwordValidator_Correct_ReturnsTrue() {
        assertTrue(PasswordValidator.isValidPassword("JumpManX6"));
    }
//    Test the name M3gaManX3 should pass
    @Test
    public void passwordValidator_Correct_MegaMan_ReturnsTrue() {
        assertTrue(PasswordValidator.isValidPassword("M3gaMaNX3"));
    }

}
