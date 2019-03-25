package lesson4.userloginservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserLoginServiceTest {

    @Test
    void loginPassed() {
        User victim = new User ("Name", "pass");
        UserLoginService testRunner = new UserLoginService ();
        Assertions.assertTrue (testRunner.login ("pass", victim));
    }

    @Test
    void loginFail(){
        User victim = new User ("Name", "pass");
        UserLoginService testRunner = new UserLoginService ();
        Assertions.assertFalse (testRunner.login ("pa", victim));
    }

    @Test
    void userBlocked() {
        User victim = new User ("Name", "pass");
        UserLoginService testRunner = new UserLoginService ();
        testRunner.login ("pas", victim);
        testRunner.login ("pas", victim);
        testRunner.login ("pas", victim);
        Assertions.assertTrue (victim.isBlocked);
    }

    @Test
    void attemptsReset(){
        User victim = new User ("Name", "pass");
        UserLoginService testRunner = new UserLoginService ();
        testRunner.login ("pas", victim);
        testRunner.login ("pas", victim);
        testRunner.login ("pass", victim);
        Assertions.assertEquals (3, victim.getLoginAttemptsLeft ());
    }
}