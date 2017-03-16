import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();
        scan.close();
        
        int wordsLength = A.length() + B.length();
        System.out.println(wordsLength);
        
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        String titleA = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String titleB = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(titleA + " " + titleB);
    }
}
