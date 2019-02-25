package lesson4.userloginservice;

import javax.jws.soap.SOAPBinding;

public class UserLoginServiceTest {

    public static void main(String[] args) {
        UserLoginServiceTest testRunner = new UserLoginServiceTest ();
        testRunner.ifLoggedIn ();
    }

    boolean ifLoggedIn(){
                User userOne = new User ("dima", "pass", 3, false);


                userOne.equals (User.class);
        UserLoginService victim = new UserLoginService ();


        boolean actualResult = victim.verify (userOne);
        if (actualResult) {
            System.out.println ("Success");
            return true;

        }else {
            System.out.println ("Failed");
            return false;
        }
    }
}
