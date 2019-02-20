package stock;

public class StockTest {
    public static void main(String[] args) {
        StockTest testRunner = new StockTest ();

        testRunner.minimumPriceChange ();
        testRunner.maximumPriceChange ();
        testRunner.currentPriceChange ();


    }

    public void minimumPriceChange(){
        Stock victim = new Stock ();
        victim.setCompany ("victim");
        victim.setCurrentValue (20);
        victim.setMin (20);
        victim.setMax (20);

        String expectedResult = "min change";
        String actualResult = victim.updatePrice (victim, 10);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("minimumPriceCange: SUCCESS");
        } else {
            System.out.println ("minimumPriceCange: FAIL");
        }
    }

    public void maximumPriceChange(){
        Stock victim = new Stock ();
        victim.setCompany ("victim");
        victim.setCurrentValue (20);
        victim.setMin (20);
        victim.setMax (20);

        String expectedResult = "max change";
        String actualResult = victim.updatePrice (victim, 30);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("maximumPriceCange: SUCCESS");
        } else {
            System.out.println ("maximumPriceCange: FAIL");
        }
    }

    public void currentPriceChange(){
        Stock victim = new Stock ();
        victim.setCompany ("victim");
        victim.setCurrentValue (20);
        victim.setMin (10);
        victim.setMax (50);

        String expectedResult = "current change";
        String actualResult = victim.updatePrice (victim, 30);
        if (expectedResult.equals (actualResult)) {
            System.out.println ("currentPriceCange: SUCCESS");
        } else {
            System.out.println ("currentPriceCange: FAIL");
        }
    }

}
