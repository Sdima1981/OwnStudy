package stock;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.setCompany("IBM");
        stock.setCurrentValue(150);

        stock.updatePrice(150.37);
        stock.updatePrice(149.82);
        stock.updatePrice(150.12);

        stock.printInformation();
    }
}
