import javax.swing.JOptionPane;

public class CookieLine {
   public static void main( String[] args ) {
   
   String inputString;
   String name;
   double c;
   
   name = JOptionPane.showInputDialog("What is your name?  ");
   
   inputString = JOptionPane.showInputDialog("Ok " + name + ", how many cookies would you like to make?  ");
   c = Double.parseDouble(inputString);
   
    // cup/gram conversion = http://dish.allrecipes.com/cup-to-gram-conversions/
 
   double s = c * 6.27; // number of cookies times grams of sugar per cookie in 48 cookies
   double b = c * 4.73; // number of cookies times grams of butter per cookie in 48 cookies
   double f = c * 7.33; // number of cookies times grams of flour per cookie in 48 cookies

   JOptionPane.showMessageDialog(null, "Cups are an imperfect and antiquated system.  You will need " 
                                 + Math.round(s) + " grams of sugar, " 
                                 + Math.round(b) + " grams of butter, and " 
                                 + Math.round(f) + " grams of flour.  ");
                                 
                                    }
                                    }   
   
