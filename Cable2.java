import java.util.Scanner;

public class Cable2 {
   public static void main( String[] args ) {
   Scanner sc = new Scanner (System.in);
   
   System.out.println("Which cable package do you have: A, B, or C?  ");
   String cpack = sc.next();
   
      if(cpack.equalsIgnoreCase("a")) 
      {
         System.out.println("Please input how many hours you used.  ");
         double a1 = sc.nextDouble(); // time
         if(a1 <= 10) {
         System.out.println("Your bill is $9.95 with 10 hours included.  You did not use any additional hours.  ");
         }
         if(a1 > 10) {
         double a2 = a1 - 10; //number of hours used
         double p1 = a2 * 2; //price of additional hours;
         double fp = 19.95 + p1;  //total price
          if (fp >= 13.95 && fp <= 19.95) 
          {
          double as1 = fp - 13.95;
          System.out.println("Your base bill is $9.95 with 10 hours included.  You used "
          + a2 + " extra hours totaling $"
          + p1 + " additional, for a final total of $" 
          + fp + ".  You would save $"
          + as1 + " if you switch to package B.  ");
          }
          if (fp >= 19.95) 
          {
          double as2 = fp - 19.95;
          System.out.println("Your base bill is $9.95 with 10 hours included.  You used "
          + a2 + " extra hours totaling $"
          + p1 + " additional, for a final total of $" 
          + fp + ".  You would save $"
          + as2 + " if you switch to package C.  ");
          }
          }
     }
      if(cpack.equalsIgnoreCase("b")) {
         System.out.println("Please input how many hours you used.  ");
         double b1 = sc.nextDouble(); // time
         if(b1 <= 20) {
         System.out.println("Your bill is $13.95 with 20 hours included.  You did not use any additional hours.  ");
                        }
         if(b1 > 20) 
         {
         double b2 = b1 - 20; //number of hours used
         double p1 = b2 * 1; //price of additional hours;
         double fp = 13.95 + p1;  //total price
         System.out.println("Your base bill is $13.95 with 20 hours included.  You used "
          + b2 + " extra hours totaling $"
          + p1 + " additional, for a final total of $" 
          + fp + ".  ");
          
          if (fp >= 19.95) 
               {
          double bs2 = fp - 19.95;
          System.out.println("Your base bill is $9.95 with 10 hours included.  You used "
          + b2 + " extra hours totaling $"
          + p1 + " additional, for a final total of $" 
          + fp + ".  You would save $"
          + bs2 + " if you switch to package C.  ");
               }
          
          }
       }
      if(cpack.equalsIgnoreCase("c")) {
         System.out.println("Your bill is $19.95.  ");
         }
     }
     }
}
