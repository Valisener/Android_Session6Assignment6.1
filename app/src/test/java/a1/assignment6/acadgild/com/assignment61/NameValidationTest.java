package a1.assignment6.acadgild.com.assignment61;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameValidationTest {

//    This method tests usernames that are good and should work.
    @Test
    public void nameValidator_CorrectTest_ReturnsTrue() {
        assertTrue(UserNameValidator.isValidUsername("Lisa"));
        assertTrue(UserNameValidator.isValidUsername("Joe"));
    }
//    Tests the name Smith should be correct and pass
    @Test
    public void nameValidator_CorrectTest_Smith_ReturnsTrue() {
        assertTrue(UserNameValidator.isValidUsername("Smith"));
    }

//    This method tests names that should fail. Returns false if they fail
    @Test
    public void nameValidator_FailTest_ReturnsFalse() {
        assertFalse(UserNameValidator.isValidUsername("Jack902"));
        assertFalse(UserNameValidator.isValidUsername("Samantha Carter"));
    }



}
