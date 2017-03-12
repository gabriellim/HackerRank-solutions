import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = Integer.parseInt(scan.nextLine()); 
      scan.close();
      
      String answer = "";
      if (n%2 != 0) {
          answer = "Weird";
      }
      else {
          if ((2 <= n && n <= 5) || (n > 20)) {
              answer = "Not Weird";
          }
          else {
              answer = "Weird";
          }
      }
      System.out.println(answer);
   }
}
