package lesson5.tv;

public class TVControllerTest {

    public static void main(String[] args){
        TVControllerTest testRunner = new TVControllerTest ();

        testRunner.shouldIncreaseChannel ();
        testRunner.shouldDecreaseChannel ();
        testRunner.shouldIncreaseVolume ();
        testRunner.shouldDecreaseVolume ();
        testRunner.shouldPowerOn ();

    }

    private void shouldIncreaseChannel(){
        TV myTV = new TV ("Shilalis", 0,0,true);
        System.out.println (myTV);
        TVController victim = new TVController ();
        victim.connectTV (myTV);
        victim.nextChannelButton ();
        int actualResult = 1;
        int expectedResult = myTV.getCurrentChannel ();
        if(expectedResult == actualResult){
            System.out.println (myTV);
            System.out.println ("Test shouldIncreaseChannel PASSED");
        } else {
            System.out.println ("Test shouldIncreaseChannel Failed");
        }
        System.out.println ("============================================================");
    }

    private void shouldDecreaseChannel(){
        TV myTV = new TV ("Shilalis", 2,0,true);
        TVController victim = new TVController ();
        victim.connectTV (myTV);
        System.out.println (myTV);
        victim.previousChannelButton ();
        int actualResult = 1;
        int expectedResult = myTV.getCurrentChannel ();
        if(expectedResult == actualResult){
            System.out.println (myTV);
            System.out.println ("Test shouldDecreaseChannel PASSED");
        } else {
            System.out.println ("Test shouldDecreaseChannel FAILED");
        }
        System.out.println ("============================================================");
    }

    private void shouldIncreaseVolume(){
        TV myTV = new TV ("Shilalis", 0,5,true);
        TVController victim = new TVController ();
        victim.connectTV (myTV);
        System.out.println (myTV);
        victim.volumeUpButton ();
        int actualResult = 6;
        int expectedResult = myTV.getCurrentVolumeLevel ();
        if(expectedResult == actualResult){
            System.out.println (myTV);
            System.out.println ("Test shouldIncreaseVolume PASSED");
        } else {
            System.out.println ("Test shouldIncreaseVolume FAILED");
        }
        System.out.println ("============================================================");
    }

    private void shouldDecreaseVolume(){
        TV myTV = new TV ("Shilalis", 0,5,true);
        TVController victim = new TVController ();
        victim.connectTV (myTV);
        System.out.println (myTV);
        victim.volumeDownButton ();
        int actualResult = 4;
        int expectedResult = myTV.getCurrentVolumeLevel ();
        if(expectedResult == actualResult){
            System.out.println (myTV);
            System.out.println ("Test shouldDecreaseVolume PASSED");
        } else {
            System.out.println ("Test shouldDecreaseVolume FAILED");
        }
        System.out.println ("============================================================");
    }

    private void shouldPowerOn(){
        TV myTV = new TV ("Shilalis", 0,0,false);
        TVController victim = new TVController ();
        victim.connectTV (myTV);
        System.out.println (myTV);
        victim.powerOnButton ();
        boolean actualResult = true;
        boolean expectedResult = myTV.isTurnedOn ();
        if(expectedResult == actualResult){
            System.out.println (myTV);
            System.out.println ("Test shouldPowerOn PASSED");
        } else {
            System.out.println ("Test shouldPowerOn FAILED");
        }
        System.out.println ("============================================================");
    }
}
