import java.util.Scanner;

public class InputShapes {
   public static void main( String[] args ) {
   Scanner sc = new Scanner (System.in);
   System.out.println("Pssst...wanna see a really nerdy magic trick?");
   System.out.println("Give me a number for a circle's radius, any whole number.  ");
   double r = sc.nextDouble(); // Radius
   
   System.out.println("Now give me another number.  This is going to be the length of a rectangle.  ");
   double l = sc.nextDouble(); // Length
   
   System.out.println("Now give me one final number.  This is the WIDTH of the rectangle.  ");
   double w = sc.nextDouble(); // Width
   
   double cp = Math.PI * Math.pow(r, 2);
   double ca = 2 * Math.PI * r ;
   double rp = l + w + w + l;
   double ra = l * w;
   double rt = Math.pow(l, 2) + Math.pow(w, 2);
   double rth = Math.sqrt(rt);
   
   System.out.println(" The perimeter of the circle is " + cp);
   System.out.println(" The area of the circle is  " + ca);
   System.out.println(" the perimeter of the rectangle is " + rp);
   System.out.println(" The area of the rectangle is " + ra);
   System.out.println(" The hypotenuse of the right triangle is " + rth);

   
   }
}
