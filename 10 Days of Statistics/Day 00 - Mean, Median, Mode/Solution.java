import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            
            arr[i] = x;
            sum += x;
        }
        scan.close();
        
        Arrays.sort(arr);
        
        printMean(sum, n);
        printMedian(arr, n);
        printMode(arr);
    }
    
    public static void printMean(int sum, int n) {
        double mean = (double)sum/n;
        String result = String.format("%.1f", mean);
        System.out.println(result);
    }
    
    public static void printMedian(int[] arr, int n) {
        double median = -1;
        if (n%2 == 0) {
            median = (double)(arr[n/2 -1] + arr[n/2]) / 2;
        }
        else {
            median = arr[(n-1) / 2];
        }
        String result = String.format("%.1f", median);
        System.out.println(result);
    }
    
    public static void printMode(int[] arr) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int mode = arr[0], maxOccurance = 1;
        for (int x : arr) {
            if (hmap.containsKey(x)) {
                int val = hmap.get(x);
                int newVal = val += 1;
                hmap.put(x, newVal);
                
                if (newVal > maxOccurance) {
                    maxOccurance = newVal;
                    mode = x;
                }
            }
            else {
                hmap.put(x, 1);
            }
        }
        System.out.println(mode);
    }
}