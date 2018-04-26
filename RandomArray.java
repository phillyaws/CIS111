import java.util.*;

public class RandomArray {
   public static void main( String[] args ) {
   
      int num;
      Scanner sc = new Scanner (System.in);
      Random rngesus = new Random();
      Integer[] array1 = new Integer[20];
      int count = 0;
   
      for (int i = 0; i < 20; i++) 
      {
         array1[i] = rngesus.nextInt(99)+1;
      }
      System.out.println("RNGesus generated the following numbers: ");
      System.out.println(Arrays.toString(array1));
      
      
      System.out.println("Here's the numbers in reverse: "); 
      Arrays.sort(array1, Collections.reverseOrder());       
      System.out.println(Arrays.toString(array1));
      
      System.out.println("Please enter a number between 1 and 100: ");
      num = sc.nextInt();
      for (int i=0; i < str.length(); i++)
         {
            if (str.charAt(i) == let)
               count++;
         } 

      
      
      System.out.println("Please enter a number between 1 and 99: ")
      
   
            // end main code block
   }
}
