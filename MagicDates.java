import java.util.Scanner;

public class MagicDates {
   public static void main( String[] args ) {
   Scanner sc = new Scanner (System.in);
   
   System.out.println("Tell me your name!  ");
   String name = sc.next();
   
   System.out.println("Please tell me a number between 1 and 12.  ");
   int m = sc.nextInt();

   
   System.out.println("Please tell me a number between 1 and 31.  ");
   int d = sc.nextInt();

   
   System.out.println("Please tell me a two-digit number.  ");
   int y = sc.nextInt();
   
   int md = m*d;
   
   if(md == y) {
       System.out.println("That is a magic date.  Yer a Wizard, " + name + "!");
     }
   else if(md != y) {
       System.out.println("That is not a magic date.  Yer a Muggle, " + name + ".");
     }
}
}
