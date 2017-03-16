import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        int[] arr = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            arr[i] = num;
            sum += num;
        }
        scan.close();
        
        double mean = (double)sum/n;
        double sqrdDist = getsqrdDist(arr, mean);
        double stDev = getstDev(sqrdDist, n);
        
        String result = String.format("%.1f", stDev);
        System.out.println(result);
    }
    
    static double getsqrdDist(int[] arr, double mean) {
        double sqrdDist = 0;
        for (int num : arr) {
            sqrdDist += Math.pow((double)(num - mean), 2);
        }
        return sqrdDist;
    }
    
    static double getstDev(double sqrdDist, int n) {
        return (double)Math.sqrt(sqrdDist/n);
    }
}