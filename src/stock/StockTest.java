package stock;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock ();
        stock.setCompany ("IBM");
        stock.setCurrentValue (150);

        stock.printInformation ();
        stock.updatePrice (150.37);
        stock.printInformation ();
        stock.updatePrice (149.82);
        stock.printInformation ();
        stock.updatePrice (150.12);

        stock.printInformation ();
    }
}
