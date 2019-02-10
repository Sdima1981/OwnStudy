package dog;

public class DogTest {

    public static void main(String[] args){
        Dog myDog = new Dog ();

        myDog.setName ("Tatoshka");
        myDog.setAge (65);
        myDog.setColor ("Black with white spots");

        myDog.printInformation ();
        myDog.eat ();
        myDog.sleep ();
        myDog.voice ();
    }

}
