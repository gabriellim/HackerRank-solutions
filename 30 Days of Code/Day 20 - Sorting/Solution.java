import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        
        int[] arr = new int[n];
        for (int h = 0; h < n; h++) {
            int num = scan.nextInt();
            arr[h] = num;
        }
        
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (arr[j] > arr[j + 1]) {
                    // Swap(a[j], a[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        System.out.println(String.format("Array is sorted in %d swaps.", numberOfSwaps));
        System.out.println(String.format("First Element: %d", arr[0]));
        System.out.println(String.format("Last Element: %d", arr[n-1]));
    }
}