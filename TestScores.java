import java.util.Scanner;

public class TestScores {
   public static void main( String[] args ) {
   Scanner sc = new Scanner (System.in);
   System.out.println("Please input grade for test 1.  ");
   double t1 = sc.nextDouble(); // test 1

   System.out.println("Please input grade for test 2.  ");
   double t2 = sc.nextDouble(); // test 3

   System.out.println("Please input grade for test 3.  ");
   double t3 = sc.nextDouble(); // test 3
   
   double av = (t1 + t2 + t3)/3;
     if(av < 60) {
         System.out.println("Your average is " + Math.round(av) + ", an F.  Please see me after class.  ");
     }
     if(av >= 90 && av <= 100) {
         System.out.println("Your average is " + Math.round(av) + ", an A.  Good job.  ");
     }
     if(av >= 80 && av <= 89) {
         System.out.println("Your average is " + Math.round(av) + ",  an B.  You can do it!");
     }
     if(av >= 70 && av <= 79) {
         System.out.println("Your average is " + Math.round(av) + ",  an C.  Consider seeking additional help.  ");
     }
     if(av >= 60 && av <= 69) {
         System.out.println("Your average is " + Math.round(av) + ",  an D.  Consider talking to student services.  ");
     }




   
   
   
   
   
   }
   }
