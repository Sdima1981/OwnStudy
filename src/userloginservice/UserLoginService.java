package userloginservice;

import java.util.Scanner;

public class UserLoginService {
    User userLoginService = new User ();


    void reset() {
        userLoginService.setLoginAttemptsLeft (3);
    }

    void block() {
        if ((userLoginService.getLoginAttemptsLeft ()) <= 0) {
            System.out.println ("Get the hell out!!!");
        }
    }

    void oneMoreLogIn() {
        login ();
    }

    void createNewUser() {
        userLoginService.setLogin ("dima");
        userLoginService.setPassword ("pass");
        userLoginService.setLoginAttemptsLeft(3);
    }

    public void login() {

        createNewUser ();

        Scanner scanner = new Scanner(System.in);

        userLoginService.setUserLogin (scanner.next ());
        userLoginService.setUserPassword (scanner.next ());
        //scanner.close();

        System.out.println (userLoginService.getLogin () + userLoginService.getPassword ());
        System.out.println (userLoginService.getUserLogin () + userLoginService.getUserPassword ());
        System.out.println (userLoginService.getLoginAttemptsLeft ());


        if (((userLoginService.getUserLogin ()).equals (userLoginService.getLogin ())) && ((userLoginService.getUserPassword ()).equals (userLoginService.getPassword ()))) {
            System.out.println ("Good, we`re in");
            reset ();
            scanner.close ();
        } else {
            userLoginService.setLoginAttemptsLeft (userLoginService.getLoginAttemptsLeft () - 1);
            System.out.println ("Try one more time ");
            block ();
            oneMoreLogIn();
        }


    }
}
