package lesson4.stock;

public class Ibm {
    public static void main(String[] args) {
        Stock ibm = new Stock ();
        ibm.setCompany ("ibm");
        ibm.setCurrentValue (150);
        ibm.setMax (150);
        ibm.setMin (150);

        ibm.updatePrice (ibm, 150.37);
        ibm.updatePrice (ibm,149.82);
        ibm.updatePrice (ibm,150.12);
        ibm.printInformation ();
    }
}
