package lesson4.userloginservice;

public class UserLoginService {

    boolean login(String userPassword, User user) {

        if ((verify (userPassword, user)) && (!user.isBlocked)) {
            user.resetLoginAttemptsLeft ();
            return true;
        }

        if (!verify (userPassword, user)) {
            user.setLoginAttemptsLeft (user.getLoginAttemptsLeft () - 1);
            user.block ();
        }

        return false;
    }

    boolean verify(String userPassword, User user) {
        if (userPassword.equals (user.getPassword ())) {
            return true;
        }
        return false;

    }
}

