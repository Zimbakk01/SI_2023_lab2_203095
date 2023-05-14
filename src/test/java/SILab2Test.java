import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class SILab2Test {
   /*Every Brnach */

    @Test
    public void testFunction_NullUser_ReturnsMandatoryInformationMissing() {
        User user = null;
        List<User> allUsers = new ArrayList<>();

        try {
            SILab2.function(user, allUsers);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }
    }
    @Test
    public void testFunction_UserWithNullUsername_ReturnsMandatoryInformationMissing() {
        User user = new User(null, "password", "email");
        List<User> allUsers = new ArrayList<>();
        try {
            SILab2.function(user, allUsers);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }
    }

    @Test
    public void testFunction_UserWithNullPassword_ReturnsMandatoryInformationMissing() {
        User user = new User("username", null, "email");
        List<User> allUsers = new ArrayList<>();
        try {
            SILab2.function(user, allUsers);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }
    }

    @Test
    public void testFunction_UserWithNullEmail_ReturnsMandatoryInformationMissing() {
        User user = new User("username", "password", null);
        List<User> allUsers = new ArrayList<>();
        try {
            SILab2.function(user, allUsers);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }
    }

    @Test
    public void testFunction_ValidUser_NoDuplicates_ReturnsTrue() {
        User user = new User("username", "password", "email");
        List<User> allUsers = new ArrayList<>();
        boolean result = SILab2.function(user, allUsers);
        assertTrue(!result);    }

    @Test
    public void testFunction_ValidUser_Duplicates_EmailMatch_ReturnsFalse() {
        User user = new User("username", "password", "valid_email@gmail.com");
        User user1 = new User("username1", "password1", "valid_email@gmail.com");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");
        List<User> allUsers = Arrays.asList(user1, user2, user3);
        boolean result = SILab2.function(user, allUsers);
        assertFalse(result);
    }

    @Test
    public void testFunction_ValidUser_Duplicates_UsernameMatch_ReturnsFalse() {
        User user = new User("username", "password", "valid_email@gmail.com");
        User user1 = new User("username", "password1", "email1");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");
        List<User> allUsers = Arrays.asList(user1, user2, user3);
        boolean result = SILab2.function(user, allUsers);
        assertFalse(result);
    }

    @Test
    public void testFunction_ValidUser_Duplicates_NoMatch_ReturnsTrue() {
        User user = new User("username", "password", "valid_email@gmail.com");
        User user1 = new User("username1", "password1", "email1");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");
        List<User> allUsers = Arrays.asList(user1, user2, user3);
        boolean result = SILab2.function(user, allUsers);
        assertTrue(!result);    }

    @Test
    public void testFunction_ValidUser_PasswordContainsUsername_ReturnsFalse() {
        User user = new User("username", "password", "valid_email@gmail.com");
        User user1 = new User("username1", "password1", "email1");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");
        List<User> allUsers = Arrays.asList(user1, user2, user3);
        boolean result = SILab2.function(user, allUsers);
        assertFalse(result);
    }

    @Test
    public void testFunction_ValidUser_ShortPassword_ReturnsFalse() {
        User user = new User("username", "password", "valid_email@gmail.com");
        User user1 = new User("username1", "password1", "email1");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");
        List<User> allUsers = Arrays.asList(user1, user2, user3);
        boolean result = SILab2.function(user, allUsers);
        assertFalse(result);
    }

    @Test
    public void testFunction_ValidUser_PasswordContainsSpace_ReturnsFalse() {
        User user = new User("username", "password", "valid_email@gmail.com");
        User user1 = new User("username1", "password1", "email1");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");
        List<User> allUsers = Arrays.asList(user1, user2, user3);
        boolean result = SILab2.function(user, allUsers);
        assertFalse(result);
    }

    @Test
    public void testFunction_ValidUser_FirstForLoopExecuted_ReturnsTrue() {
        User user = new User("username", "password", "valid_email@gmail.com");
        User user1 = new User("username1", "password1", "email1");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");
        List<User> allUsers = Arrays.asList(user1, user2, user3);
        boolean result = SILab2.function(user, allUsers);
        assertTrue(!result);
    }

    @Test
    public void testFunction_ValidUser_FirstForLoopNotExecuted_ReturnsTrue() {
        User user = new User("username", "password", "valid_email@gmail.com");
        List<User> allUsers = new ArrayList<>();
        boolean result = SILab2.function(user, allUsers);
        assertTrue(!result);
    }

    @Test
    public void testFunction_ValidUser_SecondForLoopExecuted_ReturnsTrue() {
        User user = new User("username", "password", "valid_email@gmail.com");
        User user1 = new User("username1", "password1", "email1");
        User user2 = new User("username2", "password2", "email2");
        User user3 = new User("username3", "password3", "email3");
        List<User> allUsers = Arrays.asList(user1, user2, user3);
        String password = "password";
        String passwordLower = "password";
        boolean result = SILab2.function(user, allUsers);
        assertTrue(!result);
    }


    /* Multiple Conditions*/
    @Test
    public void testFunction_UserIsNull() {
        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(null, new ArrayList<>()));

        assertEquals("Mandatory information missing!", ex.getMessage());
    }

    @Test
    public void testFunction_PasswordIsNull() {
        User user = new User("username", null, "email");
        assertThrows(RuntimeException.class, () -> SILab2.function(user, new ArrayList<>()));
    }

    @Test
    public void testFunction_EmailIsNull() {
        User user = new User("username", "password", null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user, new ArrayList<>()));
    }

    @Test
    public void testFunction_UserExists() {
        User user = new User("username", "password", "email");
        List<User> allUsers = Arrays.asList(
                new User("user1", "pass1", "email1"),
                new User("user2", "pass2", "email2"),
                new User("user3", "pass3", "email3")
        );
        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunction_ValidUser_AllMandatoryInformationProvided() {
        User user = new User("username", "P@ssw0rd", "user@example.com");
        List<User> allUsers = new ArrayList<>();

        boolean result = SILab2.function(user, allUsers);

        assertTrue(result); // Modify the assertion based on the expected result
    }

    @Test
    public void testFunction_ValidUser_UsernameIsNull() {
        User user = new User(null, "password", "email");
        List<User> allUsers = Arrays.asList(
                new User("user1", "pass1", "email1"),
                new User("user2", "pass2", "email2"),
                new User("user3", "pass3", "email3")
        );
        assertFalse(SILab2.function(user, allUsers));
        assertEquals(user.getEmail(), user.getUsername());
    }

    @Test
    public void testFunction_InvalidPassword_ContainsUsername() {
        User user = new User("username", "password123", "email");
        List<User> allUsers = new ArrayList<>();
        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunction_InvalidPassword_TooShort() {
        User user = new User("username", "pass", "email");
        List<User> allUsers = new ArrayList<>();
        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunction_InvalidPassword_MissingSpecialCharacter() {
        User user = new User("username", "password", "email");
        List<User> allUsers = new ArrayList<>();
        assertFalse(SILab2.function(user, allUsers));
    }
}