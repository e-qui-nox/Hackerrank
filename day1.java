import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
         double y = sc.nextDouble();
         String f = sc.nextLine();
         String z = sc.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
           int sum1 = i + x;
           System.out.println(sum1);
        /* Print the sum of the double variables on a new line. */
		   double sum2 = d + y;
           System.out.println(sum2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
          s = s.concat(z);
          System.out.println("" +s);
          sc.close();
    }
}
