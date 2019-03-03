package lesson5.tv;

public class TVController {

    private TV tv;

     void connectTV(TV tv) {
        this.tv = tv;
    }

     void nextChannelButton() {
        tv.nextChannel ();
    }

     void previousChannelButton() {
        tv.previousChannel ();
    }

     void volumeUpButton() {
        tv.increaseVolume ();
    }

     void volumeDownButton() {
        tv.decreaseVolume ();
    }

    public boolean powerOnButton(){
        tv.tunrOn ();
        return tv.isTurnedOn ();
    }

    public boolean powerOffButton() {
        tv.turnOff ();
        return tv.isTurnedOn ();
    }


}
