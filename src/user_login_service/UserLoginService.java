package user_login_service;

import java.util.Scanner;

public class UserLoginService {

    public static void main(String[] args){
        User user = new User();
        user.login = "dima";
        user.password = "pass";


        user.login();

    }
}
