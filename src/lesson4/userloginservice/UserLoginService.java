package lesson4.userloginservice;

public class UserLoginService {


    private User user;


    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    private boolean verifyResult;

    boolean login(String password, User user) {


        if (user.isBlocked ()) {
            System.out.println ("Blocked");
            return false;
        }

        if ((user.getPassword ()).equals (password) &&
                (verifyResult)) {
            System.out.println ("Logged in");
            user.resetLoginAttempts ();
            return true;

        }else{
        return false;}

    }

    boolean verify(User user) {

        if (user == getUser ()) {
            return true;
        }
        else {
            return false;
        }


    }


}
