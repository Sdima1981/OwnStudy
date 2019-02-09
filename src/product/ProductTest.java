package product;

public class ProductTest {

    public static void main(String [] args){
        Product product = new Product ();
        product.name = "milk";
        product.regularPrice = 0.8;
        product.discount = 20;

        product.calculateActualPrice ();

    }
}
