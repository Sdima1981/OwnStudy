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

public class User {
    private String login = "empty";
    private String password = "empty";
    private int loginAttemptsLeft;


    private String userLogin;
    private String userPassword;

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

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


}


