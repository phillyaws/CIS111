import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;


public class LargeSmallAv {
   public static void main( String[] args ) 
   {
   Scanner sc = new Scanner (System.in);
   List<Integer> numbers = new ArrayList<Integer>();
   System.out.print("Enter any series of numbers. Enter -99 as the last number.  ");
   int num = sc.nextInt();
   while ((num = sc.nextInt()) != -99) {
      numbers.add(sc.nextInt());

          }
      Integer number[]=numbers.toArray(new Integer[numbers.size()]);
 
          Collections.sort(numbers);
          int total = numbers.size();
          
          System.out.print(number);
          System.out.print("The highest number you entered was: " + Collections.max(numbers));
          System.out.print("The lowest number you entered was: " + Collections.min(numbers));
          // code block end
   }
   }
