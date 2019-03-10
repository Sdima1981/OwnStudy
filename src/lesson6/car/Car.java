package lesson6.car;

public class Car {

    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String model, String color, int maxSpeed, int currentSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    int getMaxSpeed() {
        return maxSpeed;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    int getCurrentSpeed() {
        return currentSpeed;
    }

    void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        }
    }

    void slowDown() {
        if (currentSpeed > 0) {
            currentSpeed--;
        }
    }

    boolean isDriving() {
        if (currentSpeed != 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean canAccelerate() {
        if (currentSpeed < maxSpeed) {
            return true;
        } else {
            return false;
        }
    }

    void speedUp(){
        while (currentSpeed < maxSpeed){
            accelerate ();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
