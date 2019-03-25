package lesson4.userloginservice;

public class User {
    private String login;

    public String getPassword() {
        return password;
    }

    private String password;
    private int loginAttemptsLeft = 3;
    boolean isBlocked;

    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    void setLoginAttemptsLeft(int loginAttemptsLeft) {
        this.loginAttemptsLeft = loginAttemptsLeft;
    }

    boolean isBlocked() {
        return isBlocked;
    }

    void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    User(String login, String password){
        this.login = login;
        this.password = password;
    }

    void resetLoginAttemptsLeft(){
        setLoginAttemptsLeft (3);
    }

    void block(){
        if (getLoginAttemptsLeft () == 0){
        setBlocked (true);
        }
    }
}
