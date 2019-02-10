package userloginservice;

import java.util.Scanner;

public class UserLoginService {

    public static void main(String[] args){
        User user = new User();
        user.setLogin ("dima");
        user.setPassword ("pass");
        user.setLoginAttemptsLeft(3);

        Scanner scanner = new Scanner(System.in);

        user.setLoginIn(scanner.next());
        user.setPasswordIn(scanner.next());
        scanner.close();


        user.login();

    }
}
