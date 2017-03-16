import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = sortedArrayBuilder(scan, n);
        getQuartiles(arr);
    }
    
    static int[] sortedArrayBuilder(Scanner scan, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }
    
    static void getQuartiles(int[] arr) {
        int n = arr.length;
        int Q1, Q2, Q3;
        
        Q2 = getMedian(arr);
       
        int[] left,right;
        if (n % 2 == 0) {
            left = Arrays.copyOfRange(arr, 0, n/2);
            right = Arrays.copyOfRange(arr, n/2, n);
        }
        else {
            left = Arrays.copyOfRange(arr, 0, (n-1)/2);
            right = Arrays.copyOfRange(arr, (n-1)/2 + 1, n);
        }
        Q1 = getMedian(left);
        Q3 = getMedian(right);
        
        displayQuartiles(Q1, Q2, Q3);
    }
    
    static int getMedian(int[] arr) {        
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n/2] + arr[n/2 - 1]) / 2;
        }
        else {
            return (arr[(n-1)/2]);
        }
    }
    
    static void displayQuartiles(int Q1, int Q2, int Q3) {
        System.out.println(Q1);
        System.out.println(Q2);
        System.out.println(Q3);
    }
    
}