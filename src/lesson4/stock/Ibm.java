package lesson4.stock;

public class Ibm {
    public static void main(String[] args) {
        Stock ibm = new Stock ();
        ibm.setCompany ("ibm");
        ibm.setCurrentValue (150);
        ibm.setMax (150);
        ibm.setMin (150);

        ibm.updatePrice ( 150.37);
        ibm.updatePrice (149.82);
        ibm.updatePrice (150.12);
        ibm.printInformation ();
    }
}
