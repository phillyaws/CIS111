import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCounter {
   public static void main( String[] args ) {
      Scanner sc = new Scanner (System.in);
   
      
   System.out.println("Please enter a word or phrase.  ");
   String word = sc.next();
   
   System.out.println("Please enter a letter within that word/phrase.  ");
   char let = sc.next().charAt(0);
   int num = 0;
   
   for (int i=0; i<word.length(); i++)
        {
            if (word.charAt(i) == let)
            num++;
        } 
System.out.println("The letter " 
                     + let + 
                     " occurs " 
                     + num + 
                     " times in your word/phrase.  ");
   
   
// code block end
   }
   }
