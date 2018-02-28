import java.util.Scanner;

public class RomanNumerals {
   public static void main( String[] args ) {
   Scanner sc = new Scanner (System.in);
   
   System.out.println("Please tell me a number between 1 and 10.  ");
     int n = sc.nextInt();
     
     if(n > 10) {
         System.out.println("That is not a valid number.  ");
     }
     else if(n <= 10) {
     if(n == 1) {
     System.out.println("Converted to Roman numerals, your number is I");
     }
     if(n == 2) {
     System.out.println("Converted to Roman numerals, your number is II");
     }
     if(n == 3) {
     System.out.println("Converted to Roman numerals, your number is III");
     }
     if(n == 4) {
     System.out.println("Converted to Roman numerals, your number is IV");
     }
     if(n == 5) {
     System.out.println("Converted to Roman numerals, your number is V");
     }
     if(n == 6) {
     System.out.println("Converted to Roman numerals, your number is VI");
     }
     if(n == 7) {
     System.out.println("Converted to Roman numerals, your number is VII");
     }
     if(n == 8) {
     System.out.println("Converted to Roman numerals, your number is VIII");
     }
     if(n == 9) {
     System.out.println("Converted to Roman numerals, your number is IX");
     }
     if(n == 10) {
     System.out.println("Converted to Roman numerals, your number is X");
     }
     
}
}}
