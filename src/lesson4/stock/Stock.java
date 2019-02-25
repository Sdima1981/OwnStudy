package lesson4.stock;

public class Stock {

    private String company;
    private double currentValue;
    private double max;
    private double min;

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
        if ((min == 0) && (max == 0)) {
            setMin (getCurrentValue ());
            setMax (getCurrentValue ());
        }
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    String updatePrice(Stock stock, double currentValue) {

        if ((currentValue > min) && (currentValue > max)) {
            this.max = currentValue;
            this.currentValue = currentValue;
            return "max change";
        } else if ((currentValue > min) && (currentValue < max)) {
            this.currentValue = currentValue;
            return "current change";
        } else {
            this.min = currentValue;
            this.currentValue = currentValue;
            return "min change";
        }
    }

    void printInformation() {
//        System.out.println ("Stock company: " + company);
        System.out.println (getCompany () + ".current " + getCurrentValue ());
        System.out.println (getCompany () + ".max " + getMax ());
        System.out.println (getCompany () + ".min " + getMin ());
    }


}

