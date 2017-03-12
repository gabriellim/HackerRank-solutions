import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int[] revArr = reverseArr(arr);
        printArr(revArr);
        
        scan.close();
    }
    
    public static int[] reverseArr(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    
    public static void printArr(int[] arr) {
        if (arr.length >= 1) {
            System.out.print(arr[0]);
        }
        
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
