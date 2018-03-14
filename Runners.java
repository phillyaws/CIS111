import java.util.Scanner;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Runners {
   public static void main(String[] args ) {
   Scanner sc = new Scanner (System.in);
      
   // Runner 1
   System.out.println("Tell me a runners name.  ");
   String n1 = sc.next();
   System.out.println("What was their time in minutes?");
   double t1 = sc.nextDouble(); 
   String time1 = Double.toString(t1);
   String r1 = n1 + time1;
   
   //Runner 2
   System.out.println("Tell me a runners name.  ");
   String n2 = sc.next();
   System.out.println("What was their time in minutes?");
   double t2 = sc.nextDouble(); 
   String time2 = Double.toString(t2);
   String r2 = n2 + time2;

   
   // Runner 3
   System.out.println("Tell me a runners name.  ");
   String n3 = sc.next();
   System.out.println("What was their time in minutes?");
   double t3 = sc.nextDouble(); 
   String time3 = Double.toString(t3);
   String r3 = n3 + time3;
   
   public double compare; {
   List<String> strings = Arrays.asList(r1, r2, r3);
    Collections.sort(strings, new Comparator<String>() {
        public double compare(String r1, String r2, String r3) {
            return extractInt(r1) - extractInt(r2) - extractInt(r3);
        }

        double extractDouble(String s) {
            String num = s.replaceAll("\\D", "");
            // return 0 if no digits found
            return num.isEmpty() ? 0 : Double.parseDouble(num);
        }
    });
    System.out.println(strings);

}}}
   
