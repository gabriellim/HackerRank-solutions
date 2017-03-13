import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            int n = Integer.parseInt(scan.nextLine());
            System.out.println(n);
        }
        catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
        
        scan.close();
    }
}