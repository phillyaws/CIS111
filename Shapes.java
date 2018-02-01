public class Shapes {
   public static void main( String[] args ) {
   
   double r = 5; // Radius
   double l = 10; // Length
   double w = 20; // Width
   
   double cp = Math.PI * Math.pow(r, 2);
   double ca = 2 * Math.PI * r ;
   double rp = l + w + w + l;
   double ra = l * w;
   double rt = Math.pow(l, 2) + Math.pow(w, 2);
   double rth = Math.sqrt(rt);
   
   System.out.println(" the perimeter of the circle is " + cp);
   System.out.println(" The area of the circle is  " + ca);
   System.out.println(" the perimeter of the rectangle is " + rp);
   System.out.println(" The area of the rectangle is " + ra);
   System.out.println(" The hypotenuse of the right triangle is " + rth);

   
   }
}
