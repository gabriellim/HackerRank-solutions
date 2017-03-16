import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(checkPalindrome(str));
    }
    
    static String checkPalindrome(String str) {
        int n = str.length();
        
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return "No";
            }
        }
        return "Yes";
    }
}
