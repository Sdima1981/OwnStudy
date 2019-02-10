package product;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    double calculateActualPrice() {
        double actualPrice = regularPrice - (discount / 100) * regularPrice;
        return actualPrice;

    }

    public void printInformation() {
        System.out.println ("Product : name = " + name + ", regular price = " + regularPrice + "€, discount = " +
                 discount + "%" + ", actual price = " + calculateActualPrice () + "€");
    }

}
