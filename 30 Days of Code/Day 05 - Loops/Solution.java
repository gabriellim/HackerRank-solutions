import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 1; i <= 10; i++) {
            String result = String.format("%d x %d = %d", n, i, n*i);
            System.out.println(result);
        }
        scan.close();
    }
}
