package lesson5.tv;

import java.util.Objects;

public class TV {

    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;

    TV(String manufacturer, int currentChannel, int currentVolumeLevel, boolean turnedOn) {
        this.manufacturer = manufacturer;
        this.currentChannel = currentChannel;
        this.currentVolumeLevel = currentVolumeLevel;
        this.turnedOn = turnedOn;
    }

    public void setCurrentChannel(int currentChannel) {
        if (turnedOn) {
            this.currentChannel = currentChannel;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        if (turnedOn) {
            this.currentVolumeLevel = currentVolumeLevel;
        }
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    void nextChannel() {
        if (turnedOn) {
            currentChannel++;
        }

    }

    void previousChannel() {
        if ((turnedOn) && (getCurrentChannel () > 0)){
            currentChannel--;
        }
    }

    void increaseVolume() {
        if ((turnedOn) && (getCurrentVolumeLevel () <= 100)) {
            currentVolumeLevel++;
        }
    }

    void decreaseVolume() {
        if ((turnedOn) && (getCurrentVolumeLevel () > 0)) {
            currentVolumeLevel--;
        }
    }

    void tunrOn() {
        setTurnedOn (true);
    }

    void turnOff() {
        setTurnedOn (false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVolumeLevel == tv.currentVolumeLevel &&
                turnedOn == tv.turnedOn &&
                Objects.equals (manufacturer, tv.manufacturer);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolumeLevel=" + currentVolumeLevel +
                ", manufacturer='" + manufacturer + '\'' +
                ", turnedOn=" + turnedOn +
                '}';
    }
}
