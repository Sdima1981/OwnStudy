package lesson5.counter;

public class Counter {

    private int value = 0;
    private int step = 1;

    int getValue() {
        return value;
    }

    void setValue(int value){
        if(value >= 0 && value <= 100) {
            this.value = value;
        }
    }

    int getStep(){
        return step;
    }
    void setStep(int step){
        if(step >= 0 && step <= 10) {
            this.step = step;
        }
    }

    void increment() {
        if (value <= 100) {
            this.value = value++ + step;

        }
    }

    void decrement() {
        if (value >= 0) {
            this.value = value-- - step;
        }
    }

    void clear(){
        setValue (0) ;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", step=" + step +
                '}';
    }
}
