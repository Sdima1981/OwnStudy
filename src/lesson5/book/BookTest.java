package lesson5.book;

public class BookTest {

    public static void main(String[] args) {
        Book myBook = new Book ("Mikhail Bulgakov", "Master and Margarita", 365);

        Book yourBook = new Book ("Mikhail Bulgakov", "Master and Margarita", 365);

        Book theirBook = new Book ("Victor Pelevin", "Empire V", 254);

        System.out.println (myBook);
        System.out.println (yourBook);
        System.out.println (myBook.equals (yourBook));
        System.out.println (yourBook.equals (theirBook));
        myBook = theirBook;
        System.out.println (myBook);
    }
}
