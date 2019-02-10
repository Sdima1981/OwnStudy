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
    String login;
    String password;
    String loginIn;
    String passwordIn;
    int loginAttemptsLeft = 3;
    int attempt = 0;
    boolean blocked = false;

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

    void reset() {
        loginAttemptsLeft = this.loginAttemptsLeft + 3;
    }

    void block() {
        while (loginAttemptsLeft == 0) {
            System.out.println ("Get the hell out!!!");
        }
    }

    void login() {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter Your Login here:");
        this.loginIn = scanner.next ();
        System.out.println ("Enter Your password here: ");
        this.passwordIn = scanner.next ();
        scanner.close ();
        if ((loginIn == loginIn) && (this.passwordIn == password) && (loginAttemptsLeft > 0)) {
            System.out.println ("Good, we`re in");
            int loginAttemptsLeft = this.loginAttemptsLeft - 1;
        } else if ((loginIn == login) && (passwordIn == password) && (loginAttemptsLeft <= 0)) {
            this.block ();
        } else {
            System.out.println ("Try one more time ");
            this.login ();
        }

    }

}

