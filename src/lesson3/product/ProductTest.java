package lesson3.product;

public class ProductTest {

    public static void main(String[] args) {
        Product product = new Product ();

        product.setName ("milk");
        product.setRegularPrice (0.8);
        product.setDiscount (20);

        product.calculateActualPrice ();
     //   product.printInformation ();
        System.out.println (product);

    }
}
