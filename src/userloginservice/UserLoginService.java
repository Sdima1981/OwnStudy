package userloginservice;

import java.util.Scanner;

public class UserLoginService {
    User userLoginService = new User ();


    void reset() {
        userLoginService.setLoginAttemptsLeft (3);
    }

    void block() {
        if ((userLoginService.getLoginAttemptsLeft ()) <= 0) {
            System.out.println ("You`ve entered incorrect Password or Login more than 3 times.");
            System.out.println ("Plese contact somebody about it.");
        }
    }

    void oneMoreLogIn() {
        login ();
    }


    void createNewUser() {
        userLoginService.setLogin ("dima");
        userLoginService.setPassword ("pass");
        userLoginService.setLoginAttemptsLeft (3);

    }

    void print(){
        System.out.println (userLoginService.getLogin () + userLoginService.getPassword ());
        System.out.println (userLoginService.getUserLogin () + userLoginService.getUserPassword ());
        System.out.println (userLoginService.getLoginAttemptsLeft ());
    }

    void verifyUser(){
        if ( ){
            createNewUser ();
        }
        else login ();
    }


    public void login() {

        //verifyUser ();

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Type in Your Login: ");
        userLoginService.setUserLogin (scanner.next ());
        System.out.println ("Type in Your password: ");
        userLoginService.setUserPassword (scanner.next ());
        //scanner.close();

        //    System.out.println (userLoginService.getLogin () + userLoginService.getPassword ());
        //    System.out.println (userLoginService.getUserLogin () + userLoginService.getUserPassword ());
        //    System.out.println (userLoginService.getLoginAttemptsLeft ());


        if ((((userLoginService.getLoginAttemptsLeft ()) > 0) && (userLoginService.getUserLogin ()).equals (userLoginService.getLogin ())) && ((userLoginService.getUserPassword ()).equals (userLoginService.getPassword ()))) {
            System.out.println ("Good, now You`re logged in!");
            reset ();
            scanner.close ();
        } else if ((userLoginService.getLoginAttemptsLeft ()) > 0) {
            System.out.println ("Incorrect Login or password.");
            System.out.println ("Try one more time:");
            userLoginService.setLoginAttemptsLeft (userLoginService.getLoginAttemptsLeft () - 1);
            oneMoreLogIn ();
        } else if ((userLoginService.getLoginAttemptsLeft ()) <= 0) {
            scanner.close ();
            block ();
        }


    }
}
