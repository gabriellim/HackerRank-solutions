import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        while (n > 0) {
            String str = scan.nextLine();
            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();
            
            for (int i = 0; i < str.length(); i++) {
                char[] charArray = str.toCharArray();
                
                if (i%2 == 0) {
                    evenChars.append(charArray[i]);
                }
                else {
                    oddChars.append(charArray[i]);
                }
            }
            
            String result = String.format("%s %s", evenChars, oddChars);
            System.out.println(result);
            
            n -= 1;
        }
        scan.close();
    }
}