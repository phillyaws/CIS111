import java.util.*;

public class FinalToDo {
   public static void main( String[] args ) {
      Scanner sc = new Scanner (System.in);
      String[] toDo = new String[10];
      int taskCount = 0;
      char again = 'y';
      while (again == 'y') {  
         System.out.println("[A]dd task to list, [D]elete task, [E]dit task, [S]how list, [Q]uit?");
         
         String choice = sc.next(); // Human choice
         
         //Add block
         if (choice.equalsIgnoreCase("A")) {
            System.out.println("Make another change? [Q]uit to end.");
            for(int i=0; i<10; i++)
               toDo[i] = choice.next();
            taskCount++;
         }
         
         //Delete block
         else if (choice.equalsIgnoreCase("D")) {
            System.out.println("Make another change? [Q]uit to end.");
            taskCount--;
         }
            
         //Edit block
         else if (choice.equalsIgnoreCase("E")) {
            System.out.println("Make another change? [Q]uit to end.");
         }        
            
         //Show block
         else if (choice.equalsIgnoreCase("S")) {
         
         }    
            
         System.out.println("Make another change? [Q]uit to end.");
         again = sc.next().charAt(0);
         
      }                             
   // end main code block
   }
}
