import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        scan.close();
        
        int max = 0, count = 0;
        while (n > 0) {
            int remainder = n%2;
            n = n/2;
            
            if (remainder == 1) {
                count += 1;
            }
            else {
                count = 0;
            }
            
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}