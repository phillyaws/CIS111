public class Shapes2 {
   public static void main( String[] args ) {
   
   double r = 5; // Radius
   double l = 10; // Length
   double w = 20; // Width
   double r2 = r * r;
   
   double cp = 3.14 * r2;
   double ca = 2 * 3.14 * r ;
   double rp = l + w + w + l;
   double ra = l * w;
   
   System.out.println(" the perimeter of the circle is " + cp);
   System.out.println(" The area of the circle is  " + ca);
   System.out.println(" the perimeter of the rectangle is " + rp);
   System.out.println(" The area of the rectangle is " + ra);
   }
}
