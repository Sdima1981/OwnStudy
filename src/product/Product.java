package product;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public String getName() {
        return name;}
    public void setName(String name){
        this.name = name;}

    public double getRegularPrice() {
        return regularPrice;}
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;}

    public  double getDiscount () {
        return discount;}
    public void setDiscount(double discount){this.discount = discount;}

    void calculateActualPrice() {
        double actualPrice = regularPrice - (discount / 100) * regularPrice;

        System.out.println ("Product : name = " + name + ", regular price = " + regularPrice + "€, discount = " +
                (int)discount + "%" + ", actual price = " + actualPrice + "€");

    }

}
