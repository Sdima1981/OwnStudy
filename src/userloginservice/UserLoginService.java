package userloginservice;

import java.util.Scanner;

public class UserLoginService {
    User userLoginService = new User();

    void reset() {
        userLoginService.setLoginAttemptsLeft(3);
    }

    void block() {
        System.out.println("You`ve entered incorrect Password or Login more than 3 times.");
        System.out.println("Plese contact somebody about it.");
    }

    void createNewUser() {
        if ((userLoginService.getLogin()).equals("empty")) {
            userLoginService.setLogin("dima");
            userLoginService.setPassword("pass");
            userLoginService.setLoginAttemptsLeft(3);
        }

    }

    public void login() {

        createNewUser();
        userLoginService.setLoginAttemptsLeft(userLoginService.getLoginAttemptsLeft() - 1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in Your Login: ");
        userLoginService.setUserLogin(scanner.next());
        System.out.println("Type in Your password: ");
        userLoginService.setUserPassword(scanner.next());

        if ((((userLoginService.getLoginAttemptsLeft()) > 0) && (userLoginService.getUserLogin()).equals(userLoginService.getLogin())) && ((userLoginService.getUserPassword()).equals(userLoginService.getPassword()))) {
            System.out.println("Good, now You`re logged in!");
            reset();
            scanner.close();
        } else if ((userLoginService.getLoginAttemptsLeft()) > 0) {
            System.out.println("Incorrect Login or password.");
            System.out.println("Try one more time:");

            login();
        } else if ((userLoginService.getLoginAttemptsLeft()) < 1) {
            scanner.close();
            block();
        }


    }
}
