public class Main {
    public static void main(String[] args)
    {
         double TaxRate = 0.05;
         double SalesTax = 0;
         double PricePurchase = 55;

         SalesTax = PricePurchase * TaxRate;
        System.out.println(" The price of the purchase is " + PricePurchase);
        System.out.println(" The sales tax is " + SalesTax );
    }
}

