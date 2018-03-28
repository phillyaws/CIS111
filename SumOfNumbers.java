import java.util.Scanner;

public class SumOfNumbers {
   public static void main( String[] args ) {
      Scanner sc = new Scanner (System.in);
        
      System.out.println("Please input a positive, nonzero whole number.  ");
         int num = sc.nextInt(); // number
         int i = 1;
         int x = 0;
         int maxInt = 2147483647;
         
         while (i <= num) {
         x = x +i;
         i++;
         }
         
         
      System.out.println("The sum of your number, and every number before it is " + x);
      }
      }
