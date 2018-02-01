public class TaxCalculator {
   public static void main( String[] args ) {

      double a = 1.00;
      double b = 10.00;
      double c = 100.00;
      double t = 1.06;

      double e = a * t;
      System.out.println(" the price of a $1 item after tax is " + "$" + e);
      
      double f = b * t;
      System.out.println(" the price of a $10 item after tax is " + "$" + f);
      
      double g = c * t;
      System.out.println(" the price of a $100 item after tax is " + "$" + g);
      }

}
