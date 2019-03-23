package lesson8.forum;

public class ForumTest {
    public static void main(String[] args) {
        User user = new User ();
        Moderator moderator = new Moderator ();
        Administrator administrator = new Administrator ();

        user.readPosts ();
        System.out.println (" ");
        moderator.readPosts ();
        moderator.moderating ();
        System.out.println (" ");
        administrator.readPosts ();
        administrator.moderating ();
        administrator.blocking ();
    }
}
