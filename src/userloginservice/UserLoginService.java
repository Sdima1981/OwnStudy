package userloginservice;


public class UserLoginService {

    public static void main(String[] args) {
        UserLoginService test = new UserLoginService ();
        User user = new User ();
        test.login ("dima", user);

    }




    public boolean login(String userPassword, User user) {
        if (verify ("dima", "pass").equals ("Login OK")){
            return true;
        }else {
            return false;
        }


    }


    public String verify(String userLogin, String userPassword) {

        User myUser = new User ();
        myUser.setLogin ("dima");
        myUser.setPassword ("pass");
        myUser.setLoginAttemptsLeft (3);


        if ((myUser.getLogin ()).equals (userLogin)) {
            return "Login OK";

        } else {
            myUser.setLoginAttemptsLeft (myUser.getLoginAttemptsLeft () - 1);
            return "Wrong login";
            verify (userLogin, userPassword);

        }
        if ((myUser.getPassword ()).equals (userPassword)) {
            System.out.println ();
            return "Password OK";
        } else {
            System.out.println ("Pass NOT OK");
            return "wrong Password";
            verify (userLogin, userPassword);
        }
        if (!(myUser.isBlocked ())) {
            return "User is not blocked";

        } else {
            return "User is blocked";

        }

    }


}
