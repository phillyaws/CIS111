import java.util.Random;
import javax.swing.JOptionPane;


public class RockPaperS {
   public static void main( String[] args ) {
      Random r = new Random();
      
   
      
      // dice game
      int game = 0;
      int gc = 1;
      int human = 0;
      int computer = 0;
      while (game < 10) {
         System.out.println("Game: " + gc);         
         int d1 = r.nextInt(6);
         System.out.println("The computer rolled " + d1);
         int d2 = r.nextInt(6);
         System.out.println("The human rolled " + d2);
         if ( d1 > d2) {
            System.out.println("The computer won with " + d1 + ".  ");
            computer++;
         }
         if ( d2 > d1) {
            System.out.println("The human won with " + d2 + ".  ");
            human++;
         } 
         if ( d2 == d1) {
            System.out.println("Identical rolls.  No winner.  ");
         }                                      
         game++;
         gc++;
      } 
                            
      System.out.println("The human won " + human + " games.  ");
      System.out.println("The computer won " + computer + " games.  ");           
      if (human > computer) {
         System.out.println("The human is the overall winner with " + human + " games.  ");
      }
      if (computer > human ) {
         System.out.println("The computer is the overall winner with " + computer + " games.  ");
      }
      
      
      
      
      
      // end of code block
   }
}
      
