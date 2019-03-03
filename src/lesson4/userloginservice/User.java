package lesson4.userloginservice;


public class User {

    private String login;
    private String password;
    private int loginAttemptsLeft;
    private boolean blocked;

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

    void resetLoginAttempts() {
        setLoginAttemptsLeft (3);
        setBlocked (false);
    }

    void block(){
        setLoginAttemptsLeft (0);
        setBlocked (true);
    }

    public User(String login, String password, int loginAttemptsLeft, boolean blocked) {
        this.login = login;
        this.password = password;
        this.loginAttemptsLeft = loginAttemptsLeft;
        this.blocked = blocked;
    }
}
