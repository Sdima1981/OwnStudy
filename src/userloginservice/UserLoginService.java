package userloginservice;

public class UserLoginService {

    public static void main(String[] args){
        User user = new User();
        user.setLogin ("dima");
        user.setPassword ("pass");


        user.login();

    }
}
