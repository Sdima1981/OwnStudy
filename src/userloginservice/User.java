/*Необходимо написать сервис "логина" пользователя "UserLoginService".

        Требования:
        Необходимо создать два класса. Класс User и класс UserLoginService.

        Класс User описывает пользователя. Параметры которые необходимы:


        имя (login) - тип данных String
        пароль (password) - тип данных String
        количество оставшихся попыток логина (loginAttemptsLeft) - тип данных int.
        По умолчанию максимальное количество попыток 3.
        заблокирован (blocked) - тип данных boolean

        Функциональныетребования класса User.
        метод для "ресета" попыток на значение "по умолчанию" - resetLoginAttempts
        метод для блокировки пользователя - block

        Класс UserLoginService описывает логику "логина" пользователя и проверки пароля.

        Функциональные требования класса UserLoginService:
        метод для входа пользователя "логина" (login).
        В качестве аргументов использовать пароль (тип данных String) и пользователя (тип данных User).
        Возможная сигнатура boolean login(String inputPassword, User user).
        метод для проверки пароля пользователя verify.

        *Примечание: в случае если количество попыток введения неверного пароля 3 и более, пользователь блокируется.

        Протестировать класс UserLoginService.*/

package userloginservice;

import java.util.Scanner;

public class User {
    private String login;
    private String password;
    private int loginAttemptsLeft;
    private boolean blocked = false;

    private String loginIn;
    private String passwordIn;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    public void setLoginAttemptsLeft(int loginAttemptsLeft) {
        this.loginAttemptsLeft = loginAttemptsLeft;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getLoginIn() {
        return loginIn;
    }

    public void setLoginIn(String loginIn) {
        this.loginIn = loginIn;
    }

    public String getPasswordIn() {
        return passwordIn;
    }

    public void setPasswordIn(String passwordIn) {
        this.passwordIn = passwordIn;
    }

    void reset() {
        loginAttemptsLeft = this.loginAttemptsLeft + 3;
    }

    void block() {
        while (loginAttemptsLeft == 0) {
            System.out.println("Get the hell out!!!");
        }
    }

    void oneMoreLogIn() {
        login();
    }

    void login() {

        System.out.println(getLogin() + getPassword());
        System.out.println(getLoginIn() + getPasswordIn());
        System.out.println(getLoginAttemptsLeft());


         if (( getLogin() !=  getLoginIn()) || (getPassword() != getPasswordIn())) {
             setLoginAttemptsLeft(loginAttemptsLeft - 1);
             System.out.println("Try one more time ");
            // oneMoreLogIn();
         }
         else if ((getLoginIn() == getLogin()) && (getPasswordIn() == getPassword())) {
             System.out.println("Good, we`re in");


//        } else {
//            setLoginAttemptsLeft(loginAttemptsLeft - 1);
//            System.out.println("Try one more time ");
//            oneMoreLogIn();
//        }
        }

    }
}

