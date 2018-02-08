import java.util.Scanner;

public class WordSalad {
   public static void main( String[] args ) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Pssst...wanna see a really nerdy magic trick?");
      System.out.println("Tell me a word.  "); //word one
      String wordone = sc.next();
      char a1 = wordone.charAt(0);
      char a2 = wordone.charAt(wordone.length()-1);
            
      System.out.println("Give me another word.  "); //word two
      String wordtwo = sc.next();
      char b1 = wordtwo.charAt(0);
      char b2 = wordtwo.charAt(wordtwo.length()-1);
      
      System.out.println("Once more, with feeling!  One final word, please.  "); //word three
      String wordthree = sc.next();
      char c1 = wordthree.charAt(0);
      char c2 = wordthree.charAt(wordthree.length()-1);
      
      System.out.println("Here's all those words mashed together.  ");
      String bigword = wordone + wordtwo + wordthree;

      System.out.println(bigword);
      
      System.out.println("And in uppercase.  ");
      String bwupper = bigword.toUpperCase();
      System.out.println(bwupper);
      
      System.out.println("And in lowercase: ");
      String bwlower = bigword.toLowerCase();
      System.out.println(bwlower);
      
      System.out.println("There are " + wordone.length() + " characters in Word One.");
      System.out.println("There are " + wordtwo.length() + " characters in Word Two.");
      System.out.println("There are " + wordthree.length() + " characters in Word Three.");
      
      System.out.println("There are " + bigword.length() + " total characters in this string.");
      
      System.out.println("The first three letters of each word spell " + a1 + b1 + c1);
      System.out.println("The last three letters of each word spell " + a2 + b2 + c2);
      }
      }
