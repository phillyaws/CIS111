import java.util.Scanner;

public class Elementals {
   public static void main( String[] args ) {
   Scanner sc = new Scanner (System.in);
   System.out.println("Please choose air, water, or steel.  ");
   String medium = sc.next();
   String mlower = medium.toLowerCase();
   
   System.out.println("Please input a distance.  ");
   double t = sc.nextDouble(); // time
   String time1 = Double.toString(t);
   
   
   double a = t / 1100; // Speed of sound in air
   double w = t / 4900; // Speed of sound in water
   double s = t / 16400; // Speed of sound in steel
   
   if(medium.equalsIgnoreCase("AIR")) {
         System.out.println("Your sound will take " + a + " seconds to travel through " + mlower + ".  ");
     }
   if(medium.equalsIgnoreCase("WATER")) {
         System.out.println("Your sound will take " + w + " seconds to travel through " + mlower + ".  ");
     }
   if(medium.equalsIgnoreCase("STEEL")) {
         System.out.println("Your sound will take " + s + " seconds to travel through " + mlower + ".  ");
     }
     
     }}
